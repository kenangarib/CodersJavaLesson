package az.coder.task1.GSMarena;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class form extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JPanel panel;
    private JTextArea textArea1;

    public form() {
        add(panel);
        setSize(400, 200);
        setTitle("Kenan");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);




        /*System.out.println("========================================== GSM ARENA ==========================================");
        System.out.print("Search phone: ");*/


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Scanner scan = new Scanner(System.in);
                PhonesList phList = new PhonesList();
                PhoneSearchMethod phoneSearchMethod = new PhoneSearchMethod();

                //Phone add list
                ArrayList<Object> phoneList = new ArrayList<>();
                //Apple models
                phoneList.add(phList.iphone13);

                String search;
                search = textField1.getText().toLowerCase(Locale.ROOT);
                textArea1.append(phoneSearchMethod.phoneSearchMethod(search,phoneList));


            }
        });
    }
}
