package listVersusArray;

/**
 * @author Olaf Matyja
 */
public class Lokator {

    private String nrMieszkania;
    private String nazwisko;
    private int metraz;

    public Lokator(String pośnik, int i) {
    }

    public Lokator(int metraz, String nazwisko, String nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
        this.nazwisko = nazwisko;
        this.metraz = metraz;
    }

    public String getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(String nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getMetraz() {
        return metraz;
    }

    public void setMetraz(int metraz) {
        this.metraz = metraz;
    }

    public int getCzynsz() {
        return metraz * 100;
    }

    @Override
    public String toString() {
        return nazwisko + " nr mieszkania " + nrMieszkania +" metraż " + metraz + " czynsz " + metraz * 100 + " PLN";
    }
}


