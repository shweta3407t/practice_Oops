package IterableInterface;

 import java.util.*;

public class IterableInterface {
    public static void main(String[] args) {
       List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        for(int i=0 ; i<list.size() ; i++){
            System.out.print( list.get(i) ) ;
            System.out.print("->");
        }
        System.out.print("null");

        //using iterable interface
        Collection<Integer> l=new Stack<>();
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(44);
        l.add(55);
        Iterator<Integer> iterator=l.iterator();
        System.out.println();
        while(iterator.hasNext()){
            System.out.print(iterator.next() );
            System.out.print("->");
         }
        System.out.print("null");


        //example 1
        String[] names={"Microsoft" ,"Google" ,"amazon" ,"JP Morgan" };
        NameContainer cotainer=new NameContainer(names);


        //normal loop
        Iterator<String> it=cotainer.iterator();
        while (it.hasNext() ){
            System.out.println(it.next());
        }

        //enhanced for loop (for each loop)
        for( String n : cotainer){
            System.out.println(n);
        }

        //examlple 2
        String[] items ={"computer " ,"laptop" ,"phone" ,"iPAd"};
        Container c=new Container(items);
        for(String container : c){
            System.out.println(container);
        }


    }
}

//example 1
class NameContainer implements  Iterable<String>{

    private  String[] name;
    private int size;

    NameContainer(String[] name  ){
        this.name=name;
        this.size= this.name.length;
    }


    //iterator method
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private  int position=0;
            @Override
            public boolean hasNext() {
                return  position < size;
            }

            @Override
            public String next() {
                return name[position++];
            }
        } ;
    }
}


//example 2
class Container implements Iterable<String>{
    private int size;
    private  String[] items;

    Container(String[] items){
        this.items=items;
        this.size=this.items.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private  int pos=0;
            @Override
            public boolean hasNext() {
                return (pos < size);
            }

            @Override
            public String next() {
                return items[pos++];
            }
        };
    }
}

