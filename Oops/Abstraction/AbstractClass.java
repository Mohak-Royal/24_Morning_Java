// Abstraction is one of the four pillars of Object-Oriented Programming (OOP) and refers to the concept of hiding the internal implementation details and exposing only the essential features or functionalities. In simple terms, abstraction allows us to focus on what an object does, rather than how it does it.


abstract class Payment{
    
    abstract void makePayment(double amount);

    void transactionDetails(){
        System.out.println("Transaction in process...");
    }
}

class CreditCardPayment extends Payment{
    @Override
    void makePayment(double amount){
        System.out.println("Credit Card Payment of " + amount + " completed");
    }
}

class PayPalPayment extends Payment{
    @Override
    void makePayment(double amount){
        System.out.println("PayPal Payment of " + amount + " completed");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.transactionDetails();
        payment.makePayment(150);

        System.out.println();
        System.out.println();
        System.out.println();


        Payment payment2 = new PayPalPayment();
        payment2.transactionDetails();
        payment2.makePayment(1000);
    }
    
}




// You are tasked with developing a vehicle rental system where users can rent different types of vehicles (like cars, trucks, and bikes). Each vehicle has different rental rates and features.

// Requirements:
// Create an abstract class Vehicle with an abstract method calculateRental().
// Create concrete classes Car, Truck, and Bike, each implementing the calculateRental() method to calculate the rental cost based on vehicle type.
// In the Vehicle class, create a non-abstract method rentalInfo() that prints common details about the rental.
// Create instances of each vehicle type and calculate the rental cost for a specified number of days.




// You are developing an e-commerce system where customers can place orders for physical products, digital products, and services. Each type of product has a different shipping or delivery mechanism.

// Requirements:
// Create an abstract class Order with the following abstract methods:
// calculateTotalPrice()
// deliver()
// Create concrete classes PhysicalProduct, DigitalProduct, and Service that inherit from Order. Each class should implement the calculateTotalPrice() and deliver() methods differently.
// In the main method, create instances of each product type and demonstrate how the system calculates the total price and manages delivery.