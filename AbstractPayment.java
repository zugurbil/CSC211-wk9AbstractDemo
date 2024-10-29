//Abstract class for Payment
public abstract class AbstractPayment {
 protected double amount;
 protected String currency;

 public AbstractPayment(double amount, String currency) {
     this.amount = amount;
     this.currency = currency;
 }

 // Abstract method to process payment (to be implemented by subclasses)
 public abstract void processPayment();

 // A concrete method that can be shared by all payment methods
 public void printReceipt() {
     System.out.println("Payment of " + amount + " " + currency + " has been processed.");
 }
}

//CreditCard payment subclass
class CreditCardPayment extends AbstractPayment {
 private String cardNumber;
 private String cardHolderName;

 public CreditCardPayment(double amount, String currency, String cardNumber, String cardHolderName) {
     super(amount, currency);
     this.cardNumber = cardNumber;
     this.cardHolderName = cardHolderName;
 }

 @Override
 public void processPayment() {
     // Specific implementation for credit card payment
     System.out.println("Processing credit card payment for " + cardHolderName);
     // ... (additional logic here)
     printReceipt();
 }
 
}
//PayPal payment subclass
class PayPalPayment extends AbstractPayment {
 private String email;

 public PayPalPayment(double amount, String currency, String email) {
     super(amount, currency);
     this.email = email;
 }

 @Override
 public void processPayment() {
     // Specific implementation for PayPal payment
     System.out.println("Processing PayPal payment for " + email);
     // ... (additional logic here)
     printReceipt();
 }
}

