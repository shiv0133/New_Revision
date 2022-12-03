package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

    public void ArrayList(){

        ArrayList list=new ArrayList();

        list.add(11);
        list.add("DELHI");
        list.add("JAVA");
        list.add(11);
        list.add(2);
        list.add(3353.98);
        list.add(null);
        list.add(0);

        System.out.println(list);

        System.out.println("*****************");
        System.out.println("random access");

        System.out.println(list.get(2));
        System.out.println(list.get(5));
        System.out.println("*********************");
        System.out.println("using for loop");

        for(int i=0; i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("************************");
        System.out.println("using adavnce for loop");
        for(Object var: list){
            System.out.println(var);
        }
        System.out.println("*************************");
        System.out.println("printing after remove element at index 2");

         list.remove(2);
         for (Object var :list) {
             System.out.println(var);
         }
        System.out.println("\n*********************************************");
         ArrayList list1=new ArrayList();
         list1.add(999);list1.add("som");
         System.out.println(list1);
        System.out.println("****************************************");
        list.addAll(list1);

         list.add(list1);
         System.out.println(list);
        System.out.println("**************************************************");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ArrayList list2 =new ArrayList();
        list2.add("Sandeep");
        list2.add(123);
        list2.add("Radha");
        list2.add(11);
        System.out.println("*******return************");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("*******************************");
        list1.clear();
        System.out.println(list1);
    }

    public static void main(String[] args) {
        Demo obj =new Demo();
        obj.ArrayList();
    }
}
