package ExecutorFramwork;

 import java.util.List;
 import java.util.concurrent.*;

public class ExecutorFramework {

    static void main() throws ExecutionException, InterruptedException {
        ExecutorService executer= Executors.newFixedThreadPool(2 );
//
//          for(int i =1 ; i<6 ; i++){
//              int taskId=i;
//              executer.execute(() -> {
//                  System.out.println("Task " + taskId + " ------ "+ Thread.currentThread().getName());
//              });
//          }

        //Future and Callable
        Future<Integer> f =executer.submit(() -> 22);//give synchronize output
        System.out.println(f.get());
//
//        //invokeAll()
//        //invockAny()
//
//        List<Callable<Integer>> tasks= List.of(
//                () -> 11,
//                () -> 22,
//                () -> 33,
//                () -> 44,
//                () -> 55,
//                () -> 66 );
//        List<Future<Integer>> futures= executer.invokeAll(tasks);
//        for(Future<Integer> i : futures){
//            System.out.println(i.get());
//        }


//        executer.execute(() -> {
//            int x=4/0;
//            try{
//                System.out.println(x);//can catch exception
//            } catch (Exception e) {
//                System.out.println("catch execute exception" + e);
//            }
//        });
//
//
//        Future<Integer> f1 =executer.submit(() -> 5/0);//give synchronize output
//        System.out.println(f1.get());//can  not catch exception
//        try{
//            System.out.println(f1.get());//can not catch exception
//        } catch (Exception e) {
//            System.out.println( "catch future exception "+e);//it will not appear
//        }



        ScheduledExecutorService s=Executors.newScheduledThreadPool(3);
        s.schedule(() -> System.out.println("shweta")  , 2, TimeUnit.SECONDS);


          executer.shutdown();
    }
}
