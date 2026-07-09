package LockFreeConcurrency;

import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class LockFreeConcurrency {
    static void main() throws InterruptedException {
//        //AtomicInteger
//        Counter c=new Counter();
//
//        Thread t1=new Thread(() -> {
//            for(int i=1 ; i<= 1000 ;  i ++){
//                c.increment();
//            }});
//        t1.start();
//        Thread t2=new Thread(() -> {
//            for(int i=1 ; i<=1000 ;  i ++){
//                c.increment();
//            }});
//
//        t2.start();
//        try{
//            Thread.sleep(1000);
//        }catch (Exception e){}
//        System.out.println(c.count);
//
//
//
//
//        //Seat-Booking problem
//        SeatBooking seatBooking=new SeatBooking();
//
//
//        Thread t3=new Thread( () ->  {
//            boolean value=seatBooking.bookSeat("Shweta");
//            System.out.println("T1 -> "+value);
//        });
//        t3.start();
//        Thread t4=new Thread(() ->  {
//             boolean value=seatBooking.bookSeat("Devi");
//            System.out.println("T2 -> "+value);
//        });
//        t4.start();
//
//        try{
//            Thread.sleep(2000);
//        }catch (Exception e){}
//
//        System.out.println(seatBooking.seat);



        //Re-try loop
        LikeCounter l=new LikeCounter();
        Thread t5=new Thread(() -> l.like());
        t5.start();
        Thread t6=new Thread(() -> l.like());
        t6.start();
        Thread t7=new Thread(() -> l.like());
        t7.start();
        Thread t8=new Thread(() -> l.like());
        t8.start();
        Thread t9=new Thread(() -> l.like());
        t9.start();
        Thread t10=new Thread(() -> l.like());
        t10.start();
        Thread t11=new Thread(() -> l.like());
        t11.start();
        Thread t12=new Thread(() -> l.like());
        t12.start();
        Thread t13=new Thread(() -> l.like());
        t13.start();
        Thread t14=new Thread(() -> l.like());
        t14.start();

        Thread.sleep(2000);

//        System.out.println("Total Likes : "+l.totalCount);




        //AutomicReferenceArray

        SeatBookingArray sb=new SeatBookingArray();
        Thread thread=new Thread(() -> sb.seatBooking("Shweta"));
        thread.start();
        Thread thread1=new Thread(() -> sb.seatBooking("Devi"));
        thread1.start();
        Thread thread2=new Thread(() -> sb.seatBooking("Payal"));
        thread2.start();

        Thread.sleep(2000);


    }
}


//AutomaticReferenceArray
class SeatBookingArray{
    AtomicReferenceArray<String> seat=new AtomicReferenceArray<>(5);

     SeatBookingArray (){
         for(int i=1 ; i< seat.length() ; i++){
             seat.set(i , "");
         }
     }




    void seatBooking(String name) {
        for (int i = 1; i < seat.length(); i++) {
            String currentValue = seat.get(i);
            if (currentValue.equals("")) {
                if (seat.compareAndSet(i, currentValue, name)) {
                    System.out.println("Seat " + i + " :  " + seat.get(i));
                }
            }
        }
    }
}



 class LikeCounter{
    AtomicReference<Integer> totalCount= new AtomicReference<>(0);
//    AtomicInteger totalCount=new AtomicInteger(0);

    void like(){
//        totalCount.incrementAndGet();
        Integer currentValue=totalCount.get();
        Integer newValue=currentValue+10;
         while (true){
              if(totalCount.compareAndSet(currentValue ,newValue)){
                  return;
            }
       }
    }


 }




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



class Counter{
    AtomicInteger count=new AtomicInteger(0);

    void  increment(){
        count.incrementAndGet();
    }
}

//t1 & t2 --> concurrently