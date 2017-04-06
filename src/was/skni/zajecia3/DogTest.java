package was.skni.zajecia3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Daniel on 06.04.2017.
 */
class DogTest {

    @Test

    void poleKwadratu() {
        Dog d = new Dog();
        int wynik = d.poleKwadratu(5);
        assertEquals(wynik, 25);
    }

    @Test
    public void canAddDogs() {
        Dog dogPrutek = new Dog("Prutek", 3, Breed.LABRADOR);
        Dog dogKaszanka = new Dog("Kaszanka", 6, Breed.GOLDEN);
        Dog dogPluto = new Dog("Pluto", 9, Breed.PUG);

        assertEquals(Dog.dogList.size(), 5);
    }

}