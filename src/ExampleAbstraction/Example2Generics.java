package ExampleAbstraction;

public class Example2Generics {
    public static void main(String[] args) {
    Animal<String> a=new Cat<String>();
    a.walk();

    Cat<String> c=new Cat<String>();
    c.meow();

    JellyFish<String> j=new JellyFish<String>();
    j.swim();
    }
}

class Animal<T> {
    void walk(){
        System.out.println("animal can walk");
    }

}

class Cat<T> extends Animal<T> {
    void meow(){
        System.out.println("cat can meow");
    }

}
interface Fish<T>{
    abstract void swim() ;

}
class JellyFish<T>  extends Animal<T> implements Fish<T>{

    @Override
    public void swim() {
        {
            System.out.println("fish can swim");
        }
    }
}

