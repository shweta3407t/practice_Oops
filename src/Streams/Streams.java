package Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    static void main() {
        //1. using collection
        List<Integer> l=new ArrayList<>(List.of(1,2,3,4,5,6,7));
        l.stream()
                .filter(x -> x>3)
                .map(x -> x*2)
                .forEach( System.out :: println);

        //2. using array
        String[] arr={"shweta" ,"payal" ,"kajal" ,"devi" ,"nidhi"};
         Stream<String> s= Arrays.stream(arr);
         s.limit(3).sorted().forEach(System.out :: println);

        //3. using Stream.of()
        Stream.of(6,32,544,66,74,66,8,81,21,32,44,86,73 ,42,35,2);

        //4. empty stream
        Stream.empty();


        //5. Infinite stream
        //iterate() --need depends on value(seed)
        Stream.iterate(1,x -> x+1)
                .limit(5)
                .forEach(System.out :: println);

        //generate()---no depends on value
        Stream.generate(Math :: random)
                .limit(5)
                .forEach(System.out :: println);



        //6.primitive stream




        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1 ,"shweta"));
        list.add(new Employee(2,"dev"));
        list.add(new Employee(3 ,"sam"));
        list.add(new Employee(4,"payal"));
        list.add(new Employee(5 ,"ram"));
        list.add(new Employee(6,"raj"));

        Stream<Employee> streaml=list.stream();
//        s.filter(x -> x<5 )
//                .forEach(System.out::println);
    }
}

class Employee{
    int id;
    String name;

    Employee( int id,String name){
        this.name=name;
        this.id=id;
    }

}
