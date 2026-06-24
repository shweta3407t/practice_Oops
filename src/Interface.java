public interface Interface {
      static void main(String[] args) {
        Cycle   cycle=new Cycle();

        cycle.accelerate();
        cycle.deacelerate();

      // static constat
      System.out.println(Vehicle.Max_age);
        System.out.println(Cycle.Max_age);

        //static method -can access only by interface class not by implement class
        Vehicle.info();


                //default method (concrete method)
                //implement class inherit this method
                //can be access using instance of class
           cycle.run();


    }
}

class  Cycle implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("cycle accelerate");
    }

    @Override
    public void deacelerate() {
        System.out.println("cycle decelerate");
    }


}