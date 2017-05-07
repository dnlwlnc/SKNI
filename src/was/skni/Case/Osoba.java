package was.skni.Case;

import java.util.Date;

/**
 * Created by Daniel on 06.05.2017.
 */
public abstract class Osoba {
    String imie;
    String nazwisko;
    Date birthday;

    Osoba(String imie, String nazwisko, Date birthday) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.birthday=birthday;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
