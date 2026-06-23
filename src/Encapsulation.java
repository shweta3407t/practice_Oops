public class Encapsulation {


}

class Student {
    private  String name;
    private  int rollNumber;
    private  int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Bank{
     String user;
    int balance;
    String pass;

    public   int deposite(int amount){
        if(amount >0){
            balance+= amount;
            System.out.println("balance deposited . total balance "+ balance);

        }else {
            System.out.println("invalid amount trying to add ");
        }

        return  balance;
    }

    public void withDraw(int amount){
        if(amount <= balance){
            balance-=amount;
            System.out.println("balance withdraw . total balance "+ balance);
        }else{
            System.out.println("insufficient balance to withDraw");
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
