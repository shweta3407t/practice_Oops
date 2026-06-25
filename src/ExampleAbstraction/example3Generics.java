package ExampleAbstraction;

public class example3Generics {
    public static void main(String[] args) {
        Box<String > b1=new Box<>("shweta");
        Box<Integer> b2=new Box<>(15);
        Box<Double> b3=new Box<>(22.3);

        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
        System.out.println(b3.getValue());


        Pair<Integer ,String > p=new Pair<>(1 , " : Shweta");
        Pair<String ,Boolean> p1=new Pair<>("smart : " , true);

        System.out.print( p.getKey());
        System.out.println(p.getValue());

        System.out.print(p1.getKey());
        System.out.println( p1.getValue());




    }
}
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

    public K  getKey (){
        return first ;
    }

    public   V getValue () {
        return second;
    }
}