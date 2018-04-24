package listVersusArray;

/**
 * @author Olaf Matyja
 */
public class MapStart {

    static Lokator lok1 = new Lokator();
    static Lokator lok2 = new Lokator(53, "Strzelczyk", "99");

    public static void main(String[] args) {
        lok1.setMetraz(50);
        lok1.setNazwisko("Kowalski");
        lok1.setNrMieszkania("2");

        System.out.println(lok1.getNazwisko());
        System.out.println(lok2.getNazwisko());
    }
}
