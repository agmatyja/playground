package listVersusArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 /* @author Olaf Matyja
 */

public class MapPrice {

    static Lokator lok1 = new Lokator(50, "Kowalski", "2");
    static Lokator lok2 = new Lokator(53, "Strzelczyk", "99");
    static Lokator lok3 = new Lokator(99, "Matyja", "20");
    static Lokator lok4 = new Lokator(70, "Pośnik", "122");
    static Lokator lok5 = new Lokator(40, "Wiśniewski", "18");
    static Lokator lok6 = new Lokator(45, "Nowak", "666");
    static Lokator lok7 = new Lokator(40, "Jabłoński", "69");
    static Lokator lok8 = new Lokator(55, "Król", "100");
    static Lokator lok9 = new Lokator(70, "Miś", "19");

    static List<Lokator> lokators = Arrays.asList(lok1, lok2, lok3, lok4, lok5, lok6, lok7, lok8, lok9);
    // Jak można wstawić elementy do listy w jednej linijce zamiast się rozpisywać:

    // 1. sposób:
    // static List<Lokator> lokators1 = Arrays.asList(lok1, lok2, lok3, lok4, lok5, lok6, lok7, lok8, lok9);

     // 2. sposób:
     // static ArrayList<Lokator> lokators2 = new ArrayList(){{lokators2.add(lok1);lokators2.add(lok2);lokators2.add(lok3);lokators2.add(lok4);lokators2.add(lok5);lokators2.add(lok6);lokators2.add(lok7);lokators2.add(lok8);lokators2.add(lok9);}};

    // 3. sposób:
    // Lokator[] lokatorsArray = {lok1, lok2, lok3, lok4, lok5, lok6, lok7, lok8, lok9};
    // List<Lokator> lokators3 = Arrays.asList(lokatorsArray);

    public static double podwyzka(int czynsz) {
        return czynsz * 1.2;
    }

    public static void main(String[] args) {
  //      for (int i = 0; i < lokators.size(); i++) {
  //          System.out.println(lokators.get(i));
  //      }
        System.out.println("Po podwyżce czynsz będzie wynosił:");
        for (int i = 0; i < lokators.size(); i++) {
            // 1. sposób:
            System.out.println(lokators.get(i).getNazwisko() + ": " + lokators.get(i).getMetraz() * 100 * 1.2 + " PLN");
            // 2. sposób:
            System.out.println(lokators.get(i).getNazwisko() + ": " + lokators.get(i).getCzynsz() * 1.2 + " PLN");
            // 3. sposób:
            System.out.println(lokators.get(i).getNazwisko() + ": " + podwyzka(lokators.get(i).getCzynsz()) + " PLN");
        }

    }
}