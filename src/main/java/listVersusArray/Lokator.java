package listVersusArray;

/**
 * @author Olaf Matyja
 */
public class Lokator {

    private int nrMieszkania;
    private String nazwisko;
    private int metraz;

    public Lokator(){};

    public Lokator(int nrMieszkania, String nazwisko, int metraz){
        this.metraz = metraz;
        this.nazwisko = nazwisko;
        this.nrMieszkania = nrMieszkania;
    };

    public int getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(int nrMieszkania) {
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
}
