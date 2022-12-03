package Vector;

import java.util.Vector;

public class Demo {
    public void vector(){

        Vector v1=new Vector();
        v1.add("RAJ");
        v1.add(123);
        v1.add("RAJ");
        v1.add(null);
        v1.add(0);
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.clone());
        System.out.println(v1.contains(0));
        double b = Math.random();
        System.out.println(b);

    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.vector();

    }
}
