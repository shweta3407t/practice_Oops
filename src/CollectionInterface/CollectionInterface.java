package CollectionInterface;
 import java.util.*;

public class CollectionInterface {
    static void main(String[] args) {
        Collection<Integer> c=new LinkedList<>();

        c.add(1);
        c.add(4);
        c.add(3);
        c.add(7);
        c.add(5);
        c.add(2);

        //methods in collection interface

        System.out.println(c.size());
        System.out.println(c.isEmpty());

        System.out.println(c.contains(22));

        System.out.println(c.iterator());

         Object[] value =c.toArray();
         for(Object obj : value){
             System.out.println(obj);
         }

        Integer[] arr=c.toArray(Integer[]::new);
        for(Integer i : arr){
            System.out.println(i);
        }


        boolean b=c.add(6);
        System.out.println(b);

        System.out.println(c.remove(6));
        System.out.println(c);

        c.addAll(List.of( 8,9,10));
        System.out.println(c);

        c.removeAll(List.of(2,4));
        System.out.println(c);

        c.retainAll(List.of( 1,2,3,4,5,6,7));
        System.out.println(c);












    }
}
