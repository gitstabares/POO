package T2.Ejercicio3;

public class TestOrder {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alejandro Gaviria", "algaviriar@gmail.com");
        Order order1 = new Order(0001, customer1, "Colección de libros de ciencia");
        System.out.println("Orden ID: " + order1.getOrderId());
        System.out.println("Cliente: " + order1.getCustomer().getName());
    }
}
