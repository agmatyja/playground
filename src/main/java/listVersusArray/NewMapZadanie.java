package listVersusArray;

import objects.Mieszkanie;

import java.util.HashMap;

/**
 * @author Agnieszka Matyja
 */

public class NewMapZadanie {

    static HashMap<String, Mieszkanie> mapaMieszkan = new HashMap();

    static void addElementsToMapInteger() {
        mapaMieszkan.put("Kowalski", new Mieszkanie("Kowalski", 1, 45));
        mapaMieszkan.put("Matyja", new Mieszkanie("Matyja", 5, 99));
        mapaMieszkan.put("Strzelczyk", new Mieszkanie("Strzelczyk", 6, 60));
        mapaMieszkan.put("Pośnik", new Mieszkanie("Posnik", 9, 70));
        mapaMieszkan.put("Król", new Mieszkanie("Król", 2, 80));
        mapaMieszkan.put("Różycki", new Mieszkanie("Różycki", 9, 72));
        mapaMieszkan.put("Kazimierczyk", new Mieszkanie("Kazimierczyk", 9, 60));
    }

    public static void main(String[] args) {

        addElementsToMapInteger();
        for (String mieszkaniec : mapaMieszkan.keySet()) {
            Mieszkanie mieszkanie = mapaMieszkan.get(mieszkaniec);
            System.out.println(mieszkanie.getWlasciciel() + ": " + mieszkanie.getPietro() + " piętro");
        }

        for (String mieszkaniec : mapaMieszkan.keySet()) {
            Mieszkanie mieszkanie = mapaMieszkan.get(mieszkaniec);
            System.out.println(mieszkanie.getWlasciciel() + ": " + mieszkanie.getMetraz() + " m2");
        }

        for (String mieszkaniec : mapaMieszkan.keySet()) {
            Mieszkanie mieszkanie = mapaMieszkan.get(mieszkaniec);
            if (mieszkanie.getPietro()==9){
                System.out.println(mieszkanie.getWlasciciel());
            }
        }

    }
}

