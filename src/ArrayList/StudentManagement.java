package ArrayList;

import Model.Student;

import java.util.ArrayList;

public class StudentManagement {

    public ArrayList <Student> StuData(){

        ArrayList <Student> students=new ArrayList<>();

        Student student1=new Student("RAM" ,3,32,45);
        Student student2=new Student("RAKESH" ,1,12,65);
        Student student3=new Student("RAMESH" ,2,20,75);
        Student student4=new Student("RAM AUTAR" ,4,11,85);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (int i=0;  i<students.size();i++){
            System.out.println(students.get(i).getName());
            System.out.println(students.get(i).getSection());
            System.out.println(students.get(i).getAge());
            System.out.println(students.get(i).getMarks());
            System.out.println("********************************************");
        }
        return students;
    }

    public static void main(String[] args) {
        StudentManagement obj=new StudentManagement();
        ArrayList <Student> a=obj.StuData();

        for(Student var:a){
            System.out.println(var.getName());
        }
    }
}
