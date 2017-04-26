package was.skni.zajecia4;


import java.util.Date;

public abstract class Person {

    String firstName;
    String surname;
    Date birthday;

    Person (String firstName, String surname, Date birthday) {
        this.firstName=firstName;
        this.surname=surname;
        this.birthday=birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return 0;
    }

}
