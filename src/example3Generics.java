public class example3Generics {
    public static void main(String[] args) {
//        Box<String > b1=new Box<>("shweta");
//        Box<Integer> b2=new Box<>(15);
//        Box<Double> b3=new Box<>(22.3);

//        System.out.println(b1.getValue());
//        System.out.println(b2.getValue());
//        System.out.println(b3.getValue());



//        Pair<Integer ,String > p=new Pair<>(1 , " : Shweta");
//        Pair<String ,Boolean> p1=new Pair<>("smart : " , true);

//        System.out.print( p.getKey());
//        System.out.println(p.getValue());
//        System.out.print(p1.getKey());
//        System.out.println( p1.getValue());



//        printPair( 1 , "Shweta");
//        printPair("Hello" ,"World" , "Shweta");
//        printPair(1 ,10.5 ,22);




//       Tesla teslaCar=new Tesla();
//       teslaCar.accelerate();
//



    }
    //generic method overloading
    public static  <K,V> void  printPair (K first ,V second){
        System.out.println( "key : " + first +" ,  value : " + second);
    }


    public static  <K,V,T> void  printPair (K first ,V second ,T third){
        System.out.println( "key : " + first +" ,  value : " + second + " , Third : " + third);
    }

    public static  <K,V extends  Number> void  printPair (K first ,V second){
        System.out.println( "key : " + first +" ,  value : " + second);
    }
}
//generic class
class  Box<T> {
   private final T value ;

   Box(T value){
       this.value=value;
   }

   public   T getValue(  ){
       return value;
   }
}
class Pair<K ,V> {
    K first;
    V second;

    Pair(K first ,V second){
        this.first=first;
        this.second=second;
    }
    public K getKey () {
        return first;
    }

    public   V getValue () {
        return second;
    }
}





