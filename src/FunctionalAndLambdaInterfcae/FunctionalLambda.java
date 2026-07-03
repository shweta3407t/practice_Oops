package FunctionalAndLambdaInterfcae;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class FunctionalLambda {
    static void main() {
        List<Student> list=new ArrayList<>();
        list.add(new Student("shweta" ,  1 ,6));
        list.add(new Student("ram" , 2 ,5));
        list.add(new Student("sam" , 3 ,4));

//        Comparator<Student >  c1=new SortByName();
//        Comparator<Student >  c2=new SortByMarks();
//        Comparator<Student >  c3=new SortByRoll();

        Collections.sort(list,  (s1 ,s2) -> s1.name.compareTo(s2.name));
        list.forEach(Student -> System.out.println(Student.name + " : " + Student.roll + " : " + Student .marks));

//         for(Student s : list){
//            System.out.println(s.name + " : "+ s.roll +" : "+ s.marks);
//        }
        System.out.println();

        Collections.sort(list , (s1,s2) -> s1.roll - s2.roll) ;
        list.forEach(Student -> System.out.println(Student.name + " : " + Student.roll + " : " + Student .marks));
        System.out.println();

        Collections.sort(list , (s1,s2) -> s1.marks - s2.marks) ;
        list.forEach(Student -> System.out.println(Student.name + " : " + Student.roll + " : " + Student .marks));

    }
}
class Student{
    String name;
    int roll;
    int marks;

    Student(String name , int roll , int marks){
        this.name=name;
        this.marks=marks;
        this.roll=roll;
    }
}
//
//class SortByName implements Comparator<Student> {
//    @Override
//    public int compare(Student s1, Student s2) {
//        return s1.name.compareTo(s2.name);
//    }
//}
//class SortByMarks implements Comparator<Student>{
//
//    @Override
//    public int compare(Student s1, Student s2) {
//        return  s1.marks - s2.marks;
//    }
//}
//
//class SortByRoll implements Comparator<Student>{
//
//    @Override
//    public int compare(Student s1, Student s2) {
//        return  s1.roll - s2.roll;
//    }
//}


