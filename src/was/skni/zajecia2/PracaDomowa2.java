package was.skni.zajecia2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracaDomowa2 {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("c:\\Users\\Daniel\\IdeaProjects\\SKNI\\dane_obrazki.txt");
        Scanner skaner = new Scanner(input);
        int reverses = 0;
        int numberOfOnesHist = 0;
        int images = 0;
        int licznik = 0;

        while (skaner.hasNext()) {

            int numberOfZeroes = 0;
            int numberOfOnes = 0;

            for (int i = 0; i < 21; i++) {
                String wers = skaner.next();
                char[] wersChar = wers.toCharArray();
                if (wers.length() == 21) {
                    for (int j = 0; j < wersChar.length-1; j++) {
                        if (wersChar[j] == '0') {
                            numberOfZeroes++;
                        } else if (wersChar[j] == '1') {
                            numberOfOnes++;
                        }
                    }
                } else continue;
                if (numberOfOnes > numberOfOnesHist) numberOfOnesHist = numberOfOnes;
                licznik++;
            }
            if (numberOfOnes > numberOfZeroes) reverses++;
            images++;
            System.out.format("Obrazek: %d  Liczba jedynek: %d\n",images, numberOfOnes);
        }
        System.out.format("\nLiczba rewersów: %d\nNajwiększa liczba '1' w obrazku: %d\nLiczba wszystkich obrazków: %d", reverses, numberOfOnesHist, images);
    }
}