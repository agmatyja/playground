package listVersusArray;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Magdalena Strzelczyk on 15.04.2018.
 */

public class MapOne {

    static ArrayList<String> stringListBirdie = new ArrayList();
    static HashMap<Integer, String> integerMapBirdie = new HashMap();
    static HashMap<String, String> stringMapBirdie = new HashMap();

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

    public static void addElementsToMapString() {
        stringMapBirdie.put("ptaszek1", "wróbelek");
        stringMapBirdie.put("ptaszek2", "bocianek");
        stringMapBirdie.put("ptaszek3", "sikorka");
    }

    public static void main (String[] args) {
        addElementsToList();
        System.out.println(stringListBirdie.get(0));

        addElementsToMapInteger();
        System.out.println(integerMapBirdie.get(0));

        addElementsToMapString();
        System.out.println(stringMapBirdie.get("ptaszek3"));

        for (int i = 0; i < stringListBirdie.size(); i++) {
            System.out.println("Ptaszek nr " + (i+1) +" to " + stringListBirdie.get(i));
        }
    }
}
