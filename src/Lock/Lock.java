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



//synchronized
// public  class Lock {
//    static void main() throws InterruptedException {
//        Test t=new Test();
//        Thread t1=new Thread(() ->  t.m1());
//        Thread t2=new Thread( () -> t.m2());
//
//        t1.start();
//        t2.start();
//
//
//    }
//}
//class Test {
//    synchronized  void  m1()   {
//        System.out.println(Thread.currentThread().getName() + " : M1 Entered ");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(Thread.currentThread().getName()+" : M1 Exit");
//    }
//
//    synchronized  void  m2()     {
//        System.out.println(Thread.currentThread().getName()+" : M2 entered ");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(Thread.currentThread().getName()+" : M2 Exit");
//    }
//}




////custom lock object  for parallel work
// public  class Lock {
//     static void main() throws InterruptedException {
//         Bank b=new Bank();
//         Thread t1=new Thread(() -> b.Deposit());
//         Thread t2=new Thread( () -> b.withDraw());
//
//         t1.start();
//         t2.start();
//
//
//         Thread t3=new Thread( () ->b.m1() );
//         t3.start();
//         Thread t4=new Thread( () ->b.m1() );
//         t4.start();
//     }
// }
// class Bank {
//     Object lock1=new Object();
//     Object lock2=new Object();
//
//     void m1() {
//         synchronized (this){
//             System.out.println(Thread.currentThread().getName() + " :   Entered m1");
//             try{
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {
//                 throw new RuntimeException(e);
//             }
//             System.out.println(Thread.currentThread().getName() + " : Exiting m1");
//         }
//      }
//
//     void  Deposit(){
//         synchronized (lock1){
//             System.out.println(Thread.currentThread().getName() + " : Deposite");
//             try {
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {
//                 throw new RuntimeException(e);
//             }
//         }
//
//     }
//     void  withDraw(){
//         synchronized (lock2){
//             System.out.println(Thread.currentThread().getName()+" : WithDraw ");
//             try {
//                 Thread.sleep(2000);
//             } catch (InterruptedException e)  {}
//         }
//
//     }
// }





//
// //synchronized in static method
//
//public  class Lock {
//    static void main() {
//        Thread t5=new Thread( () -> Counter.increment() );
//        t5.start();
//        Thread t6=new Thread( () -> Counter.increment() );
//        t6.start();
//    }
//}
//class Counter{
//    static int count=0;
//    synchronized static void  increment(){
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){}
//        count++;
//        System.out.println(count);
//    }
//}





//synchronized
 public  class Lock {
    static void main() throws InterruptedException {
        Test t=new Test();
        Thread t1=new Thread(() ->  Test.m1());
        Thread t2=new Thread( () -> t.m2());

        t1.start();
        t2.start();


    }
}
class Test {
      static void  m1() {
          synchronized (Test.class){
              System.out.println(Thread.currentThread().getName() + " : M1 Entered ");
              try {
                  Thread.sleep(2000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              System.out.println(Thread.currentThread().getName()+" : M1 Exit");
          }

    }

    synchronized  void  m2()     {
        System.out.println(Thread.currentThread().getName()+" : M2 entered ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" : M2 Exit");
    }
}

