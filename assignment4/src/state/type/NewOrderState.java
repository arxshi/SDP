package state.type;

import state.Order;
import state.State;

public class NewOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order paid.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped; it hasn't been paid yet.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered; it hasn't been paid yet.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled.");
        order.setState(new CancelledOrderState());
    }
}


