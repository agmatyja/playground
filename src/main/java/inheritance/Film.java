package inheritance;

public class Film extends Utwor {

    String autor;
    String tytuł;
    String gatunek;

    public Film(String autor, String tytuł, String gatunek) {
        super(autor, tytuł, gatunek);
    }
}
