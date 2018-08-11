package methodsVariablesStatics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Magdalena Strzelczyk on 31.05.2018.
 */
public class UczenKlasy3a implements Comparable<UczenKlasy3a> {
    private String imię;
    private String nazwisko;
    private Integer nrWdzienniku;
    private Integer ocenaZmatematyki;
    private Integer ocenaZpolskiego;
    private Integer ocenaZmuzyki;
    private Integer ocenaZbiologii;
    private String zachowanie;
    private static String matematyczka = "Kunegunda Czopek";
    private static String polonistka = "Hermenegilda Brzdąc";
    private static String muzyczka = "Leokadia Zając";
    private static String biolożka = "Perpetua Cichy";

    public UczenKlasy3a(String imieUcznia, String nazwisko, Integer nrWdzienniku, Integer ocenaZmatematyki, Integer ocenaZpolskiego, Integer ocenaZmuzyki, Integer ocenaZbiologii, String zachowanie){
        // System.out.println("blabla");
        this.imię = imieUcznia;
        this.nazwisko = nazwisko;
        this.nrWdzienniku = nrWdzienniku;
        this.ocenaZmatematyki = ocenaZmatematyki;
        this.ocenaZpolskiego = ocenaZpolskiego;
        this.ocenaZmuzyki = ocenaZmuzyki;
        this.ocenaZbiologii = ocenaZbiologii;
        this.zachowanie = zachowanie;
    }

    public UczenKlasy3a() {
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

    public void setOcenaZmatematyki(Integer ocenaZmatematyki) {
        this.ocenaZmatematyki = ocenaZmatematyki;
    }

    public Integer getOcenaZmatematyki() {
        return ocenaZmatematyki;
    }

    public void setOcenaZbiologii(Integer ocenaZbiologii) {
        this.ocenaZbiologii = ocenaZbiologii;
    }
    public Integer getOcenaZbiologii() {
        return ocenaZbiologii;
    }

    public void setOcenaZmuzyki(Integer ocenaZmuzyki) {
        this.ocenaZmuzyki = ocenaZmuzyki;
    }

    public Integer getOcenaZmuzyki() {
        return ocenaZmuzyki;
    }

    public Integer getOcenaZpolskiego() {
        return ocenaZpolskiego;
    }

    public void setOcenaZpolskiego(Integer ocenaZpolskiego) {
        this.ocenaZpolskiego = ocenaZpolskiego;
    }
    public String getZachowanie() {
        return zachowanie;
    }

    public void setZachowanie(String zachowanie) {
        this.imię = zachowanie;
    }

    public Double getSredniaOcen() {
        Double srednia = 0.0;
        if (ocenaZpolskiego != null & ocenaZbiologii != null & ocenaZmatematyki != null & ocenaZmuzyki != null) {
            srednia = (ocenaZpolskiego + ocenaZbiologii + ocenaZmatematyki + ocenaZmuzyki)/4.0;
        }
        return srednia;
    }

    public static String getMatematyczka() {
        return matematyczka;
    }
    public static String getPolonistka() {
        return polonistka;
    }
    public static String getMuzyczka() {
        return muzyczka;
    }
    public static String getBiolożka() {
        return biolożka;
    }

    public int compareTo(UczenKlasy3a jestemGlupimParametrem) {
        if(nazwisko.equals(jestemGlupimParametrem.nazwisko))
            if(imię.equals(jestemGlupimParametrem.imię))
                return 0;
            else if(imię.compareTo(jestemGlupimParametrem.imię)>0)
                return 1;
            else
                return -1;
        else if(nazwisko.compareTo(jestemGlupimParametrem.nazwisko)>0)
            return 1;
        else
            return -1;
    }



    @Override
    public String toString() {
        return "UczenKlasy3a{" +
                "imię=" + imię +
                ", nazwisko=" + nazwisko +
                ", nrWdzienniku=" + nrWdzienniku +
                ", zachowanie=" + zachowanie +
                ", średnia ocen= " + getSredniaOcen() + ")";
    }
}