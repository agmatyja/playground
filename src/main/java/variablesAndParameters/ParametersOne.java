package variablesAndParameters;

/**
 * @author Agnieszka Matyja
 */
public class ParametersOne {

    private static String poesVariable="zmienna Poezji";
    private static String magdasVariable="zmienna Magdy";

    public static void printOne() {
        System.out.println("To jest pierwsza " + poesVariable);
    }

    public static void printTwo() {
        System.out.println("To jest druga " + poesVariable);
    }

    public static void printTree() {
        System.out.println("To jest pierwsza " + magdasVariable);
    }

    public static void printFour(String someonesVariable) {
        System.out.println("To jest pierwsza " + someonesVariable);
    }

    public static void main(String[] args){
        printOne();
        printTwo();
        printTree();

        // Wynik ten sam co powyżej:
        printFour(poesVariable);
        printTwo();
        printFour(magdasVariable);

        // Jak można tego używać:
        printFour(poesVariable);
        printFour("zmienna Olafa");
        // printFour(5); - nie można bo to liczba
        // ale moge tak:
        printFour(""+5);

        System.out.println(6);
        System.out.println(6+7);
        System.out.println("Wydrukuje liczbe " + 6);
        System.out.println(""+6+"i"+7);
    }
}
