

public class Inharitance {

}
class Animals{

    public Animals(){
        System.out.println("animal constructor called");
    }

    public void walk(){
        System.out.println("can walk");
    }

    public void eat(){
        System.out.println("can eat");

    }

    public  void  hello(){
        System.out.println();
    }
}

class  Cat extends Animals{

    //eat --ovearrid
    //walk
    //hello --override

    public Cat(){
        System.out.println("cat constructor called");
    }

    public void  eat(){
        System.out.println("cat can eat fish also ");
    }
    public  void  hello(){
        System.out.println("cat override hello ");
    }

}

class  Dog extends Animal {

    //eat
    //walk
    //hello --override

    public Dog(){
        System.out.println(" Dog constructor called");
    }
    public  void  hello(){
        System.out.println("dog override hello");
    }
}



