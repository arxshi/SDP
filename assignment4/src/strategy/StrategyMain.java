package strategy;

public class StrategyMain {
    public static void main(String[] args) {

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9101-1121", "John Doe");
        ShoppingCart cart = new ShoppingCart(creditCardPayment);
        cart.checkout(100.0);

        PaymentStrategy paypalPayment = new PayPalPayment("john.doe@example.com");
        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(200.0);

        PaymentStrategy cryptoPayment = new CryptoPayment("abc123xyz456wallet");
        cart.setPaymentStrategy(cryptoPayment);
        cart.checkout(300.0);
    }
}
