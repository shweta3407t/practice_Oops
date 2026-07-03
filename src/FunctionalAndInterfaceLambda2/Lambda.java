package FunctionalAndInterfaceLambda2;

//public class Lambda {
//    static void main() {
//        Addition a=new Addition();
//        a.calculate(22 ,22);
//
//
//    }
// }
//interface Calculator{
//    void calculate(int a ,int b);
//}
//class Addition implements Calculator{
//
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}




//public  class Lambda{
//    static void main() {
//        Calculator c=(a ,b) -> a+b;
//        print(2 ,4,c);
//
//    }
//    public  static  void  print(int a , int b , Calculator c){
//        System.out.println(  c.calculate(a,b));
//    }
//}
//
//interface  Calculator{
//    int  calculate(int a,int b);
//}


import java.util.*;
 import java.util.function.*;

public class Lambda {
    static void main() {
        //lambda expression->
        // 1. functional  : T -> R
        Function<Integer ,Integer> square=x ->  x*x;
        System.out.println(square.apply(5));

        //2.consumer : T -> void
        //Consumer <String> c=x -> System.out.println(x);
        Consumer< String> c= System.out::println;
        c.accept("My name is Shweta");

        //3. Supplier : void -> T
        //Supplier<Double> randomValue=() ->  Math.random();
        Supplier<Double> randomValue=  Math :: random;
        System.out.println(randomValue.get());

        //4. predicate :  T -> boolean
        Predicate<Integer> p=x -> x%2==0;
        System.out.println(p.test(3));

        List<Integer> list =new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
//        for(Integer i : list){
//            System.out.println(i);
//        }

//        list.forEach(x -> System.out.println(x));

        //method reference
        list.forEach(System.out :: println);



    }
}
