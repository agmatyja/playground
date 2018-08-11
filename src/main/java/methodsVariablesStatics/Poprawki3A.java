package methodsVariablesStatics;

/**
 * @author Agnieszka Matyja
 */
public class Poprawki3A {
    static UczenKlasy3a moniczka = new UczenKlasy3a("Moniczka", "Nowak", 2, 5, 3, 5, 3, "poprawne");
    static UczenKlasy3a dżessika = new UczenKlasy3a("Dżessika", "Pupas", 3, 6, 3, 4, 4, "dobre");
    static UczenKlasy3a kunegunda = new UczenKlasy3a("Kunegunda", "Ryćko", 4, 4, 4, 4, 2, "dobre");
    static UczenKlasy3a bolek = new UczenKlasy3a("Bolek", "Tajniak", 5, 2, 3, 5, 5, "dobre");
    static UczenKlasy3a lolek = new UczenKlasy3a("Lolek", "Wędrowycz", 6, 6, 6, 5, 6, "wzorowe");
    static UczenKlasy3a tolek = new UczenKlasy3a("Tolek", "Żulski", 7, 5, 2, 6, 4, "dobre");

    public static void getPoprawkiPolski(int poprawkiPolski, UczenKlasy3a uczen) {
        if (uczen.getOcenaZpolskiego()<poprawkiPolski) {
            uczen.setOcenaZpolskiego(poprawkiPolski);
        }
    }

    public static void main(String[] args){
        System.out.println("Bolek - polski:" + bolek.getOcenaZpolskiego());
        int bolekPoprawkaPolski = 4;
        int moniczkaPoprawkaPolski = 6;
        getPoprawkiPolski(bolekPoprawkaPolski, bolek);
        getPoprawkiPolski(moniczkaPoprawkaPolski, moniczka);
        System.out.println("Bolek - polski:" + bolek.getOcenaZpolskiego());
        System.out.println("Moniczka - polski: " + moniczka.getOcenaZpolskiego());
    }
}
