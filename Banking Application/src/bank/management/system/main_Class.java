package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton deposit,withdraw,fCash,mStatement,pChange,enquiry,logout;
    String pin;
    main_Class(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.black);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        deposit = new JButton("DEPOSIT");
        deposit.setForeground(Color.black);
        deposit.setBackground(new Color(65,125,128));
        deposit.setBounds(410,274,150,35);
        deposit.addActionListener(this);
        l3.add(deposit);

        withdraw = new JButton("CASH WITHDRAWL");
        withdraw.setForeground(Color.black);
        withdraw.setBackground(new Color(65,125,128));
        withdraw.setBounds(700,274,150,35);
        withdraw.addActionListener(this);
        l3.add(withdraw);

        fCash = new JButton("FAST CASH");
        fCash.setForeground(Color.black);
        fCash.setBackground(new Color(65,125,128));
        fCash.setBounds(410,318,150,35);
        fCash.addActionListener(this);
        l3.add(fCash);

        mStatement = new JButton("MINI STATEMENT");
        mStatement.setForeground(Color.black);
        mStatement.setBackground(new Color(65,125,128));
        mStatement.setBounds(700,318,150,35);
        mStatement.addActionListener(this);
        l3.add(mStatement);

        pChange = new JButton("PIN CHANGE");
        pChange.setForeground(Color.black);
        pChange.setBackground(new Color(65,125,128));
        pChange.setBounds(410,362,150,35);
        pChange.addActionListener(this);
        l3.add(pChange);

        enquiry = new JButton("BALANCE ENQUIRY");
        enquiry.setForeground(Color.black);
        enquiry.setBackground(new Color(65,125,128));
        enquiry.setBounds(700,362,150,35);
        enquiry.addActionListener(this);
        l3.add(enquiry);

        logout = new JButton("Logout");
        logout.setForeground(Color.black);
        logout.setBackground(new Color(65,125,128));
        logout.setBounds(700,406,150,35);
        logout.addActionListener(this);
        l3.add(logout);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==deposit){
           new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==logout){
            System.exit(0);
        } else if (e.getSource()==withdraw) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==enquiry) {
            new BalanceEnquriy(pin);
            setVisible(false);
        } else if (e.getSource()==fCash) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==pChange) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==mStatement) {
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
