package was.skni.pd3;

/**
 * Created by Daniel on 09.04.2017.
 */
public class Main {
    public static void main(String[] args){
        Kwadrat nowyProstokat = new Kwadrat();
        System.out.println(nowyProstokat);
        Kwadrat drugi = new Kwadrat(-10,20);
        System.out.println(drugi);
        int bokTestowy = 5;

        System.out.println("Pole prostokąta to: " + drugi.poleProstokata());
        System.out.println(drugi.czyKwadrat());
        System.out.printf("W twój prostokąt można wpisać %d kwadratów o boku %d\n", drugi.ileKwadratow(bokTestowy), bokTestowy);
        System.out.printf("Koło, które ma mieć pole równe polu podanego prostokąta musi mieć promień długości: %.2f", drugi.promienKola());
    }
}
