package Model;

import java.util.Objects;

public class Student {

    String Name;
    int Section;
    int Age;
    int Marks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Section == student.Section && Age == student.Age && Marks == student.Marks && Objects.equals(Name, student.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Section, Age, Marks);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSection() {
        return Section;
    }

    public void setSection(int section) {
        Section = section;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public Student(String name, int section, int age, int marks) {
        Name = name;
        Section = section;
        Age = age;
        Marks = marks;
    }
}
