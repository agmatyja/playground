package methodTypes;

/**
 * Created by Magdalena Strzelczyk on 11.03.2018.
 */
public class SettingValue {
    static String example="przyklad";

    public static String stringMethod(){
        String zmienna1 = "zmienna z metory stringMethod";
        System.out.println(zmienna1);
        return zmienna1;
    }

    public static void voidMethod(){
        String zmienna1 = "zmienna z metory voidMethod";
        System.out.println(zmienna1);
    }

    public static void changeExampleValue() {
        example = "inny przykład";
    }

    public static void main (String[] args) {
        stringMethod();
        voidMethod();
        String zmiennaStringMethod = stringMethod();
        // String zmiennaVoidMethod = voidMethod(); <- nie można przypisać wartości z metody void!!!
        System.out.println(zmiennaStringMethod);

        // Metoda void też może zmienić wartość istniejącej zmiennej:
        changeExampleValue();
        System.out.println(example);
    }
}
