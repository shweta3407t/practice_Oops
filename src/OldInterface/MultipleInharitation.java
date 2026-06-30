package OldInterface;

public class MultipleInharitation {
    public static void main(String[] args) {
        A a=new D();
//        a.fun();


        Z z=new Z();
        //z.fun();

        StreetDog x=new StreetDog() ;
         x.walk();
         x.bark();


    }
}
interface A{
    void fun();
}
interface B extends  A{

      default void  fun(){
        System.out.println("B");
    }
}
interface C extends  A{
    default void fun(){
        System.out.println("C");
    }
}
class D implements B,C{

    @Override
    public void fun() {
        B.super.fun();
        C.super.fun();
        System.out.println("D ");
    }
}

//java Resolution
interface X{
    default  void fun(){
        System.out.println("inside x  interface");
    }
}

class Y{
      public  void fun(){
        System.out.println("INSIDE Y CLASS");
    }
}

class Z extends Y implements  X{

    @Override
    public void fun() {
        System.out.println("inside Z class");
        X.super.fun();


    }
}

//interface inharitance
interface  Animal{
    void walk();

}
interface Dog extends  Animal{
    void  bark();
}

class StreetDog implements  Animal ,Dog{

    @Override
    public void bark() {
        System.out.println("Street dog barking ");
    }

    @Override
    public void walk() {
        System.out.println("street dog walking");

    }
}



















