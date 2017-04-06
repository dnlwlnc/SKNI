package was.skni.zajecia3;

/**
 * Created by Daniel on 06.04.2017.
 */
public class Start {
    public static void main(String[] args){

/*        Dog dogBurek=new Dog();
        System.out.println(dogBurek);

        Dog dogMax = new Dog("Max", 3, Breed.GOLDEN);
        System.out.println(dogMax);


        dogMax.setName("Rodzyn");
        System.out.println(dogMax.getName());

        dogMax.getAge();
        dogMax.setAge(13);
        dogMax.getOlder(2);
        System.out.println(dogMax);*/


        Dog dogMax = new Dog("Max", 3, Breed.GOLDEN);
        Dog dogBurek=new Dog();
        Dog dogRodzyn = new Dog("Rodzyn", 1, Breed.LABRADOR);
        Dog dogKoles = new Dog("Koles", 10, Breed.DACHSHUND);
        Dog dogMops = new Dog("Mops", 4, Breed.PUG);
        Dog dogMishka = new Dog("Mishka", 8, Breed.LABRADOR);

/*        System.out.println(Dog.dogList.size());

        for (Dog d : Dog.dogList) {
            if (d.getBreed() == Breed.PUG) {
                System.out.println("Mopsy: ");
                System.out.println(d);
            }
        }

        System.out.println("\nPsy młodsze niż 5 lat: ");
        for (Dog i : Dog.dogList) {
            if (i.getAge() < 5) {
                System.out.println(i);
            }
        }*/

        dogRodzyn.woof();
        dogRodzyn.teachWoof();
        dogRodzyn.woof();

        dogRodzyn.sit();
        dogRodzyn.teachSit();
        dogRodzyn.sit();

        for (Dog i : Dog.dogList) {
                i.teachSit();
        }

        dogKoles.sit();
        //Dog.dogList.get(0).woof();

        ;
        System.out.println(dogBurek.poleKwadratu(4));
    }
}
