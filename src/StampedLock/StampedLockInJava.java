package StampedLock;

import java.util.concurrent.locks.StampedLock;

public class StampedLockInJava {
    static void main() {

        SharedResource r=new SharedResource();

        Thread r1=new Thread(() -> r.read());
        Thread r2=new Thread(() -> r.read());

        Thread w1=new Thread(() -> r.write(22));
        Thread w2=new Thread(() -> r.write(33));

        w1.start();
        w2.start();

        r1.start();
        r2.start();
    }
}

class SharedResource{
    private  int value=11;
    StampedLock lock=new StampedLock();



     void read() {
        Long stamp=lock.tryOptimisticRead();
        int currentValue=value;

        if(lock.validate(stamp) == false){
            //fallover logic
            //tryOptimistic read

            try {
                Thread.sleep(2000);
            }catch (Exception e){}


            stamp=lock.readLock();
            try {
                currentValue=value;
            }finally {
                lock.unlockRead(stamp);
            }
        }
         System.out.println(Thread .currentThread().getName() + "  Reads value as : " +currentValue);
    }

    void write(int newValue) {
        Long stamp =lock.writeLock();
        try{
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            value=newValue;
            System.out.println(Thread.currentThread().getName() + " Write value : "+ newValue);
        }
        finally {
           lock.unlock(stamp);
        }
    }

}
