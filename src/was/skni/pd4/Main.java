package was.skni.pd4;

/**
 * Created by welencd on 2017-04-26.
 */
public class Main {
    public static void main(String[] args){
        Ksiazka mitologiaNordycka = new Ksiazka("Mitologia Nordycka", 30, 350);

        System.out.println(Ksiazka.getAllBooks().get(0).getCena());

    }
}
