package zajecia1;

/**
 * Created by Daniel on 23.03.2017.
 */
public class Loops {
    public static void main(String[] args){
/*        int a = 8;
        while(a>4){
            System.out.println("A jest równe: " + a);
            a--;
            a-=1;
        }*/

        int b=0;
        do{

            if(b==5){
                break;
            }
            System.out.println("Powtórzenie: " + b);
            b+=1;
        }while(true);

    }
}
