public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        OrderInput orderInput = new OrderInput();
        Order order = orderInput.readFromConsole();
        
        OrderRepository orderRepository = new OrderRepository();
        orderRepository.saveToJson(order);
    }
}