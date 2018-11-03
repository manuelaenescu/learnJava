package base;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsTest {



    public static void main (String[] args){

        listTest();

        TreeMap<Integer, String> mapOfString = new TreeMap<>();



        mapOfString.put(2, "second");
        mapOfString.put(3, "third");
        mapOfString.put(1, "first");

        mapOfString.put(1, "newfirst");

        Set<Integer> keys = mapOfString.keySet();
        System.out.println("Keys" + keys);
        System.out.println("Values" + mapOfString.values());

        for (int key : keys){

            System.out.println(key + ":" + mapOfString.get(key));
        }







    }

    private static void listTest() {
        ArrayList<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("first");
        listOfStrings.add("second");
        listOfStrings.add("third");

        for (int i=0; i < listOfStrings.size(); i++)
            System.out.println(listOfStrings.get(i));
    }
}
