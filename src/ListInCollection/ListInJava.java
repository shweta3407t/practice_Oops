package ListInCollection;

import java.util.*;

public class ListInJava{
    static void main() {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

//        list.remove(5);
//        list.removeAll(List.of(4,5,6));
//        list.addAll(List.of(4,5,6,7,8,9));
//
//        System.out.println(list);
//
//        ListIterator<Integer> it=list.listIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        ListIterator<Integer> it=list.listIterator(4);
//        while (it.hasPrevious()){
//            System.out.println(it.previous());
//        }

        List<Integer> l=List.of(1,2,3,4,5,6,7,8,9,10);
        l.add(11);




    }
}
