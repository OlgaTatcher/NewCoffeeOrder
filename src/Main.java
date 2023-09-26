import coffeeOrder.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrders=new CoffeeOrderBoard();
        coffeeOrders.add("Monica");
        coffeeOrders.add("Ross");
        coffeeOrders.add("Rachel");

        coffeeOrders.draw();
        coffeeOrders.draw();

        coffeeOrders.deliver();
        coffeeOrders.deliver();

        coffeeOrders.deliverByNumber(12);


    }


}