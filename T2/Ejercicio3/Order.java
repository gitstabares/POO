package T2.Ejercicio3;

public class Order {
    private int orderId;
    private Customer customer;
    private String description;
    Order(int orderId, Customer customer, String description) {
        this.orderId = orderId;
        this.customer = customer;
        this.description = description;
    }
    public int getOrderId() {
        return orderId;
    }
    public Customer getCustomer() {
        return customer;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
