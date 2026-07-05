package OptionalClass;


import java.util.Optional;

//public class  OptionalClass {
//    static void main() {//methods to avoid null exception
//
////        Optional<String> name=getName();
//
////        System.out.println(name.get());//dangerous
////        if(name.isPresent()){ //safe
////            System.out.println(name.get());
////        }
////        name.ifPresent(System.out :: println);//batter
////        System.out.println( name.orElse("Unknown")) ;
////        System.out.println(name.orElseGet( () -> "Unknown"));
////        System.out.println(name.orElseThrow());
////        name.ifPresentOrElse(System.out :: println ,  () -> System.out.println("Unknown"));
//
//    }
//
////    static  Optional<String> name=Optional.empty(); //   null
////        static  Optional<String> name=Optional.ofNullable( null); // null/shweta
//    static  Optional<String> name=Optional.of("Shweta");  //shweta
//    public static  Optional<String> getName(){
//        return name;
//    }
//
//    static  Optional<String> address=Optional.of("Dahisar");
//    public  static  Optional<String> getAddress(){
//        return  address;
//    }
//
//    static  Optional<String> city=Optional.of("Mumbai");
//    public  static  Optional<String> getCity(){
//        return  city;
//    }
//}



//public  class OptionalClass{
//    static void main() {//transformation-Optional
//
//        Optional<User> user=Optional.of(getAddress());
//
//        user.map(x -> x.address)
//                .map(x -> x.city)
//                .ifPresent(System.out :: println);
//    }
//
//    public static  User getAddress(){
//        Address a=new Address();
//        a.city="Munbai";
//
//        User u=new User();
//        u.address=a;
//
//        return u;
//    }
//}
//class User{
//    public Address address;
//}
//
//class Address{
//    public  String city;
//}




// ##Multidimensional
public  class OptionalClass {
    static void main() {
        Optional<User> user= getAddress();

 //        Optional<Optional<Addesss>> addesss=user.map(x-> x.address); //same
        user.flatMap(x -> x.address)   //same
                .map(y -> y.city)
                .ifPresent(System.out :: println);
    }
    public  static  Optional<User> getAddress(){
        Addesss a=new Addesss();
        a.city="Mumbai";

        User u=new User();
        u.address=Optional.of(a);
        return Optional.of(u);
    }

}
class User{
    public  Optional<Addesss> address;
}
class Addesss{
    public  String city;
}










 //map()  -> if value present then apply map,return optional .else remain empty
//flatMap()
//filter() check condition if true accept value else do nothing

//stream() --> [ user1 ,user2,user3,user4....]
//Optional() --> [user]