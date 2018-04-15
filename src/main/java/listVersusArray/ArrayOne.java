package listVersusArray;

public class ArrayOne {

    static Integer[] intArrayOne = {3,4,5};
    static String[] stringArrayOne = {"one", "two", "three"};
    static Boolean[] booleanArrayOne = {true, false, true, false, true};
    static Object[] objectArrayOne = {1, "two", true};

    public static void main(String[] args) {
        System.out.println(booleanArrayOne.length);
        System.out.println(stringArrayOne[2]);
        for (int i = 0; i < booleanArrayOne.length; i++) {
            if (booleanArrayOne[i] == true) {
                System.out.println("Element nr:" + i);
            }
        }
    }

}
