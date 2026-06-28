public class Abstraction {
    public static void main(String[] args) {
          HumanG g=new Girl()  ;
        g.talk();
        g.walk();
        g.sleep();
        System.out.println(g.hasEyes);

    }
}

  abstract class  HumanG {
     public   boolean hasEyes;
     protected  void Human(){
        this. hasEyes = true;

    }
       abstract void talk();

      abstract void walk();

      void sleep(){
        System.out.println(" human zzz....");
    }
}

interface Human{
    boolean hasEye=true;
    void talk();
    void walk();

}

class boy implements  Human{

    @Override
    public void talk() {

    }

    @Override
    public void walk() {

    }
}

class  Girl extends  HumanG {


    @Override
    void talk() {

    }

    @Override
    void walk() {

    }
}

