
package listVersusArray;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    static HashMap<Integer, String> integerMapHouse = new HashMap();
    static HashMap<String, String> stringMapHouse = new HashMap();

    public static void main(String[] args) {

        Map houses = new HashMap();
        Lokator lok1 = new Lokator( "Kowalski", 45);
        Lokator lok3 = new Lokator( "Matyja", 99);
        Lokator lok2 = new Lokator( "Strzelczyk", 60);
        Lokator lok4 = new Lokator( "Pośnik", 70);

        addElementsToMapInteger();
    }

    public static void addElementsToMapInteger() {


        integerMapHouse.put(45, "Kowalski");
        integerMapHouse.put(99, "Matyja");
        integerMapHouse.put(60, "Strzelczyk");
        integerMapHouse.put(70, "Pośnik");


        System.out.println("Czynsze lokatorskie:");
        for (int i = 0; i < integerMapHouse.size(); i++) {
            System.out.println(integerMapHouse.get("i+1")) + 10integerMapHouse.get(i));

        }
    }
        public void addElementsToMapString () {


        }
    }


        // for (int i = 0; i < stringListHouse.size(); i++)) {
        //    System.out.println("Ptaszek nr " + (i+1) +" to " + stringListHouse.get(i));

