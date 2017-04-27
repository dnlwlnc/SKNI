package was.skni.pd4;

import java.util.ArrayList;
import java.util.List;

public class Ksiazka extends Produkt {

    private int liczbaStron;
    private static List<Ksiazka> allBooks = new ArrayList<>();

    Ksiazka(String tytul, double cena, int liczbaStron) {
        super(tytul, cena);
        this.liczbaStron=liczbaStron;
        allBooks.add(this);
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public static void setAllBooks(List<Ksiazka> allBooks) {
        Ksiazka.allBooks = allBooks;
    }

    public static List<Ksiazka> getAllBooks() {
        return allBooks;
    }

    public static void najdrozszaKsiazka(List<Ksiazka> allBooks) {
        Ksiazka.allBooks = allBooks;
        double naj = 0;
        int najPos = 0;
        for (int i = 0; i < allBooks.size(); i++) {
            if (allBooks.get(i).getCena() > naj) {
                naj = allBooks.get(i).getCena();
                najPos = i;
            }
        }
        System.out.println("Najdrozsza ksiazka to: " + allBooks.get(najPos).getTytul() + " - " + allBooks.get(najPos).getCena() + " PLN.");
    }
}
