package az.coder.task1.InterfaceTest;

class DataBaseManager{
    public void getDatabase(DataBase dataBase){
        dataBase.get();

    }
    public void deleteDatabase(DataBase dataBase){
        dataBase.delete();

    }
    public void updateDatabase(DataBase dataBase){
        dataBase.update();

    }
    public void setDatabase(DataBase dataBase){
        dataBase.set();

    }
}
public class Main {
    public static void main(String[] args) {

        DataBaseManager dataBaseManager = new DataBaseManager();
        dataBaseManager.getDatabase(new OracleDataBase());
    }
}
