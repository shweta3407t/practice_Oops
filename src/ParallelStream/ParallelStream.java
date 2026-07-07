package ParallelStream;

import java.util.*;

public class ParallelStream {
    static void main() {
        List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5));
//        list.stream()
//                .map(x -> x*2)
//                .forEach(System.out::println);

        list.parallelStream() //Multithreading
                . mapToInt(x -> x+1)
                .forEach(System.out::println);
    }
}
