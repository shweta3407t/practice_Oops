//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        //incapsulation
//        Student s=new Student();
//        s.setName("Shweta");
//        System.out.println(s.getName());
//        s.setRollNumber(1);
//        System.out.println(s.getRollNumber());
//        s.setAge(33);
//        System.out.println(s.getAge());
//
//        Bank  b=new Bank();
//        b.setBalance(300000);
//         b.deposite(400000);
//         b.withDraw(400000);

         //inharitation
        Cat c=new Cat();
        c.walk();//--override method
        c.eat();
        c.hello();//--override method

        Dog d=new Dog();
        d.walk();//--override method
        d.eat();
        d.hello();//--override method


    }
}



