package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public void LinkedList(){

        LinkedList List=new LinkedList();

        List.add(12);
        List.add("Ram");
        List.add(123);
        List.add(null);
        List.add(123);


        System.out.println(List.getFirst());
        System.out.println("using advance loop");
        for(Object var : List) {
            System.out.println(var);
       }
        System.out.println("*********************************");
        System.out.println("List Elements : "+List);
        System.out.println(List.getFirst());
        System.out.println(List.getLast());
        System.out.println(List.get(3));
        System.out.println("*******************************************");

        LinkedList list1=new LinkedList();
        list1.add("abc");
        list1.add(123);
        System.out.println(list1.add(123));
        System.out.println(list1.add(null));
        System.out.println("list1 : "+list1);
        System.out.println("************************");
        boolean b1= list1.contains(124);
        System.out.println(b1);
        System.out.println(list1);
        System.out.println("**************************");
        LinkedList list2=new LinkedList();
        list2.add(123);
        list2.add("first");
        list2.add("last");
        System.out.println("list2 : "+list2);
        System.out.println("************************************");
        System.out.println(list1.contains(list2));
        System.out.println(list2.contains(123));

        LinkedList list3=new LinkedList();
        list3.add(11);
        list3.add(11);
        list3.add(123);
        list3.add("AGRA");
        list3.add("JAVA");
        list3.add("null");
        list3.add("Shiv");
        System.out.println("*****************************");
        System.out.println("List3: "+list3);
        System.out.println(list3.contains("JAVA"));

        System.out.println("********************using iterator*************");
        Iterator <Object>itr=list3.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
       // while (itr.)
            
        //}
    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.LinkedList();
    }
}
