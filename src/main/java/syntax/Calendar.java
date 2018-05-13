package syntax;

/**
 * @author Agnieszka Matyja
 */
public class Calendar {
    private int[] lenghts = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int calendar(int month, int day) {
        int dayNum = 0;

        for (int i = 0; i < month - 1; i++) {
            dayNum += lenghts[i] ;
        }
        dayNum = dayNum + day;
        return dayNum % 7;
    }

    public static void main(String[] args) {

    }
}
