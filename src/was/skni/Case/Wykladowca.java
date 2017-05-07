package was.skni.Case;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * Created by Daniel on 06.05.2017.
 */
public class Wykladowca extends Osoba {
    private int idWykladowcy;
    private static int counter;
    private static int limitWykladowcy;
    private List<Przedmiot> prowadzonePrzedmioty;
    private static List<Wykladowca> wszyscyWykladowcy = new ArrayList<>();
    private  Map<String, Boolean> skrzynkaOdbiorcza = new HashMap<>();

    Wykladowca(String imie, String nazwisko, Date birthday) {
        super(imie, nazwisko, birthday);
        idWykladowcy = counter;
        counter++;
        limitWykladowcy = 5;
        wszyscyWykladowcy.add(this);
        this.prowadzonePrzedmioty = new ArrayList<>();
        this.skrzynkaOdbiorcza = new HashMap<>();
    }

    public void wyslijWiadomosc(Student s, String wiadomosc){
        s.getSkrzynkaOdbiorcza().put(wiadomosc, false);
    }

    public void odbierzWiadomosc(){
        for (Map.Entry<String, Boolean> entry : skrzynkaOdbiorcza.entrySet()) {
            if(entry.getValue() == false) {
                System.out.println(entry.getKey());
                skrzynkaOdbiorcza.put(entry.getKey(), true);
            }
        }
    }

    public int wiadomosciNieodebrane(){
        int wiadomosci=0;
        for(Map.Entry<String, Boolean> entry : skrzynkaOdbiorcza.entrySet()){
            if(entry.getValue() == false){
                wiadomosci = wiadomosci+1;
            }
        }

        return wiadomosci;
    }

    public static int getLimitWykladowcy() {
        return limitWykladowcy;
    }

    public static void setLimitWykladowcy(int limitWykladowcy) {
        Wykladowca.limitWykladowcy = limitWykladowcy;
    }

    public int getIdWykladowcy() {
        return idWykladowcy;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Wykladowca.counter = counter;
    }

    public List<Przedmiot> getProwadzonePrzedmioty() {
        return prowadzonePrzedmioty;
    }

    public void setProwadzonePrzedmioty(List<Przedmiot> prowadzonePrzedmioty) {
        this.prowadzonePrzedmioty = prowadzonePrzedmioty;
    }

    public static List<Wykladowca> getWszyscyWykladowcy() {
        return wszyscyWykladowcy;
    }

    public static void setWszyscyWykladowcy(List<Wykladowca> wszyscyWykladowcy) {
        Wykladowca.wszyscyWykladowcy = wszyscyWykladowcy;
    }


    public void setIdWykladowcy(int idWykladowcy) {
        this.idWykladowcy = idWykladowcy;
    }

    public Map<String, Boolean> getSkrzynkaOdbiorcza() {
        return skrzynkaOdbiorcza;
    }

    public void setSkrzynkaOdbiorcza(Map<String, Boolean> skrzynkaOdbiorcza) {
        this.skrzynkaOdbiorcza = skrzynkaOdbiorcza;
    }
}

