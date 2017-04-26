package was.skni.zajecia4;

import java.util.Date;

/**
 * Created by Asia on 2017-04-20.
 */
public class Test {
    public static void main(String[] args) {

//        Person p1 = new Person("Joanna", "Przygoda",
//                new Date(1994,05,29));

        Pracownik p=new Pracownik("Adam","Smith",
                new Date(1970,05,03),100,0);
        Kupujacy k=new Kupujacy("Ronald","Mc",
                new Date(1980,05,03),100);
        Book b1=new Book("A",25);
        Book b2=new Book("B",25);
        Book b3=new Book("C",25);
        Book b4=new Book("D",25);
        Book b5=new Book("E",25);
        Book b6=new Book("F",250);

        p.setBooksAvailable(Book.getAllBooks());
        System.out.println("Liczba książek sprzedającego: "+
                p.getBooksAvailable().size());
        System.out.println("Liczba książek kupującego: "+
                k.getBooksBought().size());

        k.buyBook(new Book("A"),p);
        p.setBooksAvailable(Book.getAllBooks());
        System.out.println("Liczba książek sprzedającego: "+
                p.getBooksAvailable().size()+" kasa: "+p.kasa);
        System.out.println("Liczba książek kupującego: "+
                k.getBooksBought().size()+" money:"+k.money);

        k.buyBook(new Book("F"),p);
        p.setBooksAvailable(Book.getAllBooks());
        System.out.println("Liczba książek sprzedającego: "+
                p.getBooksAvailable().size()+" kasa: "+p.kasa);
        System.out.println("Liczba książek kupującego: "+
                k.getBooksBought().size()+" money:"+k.money);


    }
}
