package ReentrantLock;
import java.util.concurrent.TimeUnit;
import  java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReentrantInjava{
    static void main() {
        //ReentrantLock()
        Resource r=new Resource();
        Thread t1=new Thread(() -> r.m1());
        t1.start();
        t1.setName("Thread1");
        Thread t2=new Thread(() -> r.m1());
        t2.start();
        t2.setName("Thread2");


        Thread t3=new Thread(() -> r.m2());
        t3.start();
        t3.setName("Thread3");
        Thread t4=new Thread(() -> r.m2());
        t4.start();
        t4.setName("Thread4");

        //ReadWriteLock()
    }
}
class Resource{
    static  Lock lock =new ReentrantLock(true);//same Thread can aquire lock multiple time
    //tryLock()
    void m1(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " : Enterde m1");

            System.out.println(Thread.currentThread().getName() + " : Exited m1");

        }finally {
            lock.unlock();
        }

    }
    //tryLock(TimedOut)
    static void m2(){
        try {
            if(lock.tryLock(1,TimeUnit.SECONDS)){
                try{
                    System.out.println(Thread.currentThread().getName() + " : Enterde m1");
                    try{
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " : Exited m1");

                }finally {
                    lock.unlock();
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " : Waiting in else block");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

//Methods in Lock
//lock()
//unlock()

//Methods in ReentrantLock()
//lock()
//unlock()
//tryLock()
//tryLock(timeout)
//isLocked()
//isHealdByCurrentThread()

//Method in ReadWriteLock



