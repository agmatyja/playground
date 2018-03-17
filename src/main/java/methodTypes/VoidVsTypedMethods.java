package methodTypes;

/**
 * Created by Magdalena Strzelczyk on 11.03.2018.
 */
public class VoidVsTypedMethods {

    private static void dontReturnString() {
        String tekst = "Jestem metodą która nie zwraca tekstu";
        System.out.println(tekst);
    }

    private static String returnString() {
//        String tekst = "Jestem metodą która zwraca tekst";
//        System.out.println(tekst);
        return "Jestem metodą która zwraca tekst";
    }

    public static void main(String[] args) {
        dontReturnString();
//        returnString();
        String pierwszaZmiennaTekstowa = returnString();
        //String drugaZmiennaTekstowa = dontReturnString();
        System.out.println(pierwszaZmiennaTekstowa);
        //System.out.println(drugaZmiennaTekstowa);
    }
}
