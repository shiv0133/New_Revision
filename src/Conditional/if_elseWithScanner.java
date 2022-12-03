package Conditional;

import java.util.Scanner;

public class if_elseWithScanner {

    public void voting(){

         String CONDITION="Y";
        while (CONDITION.equals("Y")) {
    System.out.println("**************WELCOME FOR VOTING**********");
    Scanner sc = new Scanner(System.in);
    System.out.println("PLEASE ENTER THE AGE :");
    int a = sc.nextInt();

    if (a >= 18) {
        System.out.println("YOU ARE ALLOW FOR VOTING");
    } else {
        System.out.println("YOU ARE NOT ALLOWED FOE VOTING");
    }
           System.out.println("ARE YOU WANT TO EXIT PLEASE PRESS ANY KEY & PRESS Y FOR CONTINUE :");
           Scanner sc1=new Scanner(System.in);
           CONDITION=sc1.nextLine();
}
    }

    public static void main(String[] args) {
        if_elseWithScanner obj=new if_elseWithScanner();
        obj.voting();
    }
}
