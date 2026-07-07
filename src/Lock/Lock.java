package Lock;

//public class Lock {
//    static void main() throws InterruptedException {
//        Counter c=new Counter();
//
//        Thread t=new Thread(() -> {
//            for(int i = 1 ; i<= 10000 ; i++){
//                c.increment();
//            }
//        });
//        t.start();
//
//        Thread t1=new Thread(() -> {
//            for(int i = 1 ; i<= 10000 ; i++){
//                c.increment();
//            }
//        });
//        t1.start();
//
//        t.join();
//        t1.join();
//        System.out.println(c.count);
//    }
//}
//class  Counter{
//    public int count=0;
//    synchronized  void  increment(){//here this is  critical section
//        count++;  //here this is shared resource
//    }
//}


public  class Lock {
    static void main() throws InterruptedException {
        Test t=new Test();
        Thread t1=new Thread(() ->  t.m1());
        Thread t2=new Thread( () -> t.m2());

        t1.start();
        t2.start();


    }
}
class Test {
    synchronized  void  m1() throws   {
        System.out.println("M1 Entered ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("M1 Exit");
    }

    synchronized  void  m2() throws   {
        System.out.println("M1 entered ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("M2 Exit");
    }
}