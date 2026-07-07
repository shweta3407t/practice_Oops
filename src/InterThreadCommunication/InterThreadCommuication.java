package InterThreadCommunication;

public class InterThreadCommuication {
    static void main() {
        //wait() ,notify() ,notifyAll()
        //producer consumer problem

        Box box=new Box();
        Thread t1=new Thread( () ->   {

            for(int i =1 ; i< 5 ; i++){
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){}
                box.producer(i);
            }
        });
        Thread t2=new Thread(() ->  {
            for(int i=1 ; i<5 ; i++){
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){}
                box.consumer();
            }
        });

        t1.start();
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){}
        t2.start();

    }
}

class Box{
    volatile Integer item;
    volatile boolean flag=false;


    synchronized void producer(int value){
        while (flag == true){
            try{
                wait();
            }catch (InterruptedException e){}
        }
        item=value;
        flag=true;
        System.out.println("Produce  item : " + item);
         notify();
    }

    synchronized void consumer(){
        while (flag == false){
            try{
                wait();
            }catch (InterruptedException e){}
        }
        System.out.println("Consume item  : " + item);
        item=null;
        flag=false;
        notify();
    }

}
