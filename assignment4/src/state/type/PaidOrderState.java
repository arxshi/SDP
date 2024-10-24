package state.type;

import state.Order;
import state.State;

class PaidOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order shipped.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered; it hasn't been shipped yet.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled after payment.");
    }
}
