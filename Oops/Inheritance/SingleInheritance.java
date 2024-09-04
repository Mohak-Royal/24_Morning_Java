// one parent and one child

class Father{
    double property;

    Father(){
        this.property = 1_00_000;
    }
}


class Child extends Father{
    void display(){
        System.out.println("property i have is: " + property);
    }
}


public class SingleInheritance {

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

