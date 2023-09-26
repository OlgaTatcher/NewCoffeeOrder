package coffeeOrder;

import java.util.ArrayDeque;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orders;
    private static int Order = 1;

    public CoffeeOrderBoard() {
        orders=new ArrayDeque<>();
    }

    public void add(String Client) {
        Order order = new Order(Order,Client);
        orders.add(order);
        Order++;

    }

    public void  deliver() {
        if (!orders.isEmpty()) {
            coffeeOrder.Order requiredOrder=orders.poll();
            System.out.println("Required order "+requiredOrder.getOrderNumber()+" "+requiredOrder.getClient());
        }else{
            System.out.println("No orders to deliver.");
        }
    }

    public void  deliverByNumber(int orderNumber) {
        boolean foundOrder=false;
        for (Order order : orders) {
            if(order.getOrderNumber()==orderNumber){
                orders.remove(order);
                System.out.println("Issuing an order: "+order.getOrderNumber()+" "+order.getClient());
                foundOrder=true;
                break;
            }

        }
        if (!foundOrder){
            System.out.println("No orders to deliver.");
        }
    }

    public void draw() {
        System.out.println("Current orders: ");
        for (Order order : orders) {
            System.out.println("Order: "+order.getOrderNumber()+" Client: "+order.getClient());

        }
    }



}
