package az.coder.task1.SuperMarket;
import az.coder.task1.GSMarena.form;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form form = new form();
                form.setVisible(true);

            }
        });



        /*JFrame frame = new JFrame("Anti Virus");



        //Button
        JButton btn = new JButton();
        btn.setText("Send");
        btn.setBounds(0,0,100,30);


        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame();
                frame2.setSize(1280,720);
                frame2.setLayout(null);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setVisible(true);
            }
        });


        frame.add(btn);
        frame.setSize(1280,720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/
    }
}
