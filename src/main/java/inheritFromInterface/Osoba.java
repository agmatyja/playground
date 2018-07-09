package inheritFromInterface;

/**
 * Created by Magdalena Strzelczyk on 03.07.2018.
 */
public class Osoba implements Pracownik, Student {

    private String nazwisko;
    private String studentId, pracownikId;
    private Double srednia;
    private Integer pensja;
    private String kierunek, uczelnia, stanowisko, firma;

    public Osoba(String nazwisko, String pracownikId, Integer pensja, String stanowisko, String firma) {
        this.nazwisko = nazwisko;
        this.pracownikId = pracownikId;
        this.pensja = pensja;
        this.stanowisko = stanowisko;
        this.firma = firma;
    }

    public Osoba(String nazwisko, String studentId, Double srednia, String kierunek, String uczelnia) {
        this.nazwisko = nazwisko;
        this.studentId = studentId;
        this.srednia = srednia;
        this.kierunek = kierunek;
        this.uczelnia = uczelnia;
    }

    public Osoba(String nazwisko,
                 String pracownikId, Integer pensja, String stanowisko, String firma,
                 String studentId, Double srednia, String kierunek, String uczelnia) {
        this.nazwisko = nazwisko;
        this.pracownikId = pracownikId;
        this.pensja = pensja;
        this.stanowisko = stanowisko;
        this.firma = firma;
        this.studentId = studentId;
        this.srednia = srednia;
        this.kierunek = kierunek;
        this.uczelnia = uczelnia;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPracownikId() {
        return pracownikId;
    }

    public void setPracownikId(String pracownikId) {
        this.pracownikId = pracownikId;
    }

    public Double getSrednia() {
        return srednia;
    }

    public void setSrednia(Double srednia) {
        this.srednia = srednia;
    }

    public Integer getPensja() {
        return pensja;
    }

    public void setPensja(Integer pensja) {
        this.pensja = pensja;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public String getUczelnia() {
        return uczelnia;
    }

    public void setUczelnia(String uczelnia) {
        this.uczelnia = uczelnia;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
