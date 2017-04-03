package zajecia1;

/**
 * Created by Daniel on 23.03.2017.
 */
public class Tekst {
    public static void main(String[] args){
        String s1 = "TEKST";
        String s2 = "s1 = " + s1;
        String s3 = "tekst";
        System.out.println(s2);

        //String w przeciwienstwie do int a podobnie do Integer - to obiekt

        System.out.println(s1.length());
        System.out.println(s1.toLowerCase().equals(s3.toLowerCase())); //equals porównuje dwa Stringi
    }
}
