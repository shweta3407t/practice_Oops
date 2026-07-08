package ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockInJava {
    static void main() {
        SharedResource s=new SharedResource() ;

        Thread r1=new Thread(() -> s.read());
        Thread r2=new Thread(() -> s.read());
        Thread r3=new Thread(() -> s.read());

        Thread  w1=new Thread(() -> s.Write(22));
        Thread  w2=new Thread(() -> s.Write(33));
        Thread  w3=new Thread(() -> s.Write(44));
        w1.start();
        w2.start();
        w3.start();

        r1.start();
        r2.start();
        r3.start();
    }
}
class SharedResource{
    private int value=11;

    ReadWriteLock l=new ReentrantReadWriteLock( );
    Lock readLock=l.readLock(); //shared lock
    Lock writeLock=l.writeLock(); //exclusive lock

    //reader -writer problem
    void read() {
        readLock.lock();
         try{
             try{
                 Thread.sleep(5000);
             }catch (Exception e){}
             System.out.println(Thread.currentThread().getName() + " Read : "+value);
         }
         finally {
             readLock.unlock();
         }
    }

    void Write(int newValue) {
        writeLock.lock();
        try{
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
             value=newValue;
            System.out.println(Thread.currentThread().getName() + " Write value : "+ newValue);
        }
        finally {
            writeLock.unlock();
        }
    }
}
