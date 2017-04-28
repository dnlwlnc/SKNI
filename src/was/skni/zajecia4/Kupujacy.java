package was.skni.zajecia4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Asia on 2017-04-20.
 */
public class Kupujacy extends Person{

    private int id;
    static private int counter = 0;
    int money;
    private List<Book> booksBought;
    private static List<Kupujacy> allKupujacy = new ArrayList<>();

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public static List<Kupujacy> getAllKupujacy() {
        return allKupujacy;
    }

    Kupujacy(String firstName, String surname, Date birthday, int money) {
        super (firstName,surname,birthday);
        this.money=money;
        this.booksBought=new ArrayList<>();
        id = counter;
        counter++;
        allKupujacy.add(this);
    }

    public void buyBook(Book book, Pracownik p) {
        for (int i=0; i < p.getBooksAvailable().size(); i++) {
            if (p.getBooksAvailable().get(i).getAuthor() == book.getAuthor()){
                if (this.getMoney() >= p.getBooksAvailable().get(i).getPrice()) {
                    this.getBooksBought().add(p.getBooksAvailable().get(i));
                    this.money -= p.getBooksAvailable().get(i).getPrice();
                    p.sellBook(i);
                }
                else {
                    System.out.println("You don't have enough money.");
                }
            }
        }
    }

    public int getMoney() {
        return money;
    }

    public List<Book> getBooksBought() {
        return booksBought;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setBooksBought(List<Book> booksBought) {
        this.booksBought = booksBought;
    }

    public static Kupujacy findById(int id) {
        for(int i = 0; i < allKupujacy.size(); i++) {
            if (id == allKupujacy.get(i).getId()){
                return allKupujacy.get(i);
            }
        }
        return null;
    }
}
