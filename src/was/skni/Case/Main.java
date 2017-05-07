package was.skni.Case;

import was.skni.zajecia4.Forma;

import javax.swing.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daniel on 06.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        Wykladowca kowalski = new Wykladowca("Eugeniusz", "Kowalski", new Date(1970, 8, 9));
        Wykladowca fernowka = new Wykladowca("Paulina", "Fernowka", new Date(1988, 10, 25));

        Przedmiot matematyka = new Przedmiot("Matematyka", 2, kowalski);
        Przedmiot polski = new Przedmiot("Polski", 2, kowalski);
        Przedmiot przyroda = new Przedmiot("Przyroda", 2, kowalski);
        Przedmiot wf = new Przedmiot("WF", 2, kowalski);
        Przedmiot przedsiebiorczosc = new Przedmiot("Przedsiebiorczosc", 2, kowalski);

        Student welenc = new Student("Daniel", "Welenc", new Date(1990, 8, 9));
        Student rusjan = new Student("Kami", "Rusjan", new Date(1990, 12, 20));
        Student sicinski = new Student("Maciej", "Sicinski", new Date(1990, 4, 15));

        welenc.wyslijWiadomosc(kowalski, "Wiadomosc testowa");
        welenc.wyslijWiadomosc(fernowka, "Test2");
        kowalski.wyslijWiadomosc(rusjan, "Nie zdał pan");
        System.out.println("Kowalski " + kowalski.wiadomosciNieodebrane());
        System.out.println("Welenc " + welenc.wiadomosciNieodebrane());
        System.out.println("Rusjan " + rusjan.wiadomosciNieodebrane());
        kowalski.odbierzWiadomosc();
        welenc.odbierzWiadomosc();
        rusjan.odbierzWiadomosc();

    }
}
