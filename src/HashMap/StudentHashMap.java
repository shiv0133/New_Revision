package HashMap;

import Model.Student;

import java.util.HashMap;
import java.util.Set;

public class StudentHashMap {

    public void StuHashMap(){
        HashMap<Integer, Student> stu=new HashMap<>();

        Student student1=new Student("SHIV",2,32,14);
        Student student2=new Student("AMIT",3,12,31);
        Student student3=new Student("RAJ",1,45,71);
        Student student4=new Student("RAMESH",3,56,61);
        Student student5=new Student("RAMESH",3,56,61);

        stu.put(1,student1);
        stu.put(2,student2);
        stu.put(3,student3);
        stu.put(4,student4);
        stu.put(4,student5);


       Set <Integer> a= stu.keySet();
       for(Integer var:a){
           System.out.println("NAME : " +stu.get(var).getName());
           System.out.println("AGE : "+stu.get(var).getAge());
           System.out.println("SECTION : " +stu.get(var).getSection());
           System.out.println("MARKS : "+stu.get(var).getMarks());
           System.out.println("******************************************");

       }
        System.out.println("hashcode for student  1::"+student1.hashCode());
        System.out.println("hashcode for student  2::"+student2.hashCode());
        System.out.println("hashcode for student  3::"+student3.hashCode());
        System.out.println("hashcode for student  4::"+student4.hashCode());
        System.out.println("hashcode for student  5::"+student5.hashCode());


    }

    public static void main(String[] args) {
        StudentHashMap obj=new StudentHashMap();
        obj.StuHashMap();
    }
}
