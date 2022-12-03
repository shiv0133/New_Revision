package NewModel;

import java.util.Objects;

public class Doctor {

    String Name;
    int Age;
    String City;
    String Specialization;

    public Doctor(String name, int age, String city, String specialization) {
        Name = name;
        Age = age;
        City = city;
        Specialization = specialization;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Age == doctor.Age && Objects.equals(Name, doctor.Name) && Objects.equals(City, doctor.City) && Objects.equals(Specialization, doctor.Specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, City, Specialization);
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
}
