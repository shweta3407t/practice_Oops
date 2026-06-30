package OldInterface;

public class OldInterface {
    public static void main(String[] args) {
        Vehicle v=new car();
        v.drive();
        Vehicle.brake();


    }
}

interface  Vehicle{
    //default method
    default  void drive(){
        System.out.println("vehicle is driving");
        accelerate();
    }

    //static method
    static void brake(){
        System.out.println("vehicle is breaking");
    }

    //private method
    private void accelerate(){
          System.out.println("vehicle is accelerating");
      }


}
class car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("car is driving");

    }
}