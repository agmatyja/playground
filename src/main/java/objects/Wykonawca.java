package objects;

/**
 * Created by Magdalena Strzelczyk on 29.04.2018.
 */
public class Wykonawca {

    // stworzenie obiektu przez wywołanie konstruktora 1
    private static Mieszkanie mieszkanie2 = new Mieszkanie();
    // stworzenie obiektu przez wywołanie konstruktora 2
    private static Mieszkanie mieszkanie3 = new Mieszkanie("Matyja");
    // stworzenie obiektu przez wywołanie konstruktora 3
    private static Mieszkanie mieszkanie1 = new Mieszkanie("Kowalski", 1, 45);

    public static void main (String[] args){

        // Metody niestatyczne wykonujemy na obiekcie, czyli mieszkanie1
        mieszkanie2.setWlasciciel("Pośnik");

        System.out.println(mieszkanie1.getWlasciciel());
        System.out.println(mieszkanie2.getWlasciciel());

        System.out.println(mieszkanie1.getMetraz());
        System.out.println(mieszkanie2.getMetraz());
    }
}

