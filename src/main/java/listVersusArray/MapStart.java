package listVersusArray;

/**
 * @author Olaf Matyja
 */
public class MapStart {

    static Lokator lok1 = new Lokator(50, "Kowalski","20");
    static Lokator lok2 = new Lokator(60, "Strzelczyk", "99");

    public static void main(String[] args) {
        lok1.setMetraz(50);
        lok1.setNazwisko("Kowalski");


        System.out.println(lok1.getNazwisko());
        System.out.println(lok2.getNazwisko());
    }
}
