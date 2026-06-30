package StringBuilder;

public class String_Builder {
    public static void main(String[] args) {
        //StringBuilder --> mutable
        String s="Hello there, my name is Shweta  ";
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append (s));

        System.out.println(sb.insert( 31 ,"Prajapati"));
        System.out.println(sb.delete( 30 ,40));
        System.out.println(sb.replace(1 , 5  ," &&&&&&&"));
        System.out.println(sb.reverse());

        System.out.println(sb.charAt(4));
        sb.setCharAt(3 ,'Q');
        System.out.println(sb) ;

        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity()) ;

        //StringBuffer -->mutable +Thread safe



    }
}
