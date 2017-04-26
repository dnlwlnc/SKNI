package was.skni.zajecia4;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pracownik extends Person {

    int salary;
    int kasa;
    private List<Book> booksAvailable;



    Pracownik(String firstName, String surname, Date birthday,
              int salary, int kasa) {
        super(firstName,surname,birthday);
        this.salary=salary;
        this.kasa=kasa;
        this.booksAvailable=new ArrayList<>();
    }

    public void sellBook(int index) {
        this.kasa+=this.getBooksAvailable().get(index).getPrice();
        this.getBooksAvailable().remove(index);
    }


    public int getSalary() {
        return salary;
    }

    public int getKasa() {
        return kasa;
    }

    public List<Book> getBooksAvailable() {
        return booksAvailable;
    }

    public void setBooksAvailable(List<Book> booksAvailable) {
        this.booksAvailable = booksAvailable;
    }
}
