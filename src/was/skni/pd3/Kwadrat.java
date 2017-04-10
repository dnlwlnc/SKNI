package was.skni.pd3;

/**
 * Created by Daniel on 09.04.2017.
 */
public class Kwadrat {
    private int a, b;

    Kwadrat(){
        this.a=0;
        this.b=0;
    }

    Kwadrat(int bokA, int bokB){
        if(bokA > 0 && bokB > 0){
            this.a = bokA;
            this.b = bokB;
        } else {
            System.out.println("Kwadrat nie może mieć ujemnych długości boków.");
        }

    }

    public String czyKwadrat(){
        if (this.a==this.b){
            return "Twój prostokąt to kwadrat!";
        } else return "Twój prostokąt to nie-kwadrat. ;-)";
    }

    public double promienKola(){
        return Math.sqrt(this.poleProstokata()/3.14);
    }

    public int ileKwadratow(int boczek){
        return (this.a/boczek)*(this.b/boczek);
    }

    public int poleProstokata(){
        return this.a*this.b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String toString() {
        return "Bok A: " + this.a + "\nBok B: " + this.b;
    }
}
