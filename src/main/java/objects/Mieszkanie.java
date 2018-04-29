package objects;

/**
 * Created by Magdalena Strzelczyk on 29.04.2018.
 */
public class Mieszkanie {
    private String wlasciciel;
    private Integer pietro;
    private Integer metraz;

    // konstruktor 1
    public Mieszkanie() {}

    // konstruktor 2
    public Mieszkanie(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    // konstruktor 3
    public Mieszkanie(String wlasciciel, Integer pietro, Integer metraz) {
        this.wlasciciel = wlasciciel;
        this.pietro = pietro;
        this.metraz = metraz;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public Integer getPietro() {
        return pietro;
    }

    public void setPietro(Integer pietro) {
        this.pietro = pietro;
    }

    public Integer getMetraz() {
        return metraz;
    }

    public void setMetraz(Integer metraz) {
        this.metraz = metraz;
    }

    public static String statycznaMetoda() {
        return "Jestem statyczną metodą mieszkania";
    }
}
