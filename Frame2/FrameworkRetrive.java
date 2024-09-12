package Frame2;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class FrameworkRetrive extends JFrame implements ActionListener{
    JTextField nametextfield, fathername, emailfield, addressfield, cityfield, statefield, pinfield;
    JRadioButton male, female, cash, upi, other;
    JButton next,clear;
    Long random;
    JDateChooser dateChosser;
    FrameworkRetrive() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Frame2/Images/japan_garden_hd_japanese-1920x1080.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,0,1550,800);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("APPLICATION FORM");

        setLocation(350, 200);

        Random ran = new Random();
        random = Math.abs(ran.nextLong()%9000 + 1000);
        JLabel texthead = new JLabel("APPLICATION FORM NO. "+ random);
        texthead.setBounds(500, 30, 5000, 70);
        texthead.setFont(new Font("STATIC",Font.BOLD, 50));
        texthead.setForeground(Color.WHITE);
        add(texthead);

        JLabel texthead2 = new JLabel("APPLICATION FORM");
        texthead2.setBounds(750, 90, 5000, 70);
        texthead2.setFont(new Font("STATIC",Font.BOLD, 15));
        texthead2.setForeground(Color.WHITE);
        add(texthead2);

        JLabel name = new JLabel("NAME: ");
        name.setBounds(500, 150, 300, 50);
        name.setFont(new Font("STATIC", Font.BOLD, 20));
        name.setForeground(Color.WHITE);
        add(name);

        nametextfield = new JTextField();
        nametextfield.setBounds(750, 160, 300, 30);
        nametextfield.setFont(new Font("STATIC",Font.PLAIN,15));
        add(nametextfield);

        JLabel text2 = new JLabel("FATHER'S NAME: ");
        text2.setBounds(500,200,300,50);
        text2.setFont(new Font("STATIC",Font.BOLD,20));
        text2.setForeground(Color.WHITE);
        add(text2);

        fathername =  new JTextField();
        fathername.setBounds(750,210,300,30);
        fathername.setFont(new Font("STATIC",Font.PLAIN,15));
        add(fathername);

        JLabel gender = new JLabel("GENDER: ");
        gender.setBounds(500,250,300,50);
        gender.setFont(new Font("STATIC",Font.BOLD,20));
        gender.setForeground(Color.WHITE);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(800,250,60,50);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(950,250,70,50);
        add(female);

        ButtonGroup Gender = new ButtonGroup();
        Gender.add(male);
        Gender.add(female);

        JLabel birth = new JLabel("D.O.B: ");
        birth.setBounds(500,300,300,50);
        birth.setFont(new Font("STATIC",Font.BOLD,20));
        birth.setForeground(Color.WHITE);
        add(birth);


        dateChosser = new JDateChooser();
        dateChosser.setBounds(750,320,300,20);
        add(dateChosser);


        JLabel email = new JLabel("E-MAIL ADDRESS: ");
        email.setBounds(500,350,300,50);
        email.setFont(new Font("STATIC",Font.BOLD,20));
        email.setForeground(Color.WHITE);
        add(email);

        emailfield =  new JTextField();
        emailfield.setBounds(750,360,300,30);
        emailfield.setFont(new Font("STATIC",Font.PLAIN,15));
        add(emailfield);

        JLabel paymode = new JLabel("MODE OF PAYMENTS: ");
        paymode.setBounds(500,400,300,50);
        paymode.setFont(new Font("STATIC",Font.BOLD,20));
        paymode.setForeground(Color.WHITE);
        add(paymode);


        cash = new JRadioButton("Cash");
        cash.setBounds(760,400,60,50);
        add(cash);

        upi = new JRadioButton("UPI");
        upi.setBounds(860,400,60,50);
        add(upi);

        other = new JRadioButton("Other");
        other.setBounds(960,400,60,50);
        add(other);

        ButtonGroup Paymode = new ButtonGroup();
        Paymode.add(cash);
        Paymode.add(upi);
        Paymode.add(other);


        JLabel address = new JLabel("ADDRESS: ");
        address.setBounds(500,450,300,50);
        address.setFont(new Font("STATIC",Font.BOLD,20));
        address.setForeground(Color.WHITE);
        add(address);

        addressfield =  new JTextField();
        addressfield.setBounds(750,460,300,30);
        addressfield.setFont(new Font("STATIC",Font.PLAIN,15));
        add(addressfield);

        JLabel city = new JLabel("CITY: ");
        city.setBounds(500,500,300,50);
        city.setFont(new Font("STATIC",Font.BOLD,20));
        city.setForeground(Color.WHITE);
        add(city);

        cityfield =  new JTextField();
        cityfield.setBounds(750,510,300,30);
        cityfield.setFont(new Font("STATIC",Font.PLAIN,15));
        add(cityfield);

        JLabel state = new JLabel("STATE: ");
        state.setBounds(500,550,300,50);
        state.setFont(new Font("STATIC",Font.BOLD,20));
        state.setForeground(Color.WHITE);
        add(state);

        statefield =  new JTextField();
        statefield.setBounds(750,560,300,30);
        statefield.setFont(new Font("STATIC",Font.PLAIN,15));
        add(statefield);

        JLabel pin = new JLabel("PIN CODE: ");
        pin.setBounds(500,600,300,50);
        pin.setFont(new Font("STATIC",Font.BOLD,20));
        pin.setForeground(Color.WHITE);
        add(pin);

        pinfield =  new JTextField();
        pinfield.setBounds(750,610,300,30);
        pinfield.setFont(new Font("STATIC",Font.PLAIN,15));
        add(pinfield);


        clear = new JButton("CLEAR");
        clear.setBounds(750,650,100,20);
        clear.setBackground(Color.YELLOW);
        clear.addActionListener(this);
        add(clear);

        next = new JButton("NEXT");
        next.setBounds(950,650,100,20);
        next.setBackground(Color.YELLOW);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(800,500);
        setVisible(true);

        add(label);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {

        String sformno = "" + random;                                // ("")It will make the random number or int into string.
        String sname =  nametextfield.getText();
        String sfname =  fathername.getText();
        String sdob = ((JTextField)dateChosser.getDateEditor().getUiComponent()).getText();
        String sgender = null;
        if (male.isSelected()){
            sgender = "male";
        } else if (female.isSelected()) {
            sgender = "female";
        }
        String semail  =  emailfield.getText();
        String smop = null;
        if(cash.isSelected()){
            smop = "cash";
        } else if (upi.isSelected()){
            smop = "upi";
        } else if (other.isSelected()) {
            smop = "other";
        }
        String saddress = addressfield.getText();
        String scity =  cityfield.getText();
        String sstate =  statefield.getText();
        String spincode =  pinfield.getText();


        if(sname.equals("")){                                       // It was use to show a popup message where we have to fill name.
            JOptionPane.showMessageDialog(null,"Name is Empty");
        }
//        if(sfname.equals("")){
//            JOptionPane.showMessageDialog(null,"FName is Empty");
//        }
        try {
            ConnectionBuild cb = new ConnectionBuild();
            String query = "Select*from Student";
            PreparedStatement ps = cb.conn.prepareStatement(query);
            ResultSet count = ps.executeQuery(query);
            while (count.next()) {
                System.out.println(count.getInt("formno") + " ");
                System.out.println(count.getString("name") + " ");
                System.out.println(count.getString("fname") + " ");
                System.out.println(count.getInt("dob") + " ");
                System.out.println(count.getString("gender") + " ");
                System.out.println(count.getString("email") + " ");
                System.out.println(count.getString("mop") + " ");
                System.out.println(count.getString("address") + " ");
                System.out.println(count.getString("city") + " ");
                System.out.println(count.getString("state") + " ");
                System.out.println(count.getInt("pincode") + " ");
            }
            setVisible(false);
        }
        catch (Exception e){
            System.out.println(e);
        }
        if(ae.getSource()==clear){
            nametextfield.setText("");
            fathername.setText("");
            emailfield.setText("");
            addressfield.setText("");
            cityfield.setText("");
            statefield.setText("");
            pinfield.setText("");

        }
//       else if(e.getSource()==next){
//            setVisible(false);
//            new Webpage().setVisible(true);
//        }
    }

    public static void main(String[] args) {
        new FrameworkRetrive();
    }

}


