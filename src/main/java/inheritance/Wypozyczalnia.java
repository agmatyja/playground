package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Wypozyczalnia {

    static Film film = new Film("Nowak", "Robale", "Horror");
    static Utwor utwor = new Film("Lewandowski", "Piłka", "Sport");
    // to jest to samo!!!!
    static List jakasLista = new ArrayList();
    static Ksiazka ksiazka = new Ksiazka("Malinowski", "Rozprawka o truskawkach", "Kulinarne");

    public static void printAutor(Utwor utwor) {
        System.out.println(utwor.getAutor());
    }

    public static void main(String[] args) {
        film.getGatunek();
        film.setAutor("Wisniewski");
        printAutor(film);
        printAutor(ksiazka);
    }

}
