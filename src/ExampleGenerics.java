public class ExampleGenerics {
    public static void main(String[] args) {
        //generic class object
        Sports < String , Integer> s=new Sports<>("cricket " , 11);
        System.out.println(s.name + " : " + s.players);


        //generic method call
        Sport<String >  sport =new Sport<String>();
        String name=sport.getName("cricket");
        Integer n=sport.getNumberOfPlayers(11);

        System.out.println(name + " : " + n);
    }



}
//generic class
class Sports<K ,V>{
    K  name;
    V  players;

    Sports(K name ,V players){
        this.name=name;
        this.players=players;
    }
}

//generic method
class Sport<T>{

    public    <T> T getName( T name){
            return  name;
    }

    public     <T> T getNumberOfPlayers(T number){
        return  number;
    }

}

