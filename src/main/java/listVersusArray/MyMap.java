
package listVersusArray;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    static HashMap<String, Integer> integerMapHouse = new HashMap();

    public static void main(String[] args) {
        addElementsToMapInteger();
        
        System.out.println("Czynsze lokatorskie:");
        for (String nazwisko : integerMapHouse.keySet()) {
            Integer getCzynsz = integerMapHouse.get(nazwisko) * 10;
            System.out.println(nazwisko + ": " + getCzynsz);
        }
    }

    public static void addElementsToMapInteger() {

        integerMapHouse.put("Kowalski", 45);
        integerMapHouse.put("Matyja", 99);
        integerMapHouse.put("Strzelczyk", 60);
        integerMapHouse.put("Pośnik", 70);

    }

}


