package nestedClass;

public class NestedClass {
    public static void main(String[] args) {
//        Outer.Inner inner=new Outer.Innner();
//        inner.fun();
//        BankAccount b=new BankAccount();
//        b.calculateInterest();


//        ///2.inner class
//        //kOuter.Inner =new outer.new Inner();
//        Outer outer=new Outer();
//       Outer.Inner inner =outer.new Inner();
//       inner.fun();
//
//       Outer.fun2();


        //3 .anonymous class
        Person p=new Person();
        p.introduce();

        Person p2=new Person()  {
            @Override
            void introduce( ){
                System.out.println("hi i am guest");
                greet();
            }

            void greet() {
                System.out.println("welcome shweta");
            }
        };
        p2.introduce();




     }
}
//// 1. static nested class
//class Outer{
//    static  int x=10;
//    int y=20;
//    static class Inner{
//        void fun(){
//
//            //can access static variable
//            System.out.println(x);
//            //can not access static variable can access through constructor
//            //System.out.println(y);
//        }
//    }
//}
//
//class BankAccount{
//    private  static class InterestCalculator {
//        static double calculateYearly(double principle, double rate) {
//            return principle * rate;
//        }
//    }
//
//    public  double calculateInterest(){
//        return InterestCalculator.calculateYearly(100000 , 2);
//    }
//
//}

//2. inner class

class Outer{
  int x=10;
    static  int y=20;
    class Inner{
        int x=20;

        int y=30;

        void fun(){
            //print inner x
            System.out.println( x);
            //print outer x
            System.out.println(Outer.this.x);

            System.out.println(y);
            System.out.println(Outer.y);
        }

    }

    static  void fun2(){
        System.out.println("shweta");
    }
}

//anonymous
class Person{
    void introduce(){
        System.out.println("hi  i am person");
    }
}
