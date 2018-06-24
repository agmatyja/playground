package methodsVariablesStatics;

/**
 * Created by Magdalena Strzelczyk on 24.05.2018.
 */
public class KlasaJeden {

    public static void main(String[] args) {
        KlasaDwa aaa = new KlasaDwa();
        // Wywołanie metody statycznej zdefiniowanej w innej klasie - wymaga podania ścieżki - nazwy klasy
        KlasaDwa.metoda1();
        // Wywołanie metody statycznej też może być na obiekcie:
        aaa.metoda1();
        // Wywołanie metody niestatycznej zdefiniowanej w innej klasie - musi być na obiekcie
        aaa.metoda2();
    }

}
