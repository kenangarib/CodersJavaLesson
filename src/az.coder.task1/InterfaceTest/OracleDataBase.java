package az.coder.task1.InterfaceTest;


public class OracleDataBase implements  DataBase{
    @Override
    public void get() {
        System.out.println("Oracle DataBase get");
    }

    @Override
    public void delete() {
        System.out.println("Oracle DataBase delete");

    }

    @Override
    public void update() {
        System.out.println("Oracle DataBase update");

    }

    @Override
    public void set() {
        System.out.println("Oracle DataBase set");

    }
}
