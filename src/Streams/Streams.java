package Streams;

 import java.util.*;
  import java.util.stream.*;
  import java.util.stream.Stream;

public class Streams {
    static void main() {
        //object Stream
//        //1. using collection
//        List<Integer> l=new ArrayList<>(List.of(1,2,3,4,5,6,7));
//        l.stream()
//                .filter(x -> x>3)
//                .map(x -> x*2)
//                .forEach( System.out :: println);

        List<List<Integer>> list1=List.of(List.of(1,2),List.of(4,5) ,List.of(32,34,54,56,53,23,43,65,67,76,7,32,44,656,5566,43,5,54,534,23,1,34,334));
//        list1.stream()
//                .flatMap(x -> x.stream())
//                .filter(x -> x>=50)
//                .filter(x -> x%2 == 0)
//                .map(x -> x+1)
//                .peek(System.out :: println)
//                .limit(5)
//                .sorted((a,b) -> b-a)  //stateful
//                .distinct()
//                .skip(1)
//                .forEach(System.out :: println);


        List<Integer> list3=List.of(11,22,33,44,55);
//        int sum= list3.stream()
//                .peek(System.out::println)
//                .reduce(1,(x,y) -> x+y);
//        System.out.println(sum);
//
//
//        long num=list3.stream()
//                .filter(x -> x>20)
//                .count();
//        System.out.println(num);

//        Optional<Integer> num2=list3.stream()
//                .filter(x -> x> 10)  //short circuting
//                .findFirst();
//        System.out.println(num2.get());

//         boolean num3=list3.stream()
//                .filter(x -> x> 10)
//                .anyMatch(x -> x%2 != 0);
//        System.out.println(num3 );
//        //nonMatch
//        //allMatch

//        OptionalInt num4=list3.stream()
//                .filter(x -> x> 10)
//                .mapToInt(x -> x)
//                . max();
//        System.out.println( num4.getAsInt());


////       ##Collector interface
//        List<Integer> list4=new ArrayList<>(List.of(11,22,33,44)) ;
//
//         List<Integer> l =list4.stream()
//                 .map(x -> x+1)
//                .collect(Collectors.toList());
//        System.out.println(l);
        //set
        //map
//        List<String> list5=new ArrayList<>(List.of("AA" ,"BBB" ,"CCCC")) ;
//
//        Map<Integer ,String> map=list5.stream()
//                .collect(Collectors.toMap(
//                        x -> x.length(),
//                        y -> y
//                ));
//        System.out.println(map);

        //Grouping by()
        List<String> list6=new ArrayList<>(List.of("AA" ,"BBB" ,"CCCC" ,"SS" ,"EEE" ,"RRRR" ,"QQQQQ")) ;

        Map<Integer ,List<String>> mp=list6.stream()
                .collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(mp);















//        //2. using array
//        String[] arr={"shweta" ,"payal" ,"kajal" ,"devi" ,"nidhi"};
//         Stream<String> s= Arrays.stream(arr);
//         s.limit(3)
//                 .sorted()
//                 .forEach(System.out :: println);




//        //3. using Stream.of()
//        Stream.of(6,32,544,66,74,66,8,81,21,32,44,86,73 ,42,35,2);
//






//
//        //4. Infinite stream
//        //iterate() --need depends on value(seed)
//        Stream.iterate(1,x -> x+1)
//                .limit(5)
//                .forEach(System.out :: println);
//
//        //generate()---no depends on value
//        Stream.generate(Math :: random)
//                .limit(5)
//                .forEach(System.out :: println);





//          //5. empty stream
//        Stream.empty();
//


        //6.primitive stream





        //example
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
