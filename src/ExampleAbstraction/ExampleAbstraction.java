package ExampleAbstraction;

public class ExampleAbstraction {
    public static void main(String[] args) {
        MyBook b1=new MyBook();
        b1.setTitle( "Shweta");
        System.out.println(b1.getTitle());
    }
}
abstract class Book{
      public String title;

    abstract void setTitle( String title) ;
    public String getTitle() {
        return this.title;
    }


}

class MyBook extends  Book{

    @Override
    void setTitle(String title) {
        this.title=title;
    }
}
