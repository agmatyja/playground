package listVersusArray;

import java.util.ArrayList;
import java.util.List;

public class ListOne {

    static ArrayList<Integer> integerListOne = new ArrayList();
    // tak też jest ok:
    static List<Integer> integerListTwo = new ArrayList();
    // tak nie jest ok - wynika z dziedziczenia i abstrakcji - do pogadania później:
    // static List<Integer> integerListThree = new List(); <- nie można stworzyć obiektu typu List;

    static ArrayList<String> stringListOne = new ArrayList();
    static ArrayList<Boolean> booleanListOne = new ArrayList();
    static Object[] objectArrayOne = {1, "two", true};

    public static void addElements() {
        for (int i = 0; i < 3; i++) {
            integerListOne.add(i+1);
        }
        stringListOne.add("one");
        stringListOne.add("two");
        stringListOne.add("three");

        booleanListOne.add(true);
        booleanListOne.add(false);
        booleanListOne.add(true);
        booleanListOne.add(false);
        booleanListOne.add(true);
    }

    public static void main(String[] args) {
        addElements();

        System.out.println(booleanListOne.size());
        System.out.println(stringListOne.get(2));
        for (int i = 0; i < booleanListOne.size(); i++) {
            if (booleanListOne.get(i) == true) {
                System.out.println("Element nr:" + i);
            }
        }
    }

}
