package inheritance;

public class Ksiazka extends Utwor {

    String autor;
    String tytuł;
    String gatunek;

    public Ksiazka(String autor, String tytuł, String gatunek) {
        super(autor, tytuł, gatunek);
    }

}
