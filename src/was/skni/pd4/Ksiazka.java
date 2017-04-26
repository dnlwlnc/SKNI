package was.skni.pd4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by welencd on 2017-04-26.
 */
public class Ksiazka extends Produkt {

    int liczbaStron;
    private static List<Ksiazka> allBooks = new ArrayList<>();

    Ksiazka(String tytul, int cena, int liczbaStron) {
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
}
