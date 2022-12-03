package Conditional;

import java.util.Scanner;

public class SwitchWithScanner {

    public void Switch() {
        System.out.println("PLEASE ENTER YOUR CHOICE");
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();

        switch (marks){
            case 30:
                System.out.println("FAILED");
                break;
            case 33 :
                System.out.println("JUST PASSED");
                break;
            default:
                System.out.println("INCORRECT NUMBER ");
                break;
            case 62 :
                System.out.println("FIRST DIVISION");

        }


    }

    public static void main(String[] args) {
        SwitchWithScanner obj=new SwitchWithScanner();
        obj.Switch();
    }
}
