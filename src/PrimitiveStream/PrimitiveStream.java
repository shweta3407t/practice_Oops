package PrimitiveStream;

 import java.util.stream.IntStream;
public class PrimitiveStream {
    static void main() {
        IntStream i=IntStream.of(22,44,88,334,43,55,44,55,66,77);
        i.filter(x -> x > 30)
                .distinct()
                . skip(1 )
                .boxed()
                 .forEach(System.out :: println);


    }
}
