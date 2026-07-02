package hashMap;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        //constructor of hashMap /LinkedHashMap
        Map<Integer ,String > map=new HashMap(Map.of(1,"shweta" ,2,"payal" ,3,"nidhi" ,4 ,"raj"));


//        HashMap<String ,Integer> h2=new HashMap(100);
//        HashMap<String ,String> h3=new HashMap<>(100 , 0.8f);
//        HashMap<Integer ,String> h4=new HashMap<>( Map.of(  1,"dev",2,"Raj" ));
//        System.out.println(h4);
//
//
//        HashMap<String ,Integer> h5=new LinkedHashMap<>();
//        HashMap<String ,Integer> h6=new LinkedHashMap<>(100);
//        HashMap<String ,String> h7=new LinkedHashMap<>(100 , 0.8f);
//        HashMap<Integer ,String> h8=new HashMap<>( Map.of(  1,"nidhi",2,"rami" ));
//        System.out.println(h8);

        //methods
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("raj"));
        map.remove(3);
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());

        Set<Map.Entry<Integer , String>> entries=map.entrySet();
        System.out.println(entries );
        System.out.println(map);

        System.out.println(map.getOrDefault(5 ,"key not exist"));

        System.out.println(map.putIfAbsent(3,"dev"));
        System.out.println(map);


    }
}
