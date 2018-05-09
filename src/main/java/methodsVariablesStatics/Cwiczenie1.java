package methodsVariablesStatics;

/**
 * @author Agnieszka Matyja
 */
public class Cwiczenie1 {
    public static String mojString = "bojam sie bojam";

    public static void main(String[] args) {
        anotherPrintZm();
    }
    public static void anotherPrintZm() {
        System.out.println(mojString);
        // Zeby wydrukowac: "bojam sie bojam, oj bardzo ja sie bojam"
        System.out.println(mojString + ", oj bardzo ja sie bojam");
    }
}
// bojam sie bojam