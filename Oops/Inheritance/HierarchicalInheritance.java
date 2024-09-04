class BMW_M5{
    String model;
    double price;
    int year;

    BMW_M5(){
        model = "M5";
        price = 280_000;
        year = 2018;
    }

    void display(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}


class Mansory extends BMW_M5{
    int horsePower;
    String body;
    String wheel;

    Mansory(int horsePower , String body , String wheel){
        super.model = "M5 Mansory";
        super.price = 300_000;
        this.horsePower = horsePower;
        this.body = body;
        this.wheel = wheel;
    }

    void display(){
        super.display();
        System.out.println("Horse Power: " + horsePower);
        System.out.println("Body Type: " + body);
        System.out.println("Wheel Type: " + wheel);
    }
}



class RoCars extends BMW_M5{
    int tourque;
    String color;
    String interior;

    RoCars(int tourque , String color , String interior){
        super.model = "M5 Rocars";
        super.price = 310_000;
        this.tourque = tourque;
        this.color = color;
        this.interior = interior;
    }

    void display(){
        super.display();
        System.out.println("Tourque: " + tourque);   
        System.out.println("Color: " + color);   
        System.out.println("Interior: " + interior);   
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mansory m5m = new Mansory(1000, "Carbon fiber", "Alloy Wheel");
        m5m.display();

        System.out.println();
        System.out.println();
        System.out.println();

        RoCars m5r = new RoCars(1360, "Carbon fiber Black", "Alkantara Lether");
        m5r.display();
    }
}