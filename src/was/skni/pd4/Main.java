package was.skni.pd4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("C:\\Users\\welencd\\IdeaProjects\\SKNI\\filmy.txt");
        Scanner scanner = new Scanner(input);
        while(scanner.hasNext()){
            new Film(scanner.next(), Double.parseDouble(scanner.next()), Integer.parseInt(scanner.next()));
        }

        File inputKsiazki = new File("C:\\Users\\welencd\\IdeaProjects\\SKNI\\ksiazki.txt");
        Scanner scannerKsiazki = new Scanner(inputKsiazki);
        while(scannerKsiazki.hasNext()){
            new Ksiazka(scannerKsiazki.next(), Double.parseDouble(scannerKsiazki.next()), Integer.parseInt(scannerKsiazki.next()));
        }

        Film.najdluzszyFilm(Film.getAllFilms());
        Ksiazka.najdrozszaKsiazka(Ksiazka.getAllBooks());

    }
}
