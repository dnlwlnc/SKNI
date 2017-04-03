package zajecia2;

public class Arrays {
    public static void main(String[] args){

        // 1
        char[] tablicaChar = new char[]{'a','b','c','d','e','f','g','h'};

        for(int i=0;i<tablicaChar.length;i++){
            System.out.println(tablicaChar[i]);
        }

        // 2
        int a=10;
        int[] tablicaInt = new int[a];
        for(int i=0;i<tablicaInt.length;i++) {
            tablicaInt[i] = i * i;
        }
        for (int i=0;i<tablicaInt.length;i++) {
            System.out.print(tablicaInt[i] + "\t");
        }

        // 3
        boolean isIncreasing=true;
        int[] tab={1,3,3,4,5,6,7};
        for (int i=1; i < tab.length;i++) {
            if (tab[i]<=tab[i-1]) {
                isIncreasing=false;
            }
        }
        if (isIncreasing) {
            System.out.println("This array is increasing.");
        }
        else {
            System.out.println("This array is not increasing.");
        }

        // 4
        int[] arr1 = {7, 5, 2, 8};
        int[] arr2 = {6, 4, 3};
        int[] newArray = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        for(int i = arr1.length; i < newArray.length; i++) {
            newArray[i] = arr2[i - arr1.length];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        // 5
        int[][] tab2 = new int[3][3];
        int a2 = 1;
        for (int i=0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[0].length; j++) {
                tab2[i][j] = a2;
                a2++;
            }
        }

        System.out.println("");
        for (int i=0; i < tab2.length; i++) {
            for (int j=0; j<tab2[0].length; j++) {
                System.out.println(tab2[i][j] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println(tab2[0][1]);
    }

    public static void sort(char[] word1Arr) {
    }
}
