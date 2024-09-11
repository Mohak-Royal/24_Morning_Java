class DiwaliBonus{

    public void diwaliBonus(String name , int bonus){
        System.out.println("Happy Diwali! " + name + " ,  you got bonus of " + bonus);
    }


    public void diwaliBonus(String name , double bonus){  // datatype of argument
        System.out.println("Happy Diwali! " + name + " ,  you got bonus of " + bonus);
    }

    public void diwaliBonus(String name , int bonus , String msg){  // number of arguments
        System.out.println("Happy Diwali! " + name + " ,  you got bonus of " + bonus + " Msg: " + msg);
    }
}


class MethodOverloading {
    public static void main(String[] args) {
        DiwaliBonus d1 = new DiwaliBonus();

        d1.diwaliBonus("Mohak" , 1000 , "Enjoy");
    }
    
}

// 1. number of argument
// 2. Datatype of argument