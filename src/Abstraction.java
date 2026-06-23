public class Abstraction {
    public static void main(String[] args) {
          Human g=new Girl()  ;
        g.talk();
        g.walk();
        g.sleep();

    }
}

  abstract class  Human {
    private  boolean hasEyes;
     protected   Human(){
        this. hasEyes = true;

    }
    public  abstract void talk();

    public abstract void walk();

    public void sleep(){
        System.out.println(" zzz....");
    }
}

class  Girl extends  Human {


    @Override
    public void talk() {
        System.out.println("girl zzz...");
    }

    @Override
    public void walk() {
        System.out.println("girl walking ...");
    }
}

