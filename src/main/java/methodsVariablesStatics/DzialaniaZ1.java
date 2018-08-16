package methodsVariablesStatics;

/**
 * @author Agnieszka Matyja
 */


public  class DzialaniaZ1{

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 5;

    public static Integer suma (int a, int b ){
        int suma = a + b;
    return suma;
    }

    public static Integer różnica(int a, int b) {
        int różnica = a - b;
        return różnica;
    }

    public static Integer iloczyn(int a, int b) {
        int iloczyn = a * b;
        return iloczyn;
    }

    public static Integer iloraz(int a, int b) {
        int iloraz = a / b;
        return iloraz;
    }

    public static void main(String[] args) {

        System.out.println("suma: " + DzialaniaZ1.suma(int a, int b));
        System.out.println("różnica: " + DzialaniaZ1.różnica());
        System.out.println("iloczyn: " + DzialaniaZ1.iloczyn());
        System.out.println("iloraz: " + DzialaniaZ1.iloraz());
    }

}
