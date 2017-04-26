package was.skni.pd4;

/**
 * Created by welencd on 2017-04-26.
 */
public abstract class Produkt {
    String tytul;
    int cena;

    Produkt(String tytul, int cena){
        this.tytul=tytul;
        this.cena=cena;
    }

    public String getTytul() {
        return tytul;
    }

    public int getCena() {
        return cena;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
