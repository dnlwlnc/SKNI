package zajecia1;

import java.util.Scanner;

/**
 * Created by Daniel on 23.03.2017.
 */
public class ScannerIn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.next();

        System.out.println("Imie:" + imie);
        System.out.println("Nazwisko" + nazwisko);

        int ocena = 0;
        System.out.println("Ocena w skali od 1 do 10");
        while(scanner.hasNext()){
            ocena = scanner.nextInt();
            if(ocena<=10 && ocena>=1){
                System.out.println("Twoja ocena to: " + ocena);
                break;
            }else{
                System.out.println("Ocena musi byc wp rzedziale 1-10");
            }
        }
    }
}
