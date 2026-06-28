package nestedClass;

public class NestedClass {
    public static void main(String[] args) {
        Outer.Innner inner=new Outer.Innner();
        inner.fun();

        BankAccount b=new BankAccount();
        b.calculateInterest();

     }
}
// 1. static nested class
class Outer{
    static  int x=10;
    int y=20;
    static class Innner{
        void fun(){

            System. out.println("hello Inner");
            //can access static variable
            System.out.println(x);
            //can not access static variable can access through constructor
            //System.out.println(y);
        }
    }
}

class BankAccount{
    private  static class InterestCalculator {
        static double calculateYearly(double principle, double rate) {
            return principle * rate;
        }
    }

    public  double calculateInterest(){
        return InterestCalculator.calculateYearly(100000 , 2);
    }

}
//2. inner class

