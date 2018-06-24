package methodsVariablesStatics;

import static methodsVariablesStatics.ModyfikacjeUczniów.getSredniaMatematyka;

/**
 * Created by Magdalena Strzelczyk on 17.06.2018.
 */
public class KartaUcznia {

    public static void getKartaUcznia(UczenKlasy3a uczen) {
        System.out.println("Karta ucznia");
        getDaneUcznia(uczen);
        System.out.println("Nauczyciele:");
        getNauczyciele();
        System.out.println("");
    }

    public static void getKartaNauczycieli() {
        System.out.println("Nauczyciele klasy 3a: ");
        getNauczyciele();
    }

    public static void getSwiadectwoUcznia(UczenKlasy3a uczen) {
        System.out.println(" ---- ");
        System.out.println("Swiadectwo ucznia");
        getDaneUcznia(uczen);
    }

    public static void getDaneUcznia(UczenKlasy3a uczen) {
        System.out.println("Imię i nazwisko: " + uczen.getImię() + " " + uczen.getNazwisko());
        System.out.println("Nr w dzienniku: " + uczen.getNrWdzienniku());
        System.out.println("Ocena z matematyki: " + uczen.getOcenaZmatematyki());
        System.out.println("Ocena z polskiego: " + uczen.getOcenaZpolskiego());
        System.out.println("Ocena z muzyki: " + uczen.getOcenaZmuzyki());
        System.out.println("Ocena z biologii: " + uczen.getOcenaZbiologii());
        System.out.println("Srednia ocen: " + uczen.getSredniaOcen());
        System.out.println("Ocena z zachowania: " + uczen.getZachowanie());
        System.out.println("");
    }

    public static void getNauczyciele() {
        System.out.println("- matematyka: " + UczenKlasy3a.getMatematyczka());
        System.out.println("- polski: " + UczenKlasy3a.getPolonistka());
        System.out.println("- muzyka: " + UczenKlasy3a.getMuzyczka());
        System.out.println("- biologia: " + UczenKlasy3a.getBiolożka());
    }

    public static void main(String[] args) {
        UczenKlasy3a moniczka = new UczenKlasy3a("Moniczka", "Nowak", 2, 3, 3, 5, 3, "poprawne");
        UczenKlasy3a dżessika = new UczenKlasy3a("Dżessika", "Pupas", 3, 4, 3, 4, 4, "dobre");
        UczenKlasy3a kunegunda = new UczenKlasy3a("Kunegunda", "Ryćko", 4, 4, 4, 4, 2, "dobre");
        UczenKlasy3a bolek = new UczenKlasy3a("Bolek", "Tajniak", 5, 2, 3, 5, 5, "dobre");
        UczenKlasy3a lolek = new UczenKlasy3a("Lolek", "Wędrowycz", 6, 6, 6, 5, 6, "wzorowe");
        UczenKlasy3a tolek = new UczenKlasy3a("Tolek", "Żulski", 7, 5, 2, 6, 4, "dobre");

        getSwiadectwoUcznia(moniczka);

        getKartaUcznia(moniczka);
        getKartaUcznia(dżessika);
        getKartaUcznia(kunegunda);
        getKartaUcznia(bolek);
        getKartaUcznia(lolek);
        getKartaUcznia(tolek);

        System.out.println("Lepszą średnią z matematyki mają " + getPorównanieMatematyka(moniczka, dżessika, kunegunda, bolek, lolek, tolek));
        getKartaNauczycieli();
    }

    private static String getPorównanieMatematyka(UczenKlasy3a uczen1, UczenKlasy3a uczen2, UczenKlasy3a uczen3, UczenKlasy3a uczen4, UczenKlasy3a uczen5, UczenKlasy3a uczen6) {
        double dziewczynkiMatematyka = (uczen1.getOcenaZmatematyki() + uczen2.getOcenaZmatematyki() + uczen3.getOcenaZmatematyki()) / 3.0;
        double chłopcyMatematyka = (uczen4.getOcenaZmatematyki() + uczen5.getOcenaZmatematyki() + uczen6.getOcenaZmatematyki()) / 3.0;
        if (dziewczynkiMatematyka > chłopcyMatematyka) {
            return "dziewczynki";
        }

        if (dziewczynkiMatematyka < chłopcyMatematyka) {
            return "chłopcy";
        }
        return "Ani chłopcy ani dziewczynki";
    }

}




