public class PracticeSuper {
    public static void main(String[] args) {
        ItStudent s=new ItStudent( 1 , " Shweta" , 18  ," Shailendra");
        s.print();
    }
}

class Students{
      int id;
      String name;
      int age;


    Students(int id, String name , int age ){
        this.id=id;
        this.name=name;
        this.age=age;

    }

    void print(){
        System.out.println("id : " + id + " name : " + name + " age : " + age  );
    }
}

class ItStudent extends Students{
    String college;

    ItStudent(int id, String name , int age ,String college){
        //call parent  class constructor
        super(id ,name , age);
        this.college=college;
    }

    @Override
    void print(){
        //call parent class method
        super.print();
        System.out.println("college : "+ college);
    }

}
