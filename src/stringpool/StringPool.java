package stringpool;

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


    }
}
