public interface Vehicle{
      //static constant
      int Max_age=100;

      //pure abstract method -no body
    void accelerate();
    void  deacelerate();


    //static method  -can access only by interface class not by implement class
    public static void info(){
        System.out.println("this is static method in  vehicle interface");
    }

    //default method (concrete method)
    //implement class inherit this method
    //can be access using instance(object) of class
    default void run(){
        this.accelerate();
        System.out.println("this is default method in vehicle interface");
    }

}
