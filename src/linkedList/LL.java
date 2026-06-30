package linkedList;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        Node n1= new Node(22);
        Node n2 =new Node(33);
        Node n3 =new Node(44);
        Node n4=new Node(11);


        //linkedList of node
        LinkedList<Node> list=new LinkedList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(0 , n4 );
        for(Node l : list){
            System.out.print(l.data +" ->");
        }
        System.out.print("null");

//        //LinkedList  of String
//        LinkedList<String > l1=new LinkedList<>();
//        l1.add("git");
//        l1.add("linkedIn");
//        l1.add("gitHub");
//        System.out.println(l1);



    }
}



class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}
