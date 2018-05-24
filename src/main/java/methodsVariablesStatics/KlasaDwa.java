package methodsVariablesStatics;

/**
 * Created by Magdalena Strzelczyk on 24.05.2018.
 */
public class KlasaDwa {

    // Definicja metody
    public static void metoda1() {
        System.out.println("metoda1");
    }

    // Definicja metody
    public void metoda2() {
        System.out.println("metoda2");
    }

    // Metody nie można wywołać luzem
    //metoda1();

    public static void main(String[] args) {
        KlasaDwa klasaDwa = new KlasaDwa();
        // Wywołanie metody statycznej w klasie, w której jest zdefiniowana - nie wymaga żadnej ścieżki
        metoda1();
        // Wywołanie metody statycznej też może być na obiekcie:
        klasaDwa.metoda1();
        // Wywołanie metody niestatycznej musi być na obiekcie - nawet jeśli ta metoda jest zdefiniowana w tej samej klasie
        klasaDwa.metoda2();
    }

}
