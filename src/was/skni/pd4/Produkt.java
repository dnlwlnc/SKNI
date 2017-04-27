package was.skni.pd4;

/**
 * Created by welencd on 2017-04-26.
 */
public abstract class Produkt {
    String tytul;
    double cena;

    Produkt(String tytul, double cena){
        this.tytul=tytul;
        this.cena=cena;
    }

    public String getTytul() {
        return tytul;
    }

    public double getCena() {
        return cena;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
