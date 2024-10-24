package state;

public class StateMain {
    public static void main(String[] args) {

        // initial state of order set in constructor
        // NewOrderState
        Order order = new Order();

        order.payOrder();
        order.shipOrder();
        order.deliverOrder();
        order.cancelOrder();

        Order anotherOrder = new Order();
        anotherOrder.cancelOrder();
        anotherOrder.payOrder();
    }
}

