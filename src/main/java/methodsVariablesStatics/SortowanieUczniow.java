package methodsVariablesStatics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author Agnieszka Matyja
 */
public class SortowanieUczniow implements Comparable<UczenKlasy3a> {
    UczenKlasy3a moniczka = new UczenKlasy3a("Moniczka", "Nowak", 2, 3, 3, 5, 3, OcenaZzachowania.POPRAWNY.name());
    UczenKlasy3a dżessika = new UczenKlasy3a("Dżessika", "Pupas", 3, 4, 3, 4, 4, "dobre");
    UczenKlasy3a kunegunda = new UczenKlasy3a("Kunegunda", "Ryćko", 4, 4, 4, 4, 2, "dobre");
    UczenKlasy3a bolek = new UczenKlasy3a("Bolek", "Tajniak", 5, 2, 3, 5, 5, "dobre");
    UczenKlasy3a lolek = new UczenKlasy3a("Lolek", "Wędrowycz", 6, 6, 6, 5, 6, "wzorowe");
    UczenKlasy3a tolek = new UczenKlasy3a("Tolek", "Żulski", 7, 5, 2, 6, 4, "dobre");


    public static void main(String[] args) {
        ArrayList<UczenKlasy3a> SortList = new ArrayList<UczenKlasy3a>();


        List<UczenKlasy3a> extendsObject;
        Collections.sort(SortList);


    public String ToString() {
        return null;


        System.out.Println("List after the use of"+
                        "Collection.sort() :\n +sortList())";


}



    public int compareTo(UczenKlasy3a o) {
        return 0;
    }
}




