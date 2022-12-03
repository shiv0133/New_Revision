package HashSet;

import NewModel.Doctor;

import java.util.HashSet;

public class DocManagement {

    public HashSet<Doctor> DocData() {

        HashSet<Doctor> Doc = new HashSet<>();

        Doctor doctor1 = new Doctor("RAM", 34, "AGRA", "HEART");
        Doctor doctor2 = new Doctor("SHIV", 34, "AGRA", "HEART");
        Doctor doctor3 = new Doctor("UTKARSH", 38, "DELHI", "LEVER");
        Doctor doctor4 = new Doctor("RAJEEV", 35, "MUMBAI", "EYES");
        Doctor doctor5 = new Doctor("RAJEEV", 35, "MUMBAI", "EYES");

        System.out.println(doctor4.hashCode());
        System.out.println(doctor5.hashCode());
        System.out.println("*********************************************");

        Doc.add(doctor1);
        Doc.add(doctor2);
        Doc.add(doctor3);
        Doc.add(doctor4);
        Doc.add(doctor5);

        return Doc;

    }

    public static void main(String[] args) {
        DocManagement obj = new DocManagement();
        HashSet<Doctor> b = obj.DocData();

        for (Doctor var:b) {
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getSpecialization());
            System.out.println(var.getCity());
            System.out.println("*************************************************************");
        }
    }
}