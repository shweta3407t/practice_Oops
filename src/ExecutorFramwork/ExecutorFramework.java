package ExecutorFramwork;

 import java.util.List;
 import java.util.concurrent.*;

public class ExecutorFramework {

    static void main() throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executer= Executors.newFixedThreadPool(2 );
//
//          for(int i =1 ; i<6 ; i++){
//              int taskId=i;
//              executer.execute(() -> {
//                  System.out.println("Task " + taskId + " ------ "+ Thread.currentThread().getName());
//              });
//          }
//
//        //Future and Callable
//        Future<Integer> f =executer.submit(() -> 22);//give synchronize output
//        System.out.println(f.get());
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


        Future<Integer> f1 =executer.submit(() -> 5/0);//give synchronize output
        System.out.println(f1.get());//can  not catch exception
        try{
            System.out.println(f1.get());//can not catch exception
        } catch (Exception e) {
            System.out.println( "catch future exception "+e);//it will not appear
        }

        //3 overloaded methods
        //submit with callable
        Future<Integer> f2 =executer.submit((  ) ->  (10)  );//give synchronize output
        System.out.println(f2.get());;

        //submit with Runnble
        Future<Integer> f3=executer.submit(() -> System.out.println("shweta") , 2);
        System.out.println(f3.get());

        //submit with Runnable with predefined result
        Future<String> f4=executer.submit(() -> System.out.println("Microsoft") , "sucessfull");

        if(f4.isDone()){
          f4.get(2 , TimeUnit.SECONDS);
        }

        f4.cancel(true);

        System.out.println(f4.isCancelled());

        executer.shutdown();




        //SchedularExecutorThreadPool
        ScheduledExecutorService s=Executors.newScheduledThreadPool(3);
        s.schedule(() -> System.out.println("shweta")  , 2, TimeUnit.SECONDS);

         s.schedule(( ) -> System.out.println("payal"), 1 ,   TimeUnit .SECONDS);
         s.shutdown();






         //CompletableFuture  it does not stop the main thread
        CompletableFuture<Integer> c1=CompletableFuture.supplyAsync(() -> 188)
                .thenApply( x -> x+(100-x));
//                .thenAccept( x -> Math.random());

        CompletableFuture<Integer> c2=CompletableFuture.supplyAsync(() -> 144)
                .thenApply(x -> x+(200-x));
//                .thenRun(() -> Math.random());

        CompletableFuture<Integer>  result=c1.thenCombine(c2 , (a,b) -> a+b);
        System.out.println(result.get());




    }
}
