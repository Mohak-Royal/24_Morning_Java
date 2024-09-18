// an Instance Initialization Block (IIB) is a block of code that is executed when an object is created, just after the constructor call. It is used to initialize instance variables or perform any other initialization tasks that need to happen every time an object is created, regardless of which constructor is used.


class Shop{
    public String name;
    public double price;
    public String address;

    {
        System.out.println("This is IIB of Parent");
    }



    Shop(){
        System.out.println("This is a Shop");
    }

}


class Shopkeeper extends Shop{
    Shopkeeper(){
        super();
        System.out.println("Shopekeeper Class");
    }


    {
        name = "Gada Electronics";
        address = "Goregao East";
        price = 25000;

        System.out.println("IIB Called");
    }
}

public class IIB {
    public static void main(String[] args) {
        Shopkeeper sk = new Shopkeeper();
    }
}




// Create a class Account with attributes accountNumber and balance.

// The balance should be initialized to 1000 using an Instance Initialization Block (IIB).
// Write a method displayBalance() that prints the current balance.
// Ensure that when an Account object is created, the balance is set to 1000, and the displayBalance() method is automatically called using the IIB.




// Create a class Employee with attributes id, name, and salary.

// The id should be automatically generated for each employee by incrementing a static counter.
// Use an Instance Initialization Block (IIB) to set the initial value for salary to 50,000 for all employees.
// Create a constructor that accepts the name of the employee.


// Create a class Car that contains two Instance Initialization Blocks (IIBs).

// One IIB should initialize the speed of the car to 0.
// The other IIB should print a message saying, "A new car is ready!"