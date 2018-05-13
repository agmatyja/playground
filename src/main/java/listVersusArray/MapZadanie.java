package listVersusArray;

import objects.Mieszkanie;

import java.util.HashMap;

/**
 * @author Agnieszka Matyja
 */

public class MapZadanie {

    static HashMap<String, Mieszkanie> mapaMieszkan = new HashMap();
    static HashMap<Integer, Integer> czynszPerPietro = new HashMap();

    public static int wspolczynnikCzynsz1(int pietro, int metraz){
        int czynsz = 0;
        if (pietro==1) {
            czynsz = 6;
        }
        if (pietro==2) {
            czynsz = 8;
        }
        if (pietro==5) {
            czynsz = 10;
        }
        if (pietro==6) {
            czynsz = 12;
        }
        if (pietro==9) {
            czynsz = 14;
        }
        return czynsz * metraz;
    }

    static int wspolczynnikCzynsz2(int pietro, int metraz){
        czynszPerPietro.put(0, 6);
        czynszPerPietro.put(1, 6);
        czynszPerPietro.put(2, 8);
        czynszPerPietro.put(3, 8);
        czynszPerPietro.put(4, 10);
        czynszPerPietro.put(5, 10);
        czynszPerPietro.put(6, 12);
        czynszPerPietro.put(7, 12);
        czynszPerPietro.put(8, 14);
        czynszPerPietro.put(9, 14);
        int czynszM = czynszPerPietro.get(pietro);
        return czynszM * metraz;
    }

    static void addElementsToMapInteger(){
        mapaMieszkan.put("Kowalski", new Mieszkanie("Kowalski", 1, 45));
        mapaMieszkan.put("Matyja", new Mieszkanie("Matyja", 5, 99));
        mapaMieszkan.put("Strzelczyk", new Mieszkanie("Strzelczyk", 6, 60));
        mapaMieszkan.put("Pośnik", new Mieszkanie("Posnik", 9, 70));
        mapaMieszkan.put("Król", new Mieszkanie("Król", 2, 80));
    }

    public static void main(String[]args){
        System.out.println("Czynsze lokatorskie: ");
        addElementsToMapInteger();
        for (String key : mapaMieszkan.keySet()) {
            Mieszkanie mieszkCurrent = mapaMieszkan.get(key);
            int pietroCurrent = mieszkCurrent.getPietro();
            int metrazCurrent = mieszkCurrent.getMetraz();
            System.out.println(mieszkCurrent.getWlasciciel() + ": " + wspolczynnikCzynsz2(pietroCurrent, metrazCurrent));
        }

        // to samo na piechotę
//        System.out.println("Czynsze lokatorskie: ");
//        System.out.println(mieszk1.getWlasciciel() + ": " + mieszk1.getMetraz() );
//        System.out.println(mieszk2.getWlasciciel() + ": " + mieszk2.getMetraz() );
//        System.out.println(mieszk3.getWlasciciel() + ": " + mieszk3.getMetraz() );
//        System.out.println(mieszk4.getWlasciciel() + ": " + mieszk4.getMetraz() );
    }
}

