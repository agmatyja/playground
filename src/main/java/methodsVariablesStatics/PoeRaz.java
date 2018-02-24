package methodsVariablesStatics;

/**
 * Created by Olaf on 2018-02-03.
 */
public class PoeRaz {

    private static int mojMalyInteger = 2;
    private static double mojMalyDouble = 2.0;
    private static boolean mojMalyBoolean = true;
    private static Integer mojInteger = 2;
    private static Double mojDouble = 2.0;
    private static Boolean mojBoolean = true;

    private static String mojString = "pitus";

    private static void anotherPrint1() {
        System.out.println(mojMalyInteger);
    }

    public void anotherPrint2() {
        anotherPrint1();
        System.out.println("hello2");
    }

    public static void anotherPrint3() {
        System.out.println("hello3");
    }
    public static void main(String[] args) {
        // Metody statyczne
        // a) z tej samej klasy:
        anotherPrint3();
        // b) z innej klasy:
        PoeDwa.anotherPrint22();

        // Metody niestatyczne
        // a) z tej samej klasy:
        PoeRaz poeRaz = new PoeRaz();
        poeRaz.anotherPrint2();
        // b) z innej klasy:
        PoeDwa poeDwa = new PoeDwa();
        poeDwa.anotherPrint44();
    }

}
