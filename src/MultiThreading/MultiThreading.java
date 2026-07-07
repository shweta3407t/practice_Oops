package MultiThreading;

public class MultiThreading {
    static void main() throws InterruptedException {
        MyThread t1=new MyThread();
        t1.start( );


        MyRunnable r=new MyRunnable();
        Thread t2=new Thread(r);
        t2.start();

        //lambda
        Thread t3=new Thread(() -> System.out.println("lambda thread is running"));
        t3.start();

        Thread t4=new Thread( () -> {
            System.out.println(Thread.currentThread().getName());
        }) ;
        t4.start();
        t4.run();//it will show main thread name

        Thread t5=new Thread(() -> {
            for(int i=1 ; i< 10 ; i++){
                if(i %2 == 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}
                    System.out.println( "t1 ="+i);
                }
            }
        });
        t5.start();

        Thread t6=new Thread(() -> {
            for(int i=1 ; i< 10 ; i++){
                if(i %2 != 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {  }
                    System.out.println( "t2 ="+i);
                }
            }
        });
        t6.start();



        //ThreadLifeCycle
        Thread mainThread=Thread.currentThread();
        Thread t7=new Thread(() -> {
            System.out.println("name of current thread : "+Thread.currentThread().getName());
            System.out.println("name of main thread : "+mainThread.getState());
        });

        System.out.println(t7.getState());
        t7.start();
        System.out.println(t7.getState());

        Thread.sleep(2000);
        System.out.println(t7.getState());


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
