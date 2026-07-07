package MultiThreading;

import java.util.stream.Collector;

public class MultiThreading {
    static void main() throws InterruptedException {
//        MyThread t1=new MyThread();
//        t1.start( );
//
//
//        MyRunnable r=new MyRunnable();
//        Thread t2=new Thread(r);
//        t2.start();
//
//        //lambda
//        Thread t3=new Thread(() -> System.out.println("lambda thread is running"));
//        t3.start();
//
//        Thread t4=new Thread( () -> {
//            System.out.println(Thread.currentThread().getName());
//        }) ;
//        t4.start();
//        t4.run();//it will show main thread name
//
//        Thread t5=new Thread(() -> {
//            for(int i=1 ; i< 10 ; i++){
//                if(i %2 == 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {}
//                    System.out.println( "t1 ="+i);
//                }
//            }
//        });
//        t5.start();
//
//        Thread t6=new Thread(() -> {
//            for(int i=1 ; i< 10 ; i++){
//                if(i %2 != 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {  }
//                    System.out.println( "t2 ="+i);
//                }
//            }
//        });
//        t6.start();
//
//
//
//        //ThreadLifeCycle
//        Thread mainThread=Thread.currentThread();
//        Thread t7=new Thread(() -> {
//            System.out.println("name of current thread : "+Thread.currentThread().getName());
//            System.out.println("name of main thread : "+mainThread.getState());
//        });
//
//        System.out.println(t7.getState());
//        t7.start();
//        System.out.println(t7.getState());
//
//        Thread.sleep(2000);
//        System.out.println(t7.getState());


////        //methods in Threads
//        System.out.println("main thread start");
//        Thread t8=new Thread( () ->  {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {}
//            System.out.println("thread 8 starts");
//        });
//        t8.start();
//
//        t8.join(1000);//let the t8 thread first complete its execution
//        System.out.println("main thread ends");
//
//
//        Thread t9=new Thread( () -> {
//             for(int i = 1 ; i <= 10 ; i++){
//                System.out.println(i);
//            }
//              Thread.yield();//give chance to another thread with same priority
//        });
//        t9.start();
//
//        Thread t10=new Thread( () -> {
//            for(int i = 101 ; i <= 110 ; i++){
//                System.out.println(i);
//            }
//         });
//        t10.start();
//
//        Thread t11=new Thread(() -> {
//            while( ! Thread.currentThread().isInterrupted()){
//                System.out.println( " RUNNING");
//
//            }
//        });
//        t11.start();
//        Thread.sleep(100);//itne time me jitna print hona hoga utne print hoga
//        t11.interrupt();//send signal to t11 thai it should stop doing whatever its doing
//
//        //isIntrupted() ---> return interrupt flag value
//        //interrupted() --->return interrupt flag value   also set it back to false(default)value  (reset)
//
//
//
//        Thread t12=new Thread(() -> {
//            try {
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {}
//        });
//        System.out.println(t12.isAlive()); // After start and before terminate Thread ---> Alive
//        t12.start();
//        System.out.println(t12.isAlive());
//        Thread.sleep(3000);
//        System.out.println(t12.isAlive());
//
//
//
//        Thread t13=new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//        t13.setName("Worker-1");  //set name to thread
//        t13.start();
//        //currentThread()-->give reference of thread
//
//
//
//        Thread t14=new Thread(() -> System.out.println("Thread 14 start"));
//         t14.setPriority(1);
//
//        Thread t15=new Thread(() -> System.out.println( "Thread 15 start"));
//        t15.setPriority(10);
//
//        Thread t16=new Thread(() -> System.out.println( "Thread 16 start"));
//        t16.setPriority(5);
//
//        t14.start();
//        t15.start();
//         t16.start();
//        //Thread priority
//
//
//
//        Thread t17=new Thread( () -> {
//            while (true){
//                System.out.println("RUNNING");
//            }
//        });
//        t17.setDaemon(true);//stop imediately once main is completed
//        t17.start();
//        Thread.sleep(1000);
//        //Demon Threads --> Background running Threads
//        // Threads -->demon Threads ,user Threads


        //problems
        Counter c=new Counter();
        Thread t18=new Thread(() ->   {
            for(int i = 1 ; i<= 10000  ; i ++){
                c.increment();
            }
        });

        Thread t19=new Thread(() ->   {
            for(int i = 1 ; i<= 10000  ; i ++){
                c.increment();
            }
        });
        t18.start();
        t19.start();

        t18.join();
        t19.join();
        System.out.println(c.count);
        //Race condition
    }
}

class MyThread extends Thread{
    public   void run(){
        System.out.println("Thread is running");
    }
}

class MyRunnable implements  Runnable{

    @Override
    public void run() {
        System.out.println("Runnable thread is running");

    }
}

class Counter{
    public int count=0;
       void  increment(){//here this is  critical section
        count++;  //here this is shared resource
    }
}


