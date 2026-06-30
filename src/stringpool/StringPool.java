package stringpool;

import java.util.Locale;

public class StringPool {
    public static void main(String[] args) {
        char[] c={'s','h','w','e','t','a'};
        System.out.println(c);

        String string="Shweta";
        System.out.println(string.concat(" Prajapati"));
        System.out.println(string);

        //
        String s1="ankita";
        String s2="ankita";
        System.out.println(s1 == s2);

        String s3= new String("payal");//new
        String s4 = new String("payal");
        System.out.println(s3 == s4);

        //1. compile time constant  "literals"-->String pool
        String x="ja" + "va";
        String y="java";
        System.out.println(x == y);

        String s="microsoft";
        String h=s;
        System.out.println( s == h);

        String m="hello";
        m="world";
        System.out.println(m);


        //2. run time |constant |  new constant --> heap memory
        String a=new String("shwe");
        String b=a+"ta";

        String d=new String("shweta");
        System.out.println(b == d);

        String p=new String("linux");
        String q=p;
        System.out.println(p == q);

        String g= "";
        for(int i=0 ; i<5  ; i++) {
            g += i;
        }
            System.out.println(s);


//        //empty String
//        String s=new String();
//        System.out.println(s);
//        //parameterize constructor
//        String s1=new String("maven");
//        System.out.println(s1);
//
//        String s2=new String(s1);
//        System.out.println(s2);
//
//        //char array
//        char[] arr ={ 's','p','r','i','n','g',' ','b','o','o','t'};
//        arr[0]='S';
//        String s3=new String(arr);
//        System.out.println(s3);
//
//        //char array sub set
//        String s4=new String(arr , 0,5);
//        System.out.println(s4);
//
//
//        //byte array
//        byte[] b={ 97 ,98,99 ,100};
//        String s5=new String(b);
//        System.out.println( s5);

        String s6="Shweta";
        String s7="  SHWETA  ";

        System.out.println(s6.length());
        System.out.println(s6.isBlank());
        System.out.println(s6.isBlank());

        System.out.println(s6.charAt(4));
        System.out.println(s6.toCharArray());

        System.out.println(s6.equals(s7));
        System.out.println(s6.equalsIgnoreCase(s7));
        System.out.println(s6 == s7);
        System.out.println(s6.compareTo(s7));

        System.out.println(s6.contains("d"));
        System.out.println(s6.indexOf("S"));

        System.out.println(s6.substring( 1, 5));

        System.out.println(s6.toLowerCase());
        System.out.println(s6.toUpperCase());
        System.out.println(s7.trim());

        System.out.println(s6.repeat(4));
        System.out.println(s6.replace("S" , "A"));
        System.out.println(s6.replace("ta" , "zz"));
        System.out.println(s7.replaceAll(" " , "@"));

        String[]  arr=s6.split("");
        for(String z : arr){
            System.out.println(z);
        }

        System.out.println(String.join( "-" ,"Microsoft" ,"Amazon" , "Google"));

        //formate
        String name="dev";
        int age=55;
        System.out.println(String.format("hello %s your age is %s" , name ,age));


    }
}
