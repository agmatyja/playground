package listVersusArray;

/**
 * @author Agnieszka Matyja
 */
public class MapStart {

    // Dwa sposoby wkładania elementów do obiektu
    static Lokator lok1 = new Lokator();

    // 1. Przez konstruktor:
    static Lokator lok2 = new Lokator(60, "Strzelczyk", "99");

    public static void main(String[] args) {
        // 2. Przez setter:
        lok1.setMetraz(50);
        lok1.setNazwisko("Kowalski");
        lok1.setNrMieszkania("2");

        System.out.println(lok1.getNazwisko());
        System.out.println(lok2.getNazwisko());
    }
}
