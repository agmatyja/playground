package methodsVariablesStatics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Magdalena Strzelczyk on 31.05.2018.
 */
public class UczenKlasy3a {
    private String imię;
    private String nazwisko;
    private Integer nrWdzienniku;
    private Integer ocenaZmatematyki;
    private Integer ocenaZpolskiego;
    private static String matematyczka = "Kunegunda Czopek";

    public UczenKlasy3a(){
    }

    public UczenKlasy3a(String imieUcznia, String nazwisko, Integer nrWdzienniku, Integer ocenaZmatematyki, Integer ocenaZpolskiego){
        // System.out.println("blabla");
        this.imię = imieUcznia;
        this.nazwisko = nazwisko;
        this.nrWdzienniku = nrWdzienniku;
        this.ocenaZmatematyki = ocenaZmatematyki;
        this.ocenaZpolskiego = ocenaZpolskiego;
    }


    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getNrWdzienniku() {
        return nrWdzienniku;
    }

    public void setNrWdzienniku(Integer nrWdzienniku) {
        this.nrWdzienniku = nrWdzienniku;
    }

    public Integer getOcenaZmatematyki() {
        return ocenaZmatematyki;
    }

    public void setOcenaZmatematyki(Integer ocenaZmatematyki) {
        this.ocenaZmatematyki = ocenaZmatematyki;
    }

    public Integer getOcenaZpolskiego() {
        return ocenaZpolskiego;
    }

    public void setOcenaZpolskiego(Integer ocenaZpolskiego) {
        this.ocenaZpolskiego = ocenaZpolskiego;
    }

    public static String getMatematyczka() {
        return matematyczka;
    }

    public static String getNazwisko(UczenKlasy3a uczen){
        String nazwisko = uczen.getNazwisko();
        return nazwisko;
    }

    // Srednia z matematyki dla dwóch uczniów
    public static Double getSredniaMatematyka(UczenKlasy3a uczen1, UczenKlasy3a uczen2){
        Double srednia = (uczen1.getOcenaZmatematyki() + uczen2.getOcenaZmatematyki()) / 2.0;
        return srednia;
    }

    // Srednia z matematyki dla dowolnej liczby uczniów
    public static Double getSredniaMatematyka(List<UczenKlasy3a> uczniowie){
        Double suma = 0.0;
        for (UczenKlasy3a uczen : uczniowie) {
            suma = suma + uczen.getOcenaZmatematyki();
        }
        Double srednia = suma / uczniowie.size();
        return srednia;
    }

    // ====================================================

    public static void main(String[] args){
        UczenKlasy3a janek = new UczenKlasy3a("Janek", "Kowalski", 1, 4, 5);
        System.out.println(janek.getImię());
        System.out.println(janek.getMatematyczka());

        UczenKlasy3a cienkiBolek = new UczenKlasy3a();
        System.out.println(cienkiBolek.getImię());
        System.out.println(cienkiBolek.getMatematyczka());

        cienkiBolek.setOcenaZmatematyki(3);
        System.out.println(getSredniaMatematyka(janek, cienkiBolek));
        System.out.println(getSredniaMatematyka(Arrays.asList(janek, cienkiBolek)));

        System.out.println(janek.getNazwisko());
        System.out.println(getNazwisko(janek));
    }

}