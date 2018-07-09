package inheritFromClass;

public class Film extends Utwor {

    public Film(String autor, String tytuł, String gatunek) {
        super(autor, tytuł, gatunek);
    }

    @Override
    public void metodaDoNadpisania() {
        System.out.println("Ta metoda jest w klasie Film i nadpisała metodę z klasy Utwór.");
    }

}
