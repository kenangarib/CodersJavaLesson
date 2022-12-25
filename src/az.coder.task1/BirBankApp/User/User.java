package az.coder.task1.BirBankApp.User;

import java.time.LocalDate;

public class User<U> {
    /*private*/  public  U id;
    /*private*/  public  U name;
    /*private*/  public  U surName;
    /*private*/  public  U pin;
    /*private*/  public  LocalDate birthDate;

    public User(U id, U name, U surName, U pin, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.pin = pin;
        this.birthDate = birthDate;
    }
    public User(){

    }

    public U getId() {
        return id;
    }

    public void setId(U id) {
        this.id = id;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    public U getSurName() {
        return surName;
    }

    public void setSurName(U surName) {
        this.surName = surName;
    }

    public U getPin() {
        return pin;
    }

    public void setPin(U pin) {
        this.pin = pin;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", surName=" + surName +
                ", pin=" + pin +
                ", birthDate=" + birthDate +
                '}';
    }
}
