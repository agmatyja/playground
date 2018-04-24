package listVersusArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Loops {

    static ArrayList<String> stringListBirdie = new ArrayList();
    static HashMap<Integer, String> integerMapBirdie = new HashMap();

    public static void addElementsToList() {
        stringListBirdie.add("wróbelek");
        stringListBirdie.add("bocianek");
        stringListBirdie.add("sikorka");
    }

    public static void addElementsToMapInteger() {
        integerMapBirdie.put(0, "wróbelek");
        integerMapBirdie.put(10, "bocianek");
        integerMapBirdie.put(15, "sikorka");
    }


    public static void main(String[] args) {
        addElementsToList();
        addElementsToMapInteger();

        System.out.println("Pętla na liście z i:");
        for (int i = 0; i < stringListBirdie.size(); i++) {
            System.out.println(stringListBirdie.get(i));
        }

        System.out.println("Pętla na liście bez i:");
        for (String bird : stringListBirdie) {
            System.out.println(bird);
        }

        System.out.println("Pętla na mapie:");
        for (Integer key : integerMapBirdie.keySet()) {
            System.out.println(integerMapBirdie.get(key));
        }
    }
}
