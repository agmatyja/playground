package methodsVariablesStatics;

/**
 * Created by Magdalena Strzelczyk on 23.06.2018.
 */
public enum OcenaZzachowania {

    WZOROWY("wzorowy"),
    DOBRY("dobry"),
    POPRAWNY("poprawny"),
    NIEODPOWIENI("nieodpowiedni"),
    NAGANNY("naganny");

    String nazwaOceny;

    OcenaZzachowania(String nazwaOceny) {
        this.nazwaOceny = nazwaOceny;
    }
}
