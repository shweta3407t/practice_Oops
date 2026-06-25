public class Example4Generics {
    public static void main(String[] args) {
//    Vehicles v1=new Vehicles();
//    v1.colour=" white";
//    v1.display();
//    v1.walkOnWheel();
//
//    System.out.println();
//    Vehicles v2=new Cycles();
//    v2.colour="pink";
//    v2.display();
//    v2.walkOnWheel();
//
//    System.out.println();
//    Cycles c=new Cycles();
//    c.colour="blue";
//    c.display();
//    c.walkOnWheel();
//
//    System.out.println();
//    TeslaCar t=new TeslaCar();
//    t.colour="pink";
//    t.display();
//    t.autoDrive();
//    t.walkOnWheel();


    }
}

//class Vehicles{
//    String colour;
//    void display(){
//        System.out.println("displaying Vehicle colour : " + colour);
//    }
//
//    public void walkOnWheel(){
//        System.out.println("vehicle walk on wheels");
//    }
//}
//
//class Cycles extends Vehicles{
//    @Override
//    public void walkOnWheel(){
//        System.out.println("cycle walk on  2 wheels");
//    }
//}
//
//interface Drive{
//    void autoDrive();
//}
//
//class TeslaCar extends Vehicles implements  Drive{
//
//    @Override //from Drive interface
//    public void autoDrive() {
//        System.out.println("Tesla car can auto drive");
//    }
//
//    @Override //from Vehicles class
//    public void walkOnWheel(){
//        System.out.println("Tesla car walk oon 4 Wheels");
//    }
//}



class Vehicles{
    String colour;
    void display(){
        System.out.println("displaying Vehicle colour : " + colour);
    }

    public void walkOnWheel(){
        System.out.println("vehicle walk on wheels");
    }
}

class Cycles extends Vehicles{
    @Override
    public void walkOnWheel(){
        System.out.println("cycle walk on  2 wheels");
    }
}

interface Drive{
    void autoDrive();
}

class TeslaCar extends Vehicles implements  Drive{

    @Override //from Drive interface
    public void autoDrive() {
        System.out.println("Tesla car can auto drive");
    }

    @Override //from Vehicles class
    public void walkOnWheel(){
        System.out.println("Tesla car walk oon 4 Wheels");
    }
}

