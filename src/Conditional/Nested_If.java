package Conditional;

import java.util.Scanner;

public class Nested_If {


    public void VotingAge() {
        Scanner sc =new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR CITY : ");
        String  city=sc.nextLine();


        if (city.equals("AGRA")) {
            System.out.println("PLEASE ENTER YOUR AGE : ");
            int age =sc.nextInt();

            if (age >= 18) {
                System.out.println("YOU ARE FORM AGRA AND ALLOWED FOR VOTING");
            }
            else  {
                System.out.println("NOT ALLOWED FOR VOTING BECAUSE YOU ARE UNDER AGE");
            }
        }
        else {
            System.out.println("YOU DON'T BELONGS FROM AGRA SO YOU CAN'T VOTE HERE ");
        }
    }

    public static void main(String[] args) {
        Nested_If obj=new Nested_If();
        obj.VotingAge();
    }
}
