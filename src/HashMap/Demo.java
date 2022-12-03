package HashMap;

import Model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

    public void createHashMap() {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "PYTHON");
        hashMap.put(123, "RAMESH");
        hashMap.put(20, "PYTHON");
        hashMap.put(2, "AGRA");
        hashMap.put(3, "ORANGE");


        System.out.println("printing value at key  123 : " + hashMap.get(123));
        System.out.println("using advance for loop");
        Set<Integer> key = hashMap.keySet();
        for (Integer var:key) {
            System.out.println(hashMap.get(var));
        }
        System.out.println("************************************");
    }



    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.createHashMap();
    }
}
