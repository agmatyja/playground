package methodsVariablesStatics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * @author Agnieszka Matyja
 */
public class SortowanieUczniow {
    static UczenKlasy3a moniczka = new UczenKlasy3a("Moniczka", "Nowak", 2, 3, 3, 5, 3, OcenaZzachowania.POPRAWNY.name());
    static UczenKlasy3a dżessika = new UczenKlasy3a("Dżessika", "Pupas", 3, 4, 3, 4, 4, "dobre");
    static UczenKlasy3a kunegunda = new UczenKlasy3a("Kunegunda", "Ryćko", 4, 4, 4, 4, 2, "dobre");
    static UczenKlasy3a bolek = new UczenKlasy3a("Bolek", "Fajniak", 5, 2, 3, 5, 5, "dobre");
    static UczenKlasy3a lolek = new UczenKlasy3a("Lolek", "Żulski", 6, 6, 6, 5, 6, "wzorowe");
    static UczenKlasy3a tolek = new UczenKlasy3a("Tolek", "Żulski", 7, 5, 2, 6, 4, "dobre");


    public static void main(String[] args) {
       List<UczenKlasy3a> sortList = new ArrayList();
        sortList.add(moniczka);
        sortList.add(dżessika);
        sortList.add(kunegunda);
        sortList.add(bolek);
        sortList.add(lolek);
        sortList.add(tolek);

       Collections.sort(sortList);
        System.out.println(sortList);
    }

}




