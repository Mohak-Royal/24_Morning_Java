class GrandParent{
    String gname;

    GrandParent(String gname){
        this.gname = gname;
    }
}


class Parent extends GrandParent{
    String pname;

    Parent(String pname , String gname){
        super(gname);
        this.pname = pname;
    }
}


class Child extends Parent{
    String cname;

    Child(String cname , String pname , String gname){
        super(pname, gname);
        this.cname = cname;
    }

    void display(){
        System.out.println("(darji)"+cname + " " + pname + " " + gname);
    }
}




public class MultilevelInheritance {
    public static void main(String[] args) {
        Child c = new Child("Vishva", "Maheshkumar", "Babulal");


        c.display();
    }   
}
