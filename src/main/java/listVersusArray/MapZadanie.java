package listVersusArray;

import objects.Mieszkanie;

/**
 * @author Olaf Matyja
 */


public class MapZadanie {

    int pietro ;
    int czynsz;

    static Mieszkanie mieszk1 = new Mieszkanie("Kowalski", 1, 45);
    static Mieszkanie mieszk2 = new Mieszkanie("Matyja", 5, 99);
    static Mieszkanie mieszk3 = new Mieszkanie("Strzelczyk", 6, 60);
    static Mieszkanie mieszk4 = new Mieszkanie("Posnik", 9, 70);

    public void wspolczynnikCzynsz(){
        if (pietro==1) {
            czynsz = 6;
        }
        if (pietro==5) {
            czynsz = 10;
        }
        if (pietro==6) {
            czynsz = 12;
        }
        if (pietro==9) {
            czynsz = 14;
        }
    }

}

