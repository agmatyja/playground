package inheritFromInterface;

/**
 * Created by Magdalena Strzelczyk on 03.07.2018.
 */
public class ZarzadcaOsob {

    static Osoba osoba1 = new Osoba("Kowalski", "1aa", 10000, "Dyr", "XXX", "aa1", 5.0, "IT", "ABC");
    static Student osoba2 = new Osoba("Nowak", "2aa", 9500, "Kier", "AAA", "aa2", 4.8, "Bio-Tech", "HGS");
    static Pracownik osoba3 = new Osoba("Jablonski", "3aa", 10500, "Prez", "CCC", "aa3", 4.9, "Mat", "WGS");

    public static void main(String[] args) {
        osoba1.getFirma();
        osoba1.getUczelnia();
        //osoba2.getFirma(); żle, bo osoba2 została stworzona jako Student
        osoba2.getUczelnia();
        osoba3.getFirma();
        //osoba3.getUczelnia(); źle, bo osoba3 została stworzona jako Pracownik
    }
}
