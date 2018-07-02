package methodsVariablesStatics;

import java.util.Arrays;
import java.util.List;

public class ModyfikacjeUczniów {

    public static String getNazwisko(UczenKlasy3a uczen){
        String nazwisko = uczen.getNazwisko();
        return nazwisko;
    }

    // Srednia z matematyki dla dwóch uczniów - żeby pokazać jak dochodziłyśmy do ostatecznej wersji metody
    public static Double getSredniaMatematyka(UczenKlasy3a uczen1, UczenKlasy3a uczen2){
        Double srednia = (uczen1.getOcenaZmatematyki() + uczen2.getOcenaZmatematyki()) / 2.0;
        return srednia;
    }

    // Srednia z matematyki dla dowolnej liczby uczniów
    public static Double getSredniaMatematyka(List<UczenKlasy3a> uczniowie){
        Double suma = 0.0;
        for (UczenKlasy3a uczen : uczniowie) suma = suma + uczen.getOcenaZmatematyki();
        Double srednia = suma / uczniowie.size();
        return srednia;
    }

    public static double getSredniaPolski(List<UczenKlasy3a> uczniowie){
        Double suma = 0.0;
        for (UczenKlasy3a uczen : uczniowie) suma = suma + uczen.getOcenaZpolskiego();
        Double srednia = suma / uczniowie.size();
        return srednia;
    }
    // Srednia ocen dla dowolnego ucznia
    public static Double getSredniaOcen(UczenKlasy3a uczen){
        Double srednia = (uczen.getOcenaZmatematyki() + uczen.getOcenaZpolskiego() + uczen.getOcenaZmuzyki() + uczen.getOcenaZbiologii())/4.0;
        return srednia;
    }

    public static void main(String[] args){

        UczenKlasy3a moniczka = new UczenKlasy3a("Moniczka", "Nowak", 2, 3, 3, 5, 3, OcenaZzachowania.POPRAWNY.name());
        UczenKlasy3a dżessika = new UczenKlasy3a("Dżessika", "Pupas", 3, 4, 3, 4, 4, "dobre");
        UczenKlasy3a kunegunda = new UczenKlasy3a("Kunegunda", "Ryćko", 4, 4, 4, 4, 2, "dobre");
        UczenKlasy3a bolek = new UczenKlasy3a("Bolek", "Tajniak", 5, 2, 3, 5, 5, "dobre");
        UczenKlasy3a lolek = new UczenKlasy3a("Lolek", "Wędrowycz", 6, 6, 6, 5, 6, "wzorowe");
        UczenKlasy3a tolek = new UczenKlasy3a("Tolek", "Żulski", 7, 5, 2, 6, 4, "dobre");

        System.out.println("Sposób 1:");
        System.out.println(getSredniaOcen(moniczka));
        System.out.println(getSredniaOcen(dżessika));
        System.out.println(getSredniaOcen(kunegunda));
        System.out.println(getSredniaOcen(bolek));
        System.out.println(getSredniaOcen(lolek));
        System.out.println(getSredniaOcen(tolek));

        System.out.println("Sposób 2:");
        System.out.println(moniczka.getSredniaOcen());
        System.out.println(dżessika.getSredniaOcen());
        System.out.println(kunegunda.getSredniaOcen());
        System.out.println(bolek.getSredniaOcen());
        System.out.println(lolek.getSredniaOcen());
        System.out.println(tolek.getSredniaOcen());

        // ===============
        System.out.println("===============");
        System.out.println(getSredniaMatematyka(moniczka, bolek));
        System.out.println(getSredniaMatematyka(Arrays.asList(moniczka, bolek)));

        System.out.println(moniczka.getNazwisko());
        System.out.println(getNazwisko(moniczka));

        System.out.println(getSredniaMatematyka(Arrays.asList(moniczka, dżessika, kunegunda, bolek,lolek, tolek)));
        // Można oddzielnie zadeklarować listę
        List listaUczniow = Arrays.asList(moniczka, dżessika, kunegunda, bolek,lolek, tolek);
        System.out.println(getSredniaMatematyka(listaUczniow));
        //System.out.println(getSredniaMatematyka(moniczka, dżessika));
        //System.out.println(getSredniaMatematyka(Arrays.asList(UczenKlasy3a.getNazwisko())));

    }

}