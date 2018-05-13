package listVersusArray;

import objects.Mieszkanie;

/**
 * @author Agnieszka Matyja
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

    public static void main(String[]args){
        //MapZadanie = new MapZadanie("Kowalski", 1, 45);

        System.out.println("Czynsze lokatorskie: ");
        System.out.println(mieszk1.getWlasciciel() + ": " + mieszk1.getMetraz() );
        System.out.println(mieszk2.getWlasciciel() + ": " + mieszk2.getMetraz() );
        System.out.println(mieszk3.getWlasciciel() + ": " + mieszk3.getMetraz() );
        System.out.println(mieszk4.getWlasciciel() + ": " + mieszk4.getMetraz() );
    }
}

