package zajecia1;

import java.util.Scanner;

public class PracaDomowa1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String language;
        int number;
        int largest = 0;
        int lowest = 0;
        int i=0;

        System.out.println("Wybierz język: ENG lub PL. / Choose your language: ENG or PL.");
        language = read.nextLine().toUpperCase();

        if(language.equals("ENG") || language.equals("EN")){
            do{

                System.out.println("Please pick your number: ");
                number = read.nextInt();
                if(i==0) lowest=number; //jeśli nie chcemy brać pod uwagę 0;
                if(number!=0 && number<lowest) lowest=number;
                if(number>largest) largest=number;
                if(number==0) System.out.println("The End. Largest number was: " + largest + " and lowest: " + lowest);
                i++; //jeśli nie chcemy brać pod uwagę 0;
            }while(number!=0);
        }else if (language.equals("PL") || language.equals("POL")){
            do{
                System.out.println("Wybierz liczbę: ");
                number = read.nextInt();
                if(i==0) lowest=number; //jeśli nie chcemy brać pod uwagę 0;
                if(number!=0 && number<lowest) lowest=number;
                if(number>largest) largest=number;
                if(number==0) System.out.println("Koniec. Największa liczba to: " + largest + " a najmniejsza: " + lowest);
                i++; //jeśli nie chcemy brać pod uwagę 0;
            }while(number!=0);
        }else{
            System.out.println("Wybrano niepoprawny język.");
        }
    }
}
