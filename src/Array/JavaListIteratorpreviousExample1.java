package Array;

import java.util.ArrayList;
import java.util.ListIterator;

public class JavaListIteratorpreviousExample1{
    public static void main(String[] args) {
        ArrayList < Long > numbers = new ArrayList < Long > ();
        numbers.add(88l);
        numbers.add(67l);
        numbers.add(57l);
        ListIterator < Long > listIterator = numbers.listIterator();
        System.out.println("The list of alphabets is given as : "+numbers);
        System.out.println("In the forward direction : ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("In the backward direction:- ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
