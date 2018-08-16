package variablesAndParameters;

/**
 * @author Agnieszka Matyja
 */


public  class DzialaniaZ1{

    static int a = 1;
    static int b = 2;
    static int c = 3;
    static int d = 4;
    static int e = 5;

    public static Integer suma (int liczba1, int liczba2){
        int suma = liczba1 + liczba2;
    return suma;
    }

    public static Integer różnica(int liczba1, int liczba2) {
        int różnica = liczba1 - liczba2;
        return różnica;
    }

    public static Integer iloczyn(int liczba1, int liczba2) {
        int iloczyn = liczba1 * liczba2;
        return iloczyn;
    }

    public static Double iloraz(int liczba1, int liczba2) {
        double iloraz = liczba1 / (double)liczba2;
        return iloraz;
    }

    public static void liczenie (int liczba1, int liczba2) {
        System.out.println("Suma: " + (liczba1 + liczba2));
        System.out.println("Różnica: " + (liczba1 - liczba2));
        System.out.println("Iloczyn: " + (liczba1 * liczba2));
        System.out.println("Iloraz: " + (liczba1 / (double)liczba2));
    }

    public static void main(String[] args) {
        liczenie(a, b);
        liczenie(a, c);
        liczenie(c, d);
        liczenie(a, e);

        System.out.println("suma: " + suma(a, b));
        System.out.println("różnica: " + różnica(b,c));
        System.out.println("iloczyn: " + iloczyn(c,d));
        System.out.println("iloraz: " + iloraz(d,e));
    }

}
