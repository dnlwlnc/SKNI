package was.skni.zajecia3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 06.04.2017.
 */
public class Dog {

    private String name;
    private int age;
    private Breed breed;
    private boolean canWoof;
    private boolean canSit; //zmienne boolean by default maja wartosc FALSE

    public static List<Dog> dogList = new ArrayList<>(); // public static oznacza, że lista będzie dostępna zewsząd

    Dog(){
        this.name="Burek";
        this.age=0;
        this.breed=Breed.DACHSHUND;
        dogList.add(this);
    }

    //konstruktur psa
    Dog(String imie, int wiek, Breed rasa){
        if (imie!="" && imie!=null && wiek>=0){
            this.name=imie;
            this.breed=rasa;
            this.age=wiek;
            dogList.add(this);
        }else {
            System.out.println("Pies bez sensu");
        }
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int nowyWiek){
        this.age=nowyWiek;
    }


    //void nic nie zwraca
    public void setName(String noweImie) {
        this.name = noweImie;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void getOlder(int lata){
        this.age=this.age+lata;
    }


    public void woof(){
        if (this.canWoof) {
            System.out.println(this.name + ": WOOF WOOF");
        } else {
            System.out.println(this.name + " cannot woof.");
        }

    }

    public void teachWoof(){
        this.canWoof = true;
    }

    public void sit(){
        if (this.canSit) {
            System.out.println(this.name + ": is sitting");
        } else {
            System.out.println(this.name + " cannot sit.");
        }

    }

    public void teachSit(){
        this.canSit = true;
    }

    public int poleKwadratu(int bok) {
        return bok*bok;
    }

    public String toString(){ //do PUBLIC można odwołać się zewsząd; nadpisujemy metodę toString()
        return "Dog " + this.breed + " " + this.name + " is " + this.age + " yo.";
    }
}
