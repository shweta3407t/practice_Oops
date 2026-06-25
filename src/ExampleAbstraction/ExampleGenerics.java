package ExampleAbstraction;

public class ExampleGenerics {
    public static void main(String[] args) {
        Cricket<String > c=new Cricket<String>();
        System.out.println(c.getName("cricket"));
        System.out.println(c.getNumberOfTeam(11));

    }
}

class Sports<T> {
    private T name ;

    public T getName(T name) {
        return null;
    }

    public int getNumberOfTeam(int n ){
         return n;
    }

}

class  Cricket<T> extends Sports<T>{
    private T name ;
    public  T   getName(T name){
        return  this.name=name;
    }

}


