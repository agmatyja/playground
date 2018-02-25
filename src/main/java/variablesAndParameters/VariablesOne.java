package variablesAndParameters;

/**
 * @author Olaf Matyja
 */
public class VariablesOne {

    private static String poesVariable="zmienna Poezji";


    public static void printOne() {
        System.out.println("To jest pierwsza " + poesVariable);
    }

    public static void printTwo() {
        System.out.println("To jest druga " + poesVariable);
    }

    public static void main(String[] args) {
        printOne();
        printTwo();
    }
}
