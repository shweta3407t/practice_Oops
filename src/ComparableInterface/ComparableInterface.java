package ComparableInterface;

import java.util.*;


public class ComparableInterface {
    static void main() {

        List<Integer> l=new ArrayList<>();
        l.add(22);
        l.add(44);
        l.add(77);
        Collections.sort(l);
        System.out.println(l);

        List<Student> list =new ArrayList<>();
         list.add(new Student(11 ,"shweta"));
         list.add(new Student(66 , "sham"));
         list.add(new Student(55 , "sonu"));
        list.add(new Student(55, "payal"));

         Collections.sort(list);
         for(Student s : list){
            System.out.println(s.name + " : " + s.marks);
        }


         Student s1=new Student(77 , "ram");
        Student s2=new Student(77 , "sham");

         TreeSet<Student> s=new TreeSet<>();
         s.add(s1);
         s.add(s2);
        System.out.println(s.size());

    }
}
class Student implements  Comparable<Student> {
    int marks;
    String name;
    Student(int marks ,String name){
        this.marks=marks;
        this.name=name;
    }

    @Override
    //complex compareTo
    public int compareTo( Student other) {
        if(this.marks != other.marks){
            return  this.marks - other.marks;
        }
        return   this.name.compareTo(other.name) ;
    }

//    //normal compareTo
//    public int compareTo( Student other) {
//
//        return   this.marks - other.marks ;
//    }
}