package variablesAndParameters;

import methodsVariablesStatics.UczenKlasy3a;

/**
 * @author Agnieszka Matyja
 */
public class Zestawienie3AuczniowieZ3 {

    public static void getZestawienie(UczenKlasy3a uczen){
        System.out.println("Imię, nazwisko, średnia ocen: " + uczen.getImię() + " " + uczen.getNazwisko() + " " + uczen.getSredniaOcen());
    }

    public static void main(String[] args) {
        UczenKlasy3a moniczka = new UczenKlasy3a("Moniczka", "Nowak", 2, 5, 3, 5, 3, "poprawne");
        UczenKlasy3a dżessika = new UczenKlasy3a("Dżessika", "Pupas", 3, 6, 3, 4, 4, "dobre");
        UczenKlasy3a kunegunda = new UczenKlasy3a("Kunegunda", "Ryćko", 4, 4, 4, 4, 2, "dobre");
        UczenKlasy3a bolek = new UczenKlasy3a("Bolek", "Tajniak", 5, 2, 3, 5, 5, "dobre");
        UczenKlasy3a lolek = new UczenKlasy3a("Lolek", "Wędrowycz", 6, 6, 6, 5, 6, "wzorowe");
        UczenKlasy3a tolek = new UczenKlasy3a("Tolek", "Żulski", 7, 5, 2, 6, 4, "dobre");

        getZestawienie(moniczka);
        getZestawienie(dżessika);
        getZestawienie(kunegunda);
        getZestawienie(bolek);
        getZestawienie(lolek);
        getZestawienie(tolek);

    }
}
//"get imię, nazwisko,średnią ocen uczniów 3A"