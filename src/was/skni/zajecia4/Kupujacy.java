package was.skni.zajecia4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Asia on 2017-04-20.
 */
public class Kupujacy extends Person{

    int money;
    private List<Book> booksBought;


    Kupujacy(String firstName, String surname, Date birthday,
             int money) {
        super (firstName,surname,birthday);
        this.money=money;
        this.booksBought=new ArrayList<>();

    }

    public void buyBook(Book book, Pracownik p) {
        for (int i=0;i<p.getBooksAvailable().size();i++) {
            if (p.getBooksAvailable().get(i).getAuthor()==book.getAuthor()){
                if (this.getMoney()>=p.getBooksAvailable().get(i).getPrice()) {
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
}
