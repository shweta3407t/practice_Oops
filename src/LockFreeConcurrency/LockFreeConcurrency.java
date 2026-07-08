package LockFreeConcurrency;

import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class LockFreeConcurrency {
    static void main() throws InterruptedException {
        //AtomicInteger
        Counter c=new Counter();

        Thread t1=new Thread(() -> {
            for(int i=1 ; i<= 1000 ;  i ++){
                c.increment();
            }});
        t1.start();
        Thread t2=new Thread(() -> {
            for(int i=1 ; i<=1000 ;  i ++){
                c.increment();
            }});

        t2.start();
        try{
            Thread.sleep(1000);
        }catch (Exception e){}
        //System.out.println(c.count);




        //Seat-Booking problem
        SeatBooking seatBooking=new SeatBooking();


        Thread t3=new Thread( () ->  {
            boolean value=seatBooking.bookSeat("Shweta");
            System.out.println("T1 -> "+value);
        });
        t3.start();
        Thread t4=new Thread(() ->  {
             boolean value=seatBooking.bookSeat("Devi");
            System.out.println("T2 -> "+value);
        });
        t4.start();

        try{
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println(seatBooking.seat);

    }
}
class Counter{
    AtomicInteger count=new AtomicInteger(0);

    void  increment(){
        count.incrementAndGet();
    }
}
//t1 & t2 --> concurrently


//seat-Booking problem
class SeatBooking{
    AtomicReference<String> seat=new AtomicReference<>("");

    boolean bookSeat(String name){
        String currentValue=seat.get();
        if(currentValue.isEmpty() == false){
             return false;
        }

        return seat.compareAndSet("" ,name);
    }
}