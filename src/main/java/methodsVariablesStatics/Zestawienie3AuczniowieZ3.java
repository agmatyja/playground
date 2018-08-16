package methodsVariablesStatics;



/**
 * @author Agnieszka Matyja
 */
public class Zestawienie3AuczniowieZ3 {


    public static void main(String[] args) {
        System.out.println("Imię, nazwisko, średnia ocen: ");
        System.out.println(KartaUcznia.getDaneUcznia(UczenKlasy3a()).getImie(moniczka) + KartaUcznia.getDaneUcznia(UczenKlasy3a()).getNazwisko(moniczka) + KartaUcznia.getDaneUcznia(UczenKlasy3a()).getSredniaOcen(moniczka));
        System.out.println(getSredniaOcen(dżessika));
        System.out.println(getSredniaOcen(kunegunda));
        System.out.println(getSredniaOcen(bolek));
        System.out.println(getSredniaOcen(lolek));
        System.out.println(getSredniaOcen(tolek));

        System.out.println("Sposób 2:");
        System.out.println(UczenKlasy3a.moniczka.getSredniaOcen());
        System.out.println(dżessika.getSredniaOcen());
        System.out.println(kunegunda.getSredniaOcen());
        System.out.println(bolek.getSredniaOcen());
        System.out.println(lolek.getSredniaOcen());
        System.out.println(tolek.getSredniaOcen());
}
}
//"get imię, nazwisko,średnią ocen uczniów 3A"