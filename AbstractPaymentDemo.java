public class AbstractPaymentDemo {
    public static void main(String[] args) {
        AbstractPayment creditCardPayment = new CreditCardPayment(100, "USD", "1234567890123456", "John Doe");
        creditCardPayment.processPayment();

        AbstractPayment payPalPayment = new PayPalPayment(50, "USD", "john@example.com");
        payPalPayment.processPayment();
        
    }
}

