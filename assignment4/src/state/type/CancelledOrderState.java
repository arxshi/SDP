package state.type;

import state.Order;
import state.State;

public class CancelledOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order cannot be paid; it has been cancelled.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped; it has been cancelled.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered; it has been cancelled.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}
