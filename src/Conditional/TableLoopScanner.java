package Conditional;

import java.util.Scanner;

public class TableLoopScanner {

    public void Table(){

        String CHOICE="Y";
        while(CHOICE.equals("Y")) {
            System.out.println("PLEASE ENTER THE NO. FOR WHICH YOU HAVE TO PRINT THE TABLE");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("USING SIMPLE FOR LOOP :");
            System.out.println("Table of " + num);
            for (int i = 1; i <= 10; i++) {
                int table = num * i;

                System.out.println(table);
            }

            System.out.println("USING WHILE LOOP :");
            int i = 1;
            while (i <= 10) {
                int table = num * i;
                i++;
                System.out.println(table);
            }
            System.out.println("USING DO WHILE LOOP");
            // int i=0;
            //do{
            //code
            //i++
            // }
            //while (i<10);

            i = 1;
            do {
                int table = num * i;
                System.out.println(table);
                i++;
            }
            while (i <= 10);

            System.out.println("ARE YOU WANT TO CONTINUE PRESS Y OR PRESS ENY KEY TO EXIT :" );
            Scanner sc1 =new Scanner(System.in);
            CHOICE=sc1.nextLine();

        }
    }

    public static void main(String[] args) {
        TableLoopScanner obj =new TableLoopScanner();
        obj.Table();
    }
}
