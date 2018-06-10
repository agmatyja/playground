package methodsVariablesStatics;

import java.util.Arrays;
import java.util.List;

public class ModyfikacjeUczniów {
    private String imię;
    private String nazwisko;
    private Integer nrWdzienniku;
    private Integer ocenaZmatematyki;

    // ====================================================

    public static void main(String[] args){

        UczenKlasy3a moniczka = new UczenKlasy3a("Moniczka", "Nowak", 2, 3, 3);
        UczenKlasy3a dżessika = new UczenKlasy3a("Dżessika", "Pupas", 3, 4, 3);
        UczenKlasy3a kunegunda = new UczenKlasy3a("Kunegunda", "Ryćko", 4, 4, 4);
        UczenKlasy3a bolek = new UczenKlasy3a("Bolek", "Tajniak", 5, 2, 3);
        UczenKlasy3a lolek = new UczenKlasy3a("Lolek", "Wędrowycz", 6, 6, 6);
        UczenKlasy3a tolek = new UczenKlasy3a("Tolek", "Żulski", 7, 5, 2);

        System.out.println(UczenKlasy3a.getSredniaMatematyka(Arrays.asList(moniczka, dżessika, kunegunda, bolek,lolek, tolek)));
        // Można oddzielnie zadeklarować listę
        List listaUczniow = Arrays.asList(moniczka, dżessika, kunegunda, bolek,lolek, tolek);
        System.out.println(UczenKlasy3a.getSredniaMatematyka(listaUczniow));
        //System.out.println(getSredniaMatematyka(moniczka, dżessika));
        //System.out.println(getSredniaMatematyka(Arrays.asList(UczenKlasy3a.getNazwisko())));

    }

}