package zajecia2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Anagramy {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("c:\\Users\\Daniel\\IdeaProjects\\SKNI\\dane_napisy.txt");
        Scanner scanner = new Scanner(input);
        int counter = 0;

        while (scanner.hasNext()) {
            String word1 = scanner.next();
            String word2 = scanner.next();
            boolean switcher = false;
            char[] word1Arr = word1.toCharArray();
            char[] word2Arr = word2.toCharArray();
            Arrays.sort(word1Arr);
            Arrays.sort(word2Arr);
            if(Arrays.equals(word1Arr, word2Arr)){
                switcher = true;
            }
            if (switcher){
                System.out.println(word1 + " - " + word2);
                counter++;
            }
        }

        System.out.println(counter);
    }
}
