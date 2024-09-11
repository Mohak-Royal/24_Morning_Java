class Calc{

    protected void add(int a , int b){
        System.out.println("This is method of Parent class (Calc)");
        System.out.println("The addition of: " + a + "and " + b + " is: " + (a+b));
    }

}


class ScientificCalc extends Calc{

    @Override
    public void add(int a , int b){
        System.out.println("This is method of Child class (Scientific Calc)");
        System.out.println("The addition of: " + a + "and " + b + " is: " + (a+b));
    }

}



public class MethodOverriding {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add(10, 20);

        System.out.println();

        ScientificCalc sc = new ScientificCalc();
        sc.add(50, 50);


        Calc c1 = new ScientificCalc();

        c1.add(5, 5);
    }
    
}




// private

// protected

// default

// public










// Task: Vehicle Rental System
// Scenario:
// You are building a basic Vehicle Rental System. The system should handle different types of vehicles (Cars, Bikes, and Trucks) with a focus on calculating the rental cost for each type of vehicle. The rental cost is calculated based on the number of days and the type of vehicle.

// Instructions:
// Create a superclass Vehicle:

// Fields: vehicleId, baseRentalRate.
// Methods:
// calculateRentalCost(int days) – calculates rental cost by multiplying baseRentalRate by days.
// Overload calculateRentalCost(int days, boolean hasDriver) – this method adds a fixed charge for a driver if hasDriver is true.
// Constructor to initialize vehicleId and baseRentalRate.
// Create subclasses Car, Bike, and Truck:

// Override the calculateRentalCost(int days) method in each subclass to apply different rental cost formulas specific to the vehicle type:
// Car: Apply a discount for rentals longer than 7 days.
// Bike: Apply a discount if the number of days exceeds 3.
// Truck: Apply a surcharge for heavy-duty trucks.
// Method Overloading:

// Overload the calculateRentalCost() method in each subclass to handle extra parameters, such as adding an additional charge for special features (like GPS or insurance).
// Main Class (Test class):

// Create objects of Car, Bike, and Truck.
// Call the overloaded and overridden methods to calculate rental costs.
// Output the final rental cost for each vehicle based on different scenarios.