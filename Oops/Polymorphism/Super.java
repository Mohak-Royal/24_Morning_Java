// Super Keyword is used to refer immediate parent class.
// -> instance variable
// -> method
// -> constructor

class Animal{
    String name , color;
    int age = 10;

    Animal(String name , String color){
        this.name = name;
        this.color = color;
    }

    void display(){
        System.out.println("My animal's name is: " + name + " and it's color is: " + color);
    }

}

class Dog extends Animal{

    Dog(String name , String color){
        super(name, color); // construtor
    }

    void display(){
        super.display(); // method
        System.out.println("Age: " + super.age);  //variable
    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", "Brown");


        d.display();
    }
}


// Write a Java program where:

// You create a parent class Person that has a constructor taking name and age as arguments and prints these values.
// Create a subclass Employee that extends Person and uses the super() keyword to call the parent class constructor.
// The Employee class should also take salary as a parameter and print it.


// Create a parent class Animal that has a method makeSound() which prints "Animal makes sound".

// Create a subclass Dog that overrides the makeSound() method to print "Dog barks".
// Inside the Dog class's makeSound() method, call the parent class's makeSound() method using super to demonstrate how both the parent and child methods can be called



// Create a parent class ParentClass that has a final method display() which prints "This is a final method from ParentClass".

// Create a subclass ChildClass that tries to override the display() method (this should generate a compile-time error).
// In the ChildClass, create a new method called show() that uses the super keyword to call the display() method of the parent class.