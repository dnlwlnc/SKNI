package was.skni.pd3;

/**
 * Created by Daniel on 09.04.2017.
 */
public class Main {
    public static void main(String[] args){
        Kwadrat nowyProstokat = new Kwadrat();
        Kwadrat drugi = new Kwadrat(10,20);

        System.out.println(drugi.poleProstokata());
        System.out.println(drugi.czyKwadrat());
        System.out.println(drugi.ileKwadratow(2));
        System.out.printf("%.2f", drugi.promienKola());
    }
}
