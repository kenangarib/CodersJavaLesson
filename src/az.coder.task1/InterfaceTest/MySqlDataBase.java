package az.coder.task1.InterfaceTest;


public class MySqlDataBase implements DataBase {

    @Override
    public void get() {
        System.out.println("MySql DataBase get");
    }

    @Override
    public void delete() {
        System.out.println("MySql DataBase delete");

    }

    @Override
    public void update() {
        System.out.println("MySql DataBase update");

    }

    @Override
    public void set() {
        System.out.println("MySql DataBase set");

    }

}
