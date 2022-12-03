package HashSet;

import java.util.HashSet;

public class Demo {

    public HashSet<String> CreateHashSet(){

        HashSet <String> cities=new HashSet<>();
        cities.add("AGRA");
        cities.add("PUNE");
        cities.add("AGRA");
        cities.add("DELHI");
        cities.add("KANPUR");

        for(String var: cities){

            System.out.println(var);
        }
        return cities;
    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.CreateHashSet();
    }
}
