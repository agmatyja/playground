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

    public static int nazwisko() {
        int nazwisko = 0;
        return nazwisko;
    }

    public static int pietro(){
        int nazwisko = 0;
        int pietro = 0;
        return pietro;
    }

    public static int metraz() {
        int nazwisko = 0;
        int metraz = 0;
        return metraz;
    }
    public static void main(String[] args) {

            System.out.println(mapaMieszkan.get(nazwisko()) + ": " + mapaMieszkan.pietro + "piętro");
            System.out.println(mapaMieszkan.get(nazwisko()) + ": " + mapaMieszkan.metraz + "m");
        }


        System.out.println("Lokatorzy 9 piętro: ")
                    System.out.println(mapaMieszkan.int pietro()
        }



