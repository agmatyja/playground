package variablesAndParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author Agnieszka Matyja
 */
public class TrzeciZlistyZ2 {
    static List<String> lista1 = Arrays.asList("elem1", "elem2", "elem3", "elem4");
    static List<String> lista1a = Arrays.asList("elem1a", "elem2a", "elem3a", "elem4a");
    static List<String> lista1b = Arrays.asList("elem1b", "elem2b");

    // 1. Parametry to wartość którą podajemy w nawiasach w definicji metody, czyli w poniższym przykładzie jakasLista
    // 2. W definicji metody możemy podać dowolną liczbę parametrów, oddzielamy je przecinkami
    // 3. Razem z nazwą parametru (dowolną, wymyśloną przez nas) koniecznie podajemy jego typ, czyli np. jak poniżej List<String>
    // 4. W ciele metody opisujemy, co robimy z parametrem - używając nazwy, którą mu danaliśmy
    // 5. Podczas wywołania metody podstawiamy w miejsce parametru konkretne dane - metoda zostanie wykonana z użyciem tych konkretnych danych
    // 6. Dane podczas wywołania metody muszą odpowiadać parametrom typem i ilością, czyli np. jeśli są dwa parametry, to musimy podać dwa argumenty
    // 7. Podczas wywołania metody nie podajemy typu

    public static void getTrzeciZlisty(List<String> x){
        if (x.size() < 3) {
            System.out.println("Lista jest za krótka");
        } else {
            System.out.println(x.get(3));
        }
    }

    public static void main(String[] args) {
        getTrzeciZlisty(lista1);
        getTrzeciZlisty(lista1a);
        getTrzeciZlisty(lista1b);
    }

}
