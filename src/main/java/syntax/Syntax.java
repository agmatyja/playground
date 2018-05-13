package syntax;

/**
 * @author Agnieszka Matyja
 */
public class Syntax {
    private int number;
    private String text = "textology";

    public Syntax(int number){
        this.number = number;
    }

    public double mul(double x, double y){
        return x * y;
    }
    public int fac (int a){
        int f =1;
        for(int i=1; i<=a; i++){
            f = f * i;
        }
        return f;
    }
}
