public interface Interface {
      static void main(String[] args) {
        Cycle c=new Cycle();

        c.accesslerate();
        c.deacelerate();

        System.out.println(c.);
    }
}
  interface Vehicle{
       int Max_age=100;

    void accesslerate();
    void  deacelerate();

}

class  Cycle implements Vehicle {

    @Override
    public void accesslerate() {
        System.out.println("cycle accelerate");
    }

    @Override
    public void deacelerate() {
        System.out.println("cycle decelerate");
    }
}