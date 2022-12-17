package az.coder.task1.GSMarena;

import javax.swing.*;
import java.util.*;

public class Main extends PhonesList{
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form form = new form();
                form.setVisible(true);

            }
        });


//        Apple apple= new Iphone13();
//        System.out.println(apple);

        /*Scanner scan = new Scanner(System.in);
        PhonesList phList = new PhonesList();
        PhoneSearchMethod phoneSearchMethod = new PhoneSearchMethod();

        //Phone add list
        ArrayList<Object> phoneList = new ArrayList<>();
        //Apple models
        phoneList.add(phList.iphone13);

        System.out.println("========================================== GSM ARENA ==========================================");
        System.out.print("Search phone: ");
        String searchPhone = scan.nextLine().toLowerCase(Locale.ROOT);
        phoneSearchMethod.phoneSearchMethod(searchPhone,phoneList);*/








    }
}
