package Frame2;

import javax.swing.*;
import java.awt.*;

public class Webpage extends JFrame {
    JTextField searchtextfield;
    Webpage() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("WEBSITE");

        setLocation(350, 200);

        JLabel texthead = new JLabel("WELCOM TO MY WEBSITE");
        texthead.setBounds(500, 30, 5000, 70);
        texthead.setFont(new Font("STATIC", Font.BOLD, 50));
        add(texthead);

        JLabel search = new JLabel("SEARCH PRODUCT: ");
        search.setBounds(200, 150, 300, 50);
        search.setFont(new Font("STATIC", Font.BOLD, 20));
        add(search);

        searchtextfield = new JTextField();
        searchtextfield.setBounds(450, 160, 300, 30);
        searchtextfield.setFont(new Font("STATIC", Font.PLAIN, 15));
        add(searchtextfield);


        setLayout(null);
        setSize(800,500);
        setVisible(true);
    }
}
