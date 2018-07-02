package inheritance;

public class Utwor {

    String autor;
    String tytuł;
    String gatunek;

    public Utwor(String autor, String tytuł, String gatunek) {
        this.autor = autor;
        this.tytuł = tytuł;
        this.gatunek = gatunek;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }
}
