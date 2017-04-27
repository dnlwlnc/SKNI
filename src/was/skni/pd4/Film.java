package was.skni.pd4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by welencd on 2017-04-26.
 */
public class Film extends Produkt{

    private int czasTrwania;
    private static List<Film> allFilms = new ArrayList<>();

    Film(String tytul, double cena, int czasTrwania) {
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

    public static void najdluzszyFilm(List<Film> allFilms) {
        Film.allFilms = allFilms;
        int naj=0;
        int najPos=0;
        for (int i=0; i<getAllFilms().size(); i++){
            if (allFilms.get(i).getCzasTrwania() > naj){
                naj = allFilms.get(i).getCzasTrwania();
                najPos = i;
            }
        }
        int h = allFilms.get(najPos).getCzasTrwania()/60;
        int min = allFilms.get(najPos).getCzasTrwania() % 60;
        System.out.println("Najdluzszy film to: " + allFilms.get(najPos).getTytul() + " - " + h + "h " + min + "min ");

    }
}
