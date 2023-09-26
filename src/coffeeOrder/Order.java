package coffeeOrder;

public class Order {
    private int orderNumber;
    private String Client;

    public Order(int orderNumber, String client) {
        this.orderNumber = orderNumber;
        Client = client;
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", Client='" + Client + '\'' +
                '}';
    }

}
