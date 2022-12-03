package Array;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] marks = new int[4];
        marks[0] = 44;
        marks[1] = 23;
        marks[2] = 33;
        marks[3] = 67;

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
        System.out.println(" ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " +marks[i]);
        }
    }
}