package setInJava;


import java.util.*;

public class Sets {
    public static void main(String[] args) {
//        //Constructor of hashSet/LinkedHashSet
        Set<String> set=new HashSet<>();
        //capacity
        Set<String> set2=new HashSet<>(100);
        //capacity ,load facter
        Set<String> set3=new LinkedHashSet<>(100 , 0.8f);
        //using another collection
        Set<Integer> set4=new HashSet<>(List.of(1,26,4,53,43,57,6,3,42,35,342,4,6,43,13,2));
        System.out.println(set4);

        Set<String> set5=new HashSet<>();
        Set<String> set6=new HashSet<>(100);
        Set<String> set7=new LinkedHashSet<>(100 , 0.8f);
        Set<Integer> set8=new HashSet<>(List.of(1,26,4,53,43,57,6,3,42,35,342,4,6,43,13,2));
        System.out.println(set8);




        //constructor of treeMap/LinkedTreeMap -->
        Map<Integer,String> t1=new TreeMap<>();
        Map<Integer , String> t2=new TreeMap<>(Map.of(  1,"shweta",2,"payal" ));



        //constructor treeSet/LinkedTreeSet -->like BST
        TreeSet<String> s1=new TreeSet<>();
        TreeSet<Integer> s2=new TreeSet<>(List.of(1,26,4,53,43,57,6,3,42,35,342,4,6,43,13,2));
        System.out.println(s2);



//        //methods implement from Shorted set
//        System.out.println(s2.first());
//        System.out.println(s2.last());

        System.out.println(s2.headSet(35));//exclusive
        System.out.println(s2.tailSet(42));
        System.out.println(s2.subSet(2 ,35));

        //implement from nevigable set
        System.out.println(s2.higher( 3));
        System.out.println(s2.lower(4));
        System.out.println(s2.floor( 3));
        System.out.println(s2.ceiling( 4));

        System.out.println(s2.headSet(35 ,true));
        System.out.println(s2.tailSet(42 , false));
        System.out.println(s2.subSet(2  ,false, 35 ,true ));






    }
}





