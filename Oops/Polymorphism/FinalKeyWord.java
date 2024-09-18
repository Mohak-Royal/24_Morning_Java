// Final Keyword : it is used to restrict some usage from the user.

// 1. variable : it will stop the change of value
// 2. method : it will stop method overriding
// 3. class : stop inheritance

// final class Car{
//     final int limit = 80;

//     int getLimit(){
//         return limit;
//     }

//     final void display(){
//         System.out.println("The Speed Limit is: " + limit);
//     }
// }


// class BMW extends Car{
    

//     // @Override
//     // void display(){
//     //     System.out.println("Bmw Speed Limit is: " + getLimit());
//     // }
// }


// public class FinalKeyWord {
//     public static void main(String[] args) {
//         BMW bmw = new BMW();

//         // bmw.limit = 100;
//         bmw.display();
//     }
// }



// Create a class Vehicle that has a final method called fuelCapacity() which prints "Fuel Capacity: 50 liters".

// Create a subclass Car that tries to override the fuelCapacity() method (this should not be allowed since it is final).
// In the Car class, create another method called displayDetails() that prints "This is a car".




// Write a Java program where:

// You create a method calculateArea() in a class Rectangle that takes the length and breadth as parameters.
// Inside the method, declare a final local variable area to store the result of length * breadth.
// After calculating the area, print the value.



// Create a class Address with two instance variables: street and city.

// Create another class Person with a final reference variable address of type Address.
// In the constructor of Person, assign an Address object to the address variable.
// Try to change the reference of address in the Person class (which should not be allowed), but modify the individual attributes of address (which should be allowed).