package was.skni.pd4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by welencd on 2017-04-26.
 */
public class Film extends Produkt{
    int czasTrwania;
    private static List<Film> allFilms = new ArrayList<>();

    Film(String tytul, int cena, int czasTrwania) {
        super(tytul, cena);
        this.czasTrwania=czasTrwania;
        allFilms.add(this);
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public static List<Film> getAllFilms() {
        return allFilms;
    }

    public void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public static void setAllFilms(List<Film> allFilms) {
        Film.allFilms = allFilms;
    }
}
