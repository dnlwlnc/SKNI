package zajecia2;

public class Loops {
    public static void main(String[] args){
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.println("For is executing: " + i + " " + j);
            }
        }

        int[] tablica = new int[10];
        for(int i=0; i<10; i++){
            tablica[i]=i+1;
        }

        for(int x : tablica) System.out.format("Drukuje %d\n", x);
    }
}
