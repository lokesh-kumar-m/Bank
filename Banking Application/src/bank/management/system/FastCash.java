package bank.management.system;

import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton oh,fh,oth,tth,fth,th,back;
    String pin;
    FastCash(String pin){
        this.pin =pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setBounds(445,180,700,35);
        label.setForeground(Color.black);
        label.setFont(new Font("System",Font.BOLD,23));
        l3.add(label);

        oh = new JButton("Rs. 100");
        oh.setForeground(Color.black);
        oh.setBackground(new Color(65,125,128));
        oh.setBounds(410,274,150,35);
        oh.addActionListener(this);
        l3.add(oh);

        fh = new JButton("Rs. 500");
        fh.setForeground(Color.black);
        fh.setBackground(new Color(65,125,128));
        fh.setBounds(700,274,150,35);
        fh.addActionListener(this);
        l3.add(fh);

        oth = new JButton("Rs. 1000");
        oth.setForeground(Color.black);
        oth.setBackground(new Color(65,125,128));
        oth.setBounds(410,318,150,35);
        oth.addActionListener(this);
        l3.add(oth);

        tth = new JButton("Rs. 2000");
        tth.setForeground(Color.black);
        tth.setBackground(new Color(65,125,128));
        tth.setBounds(700,318,150,35);
        tth.addActionListener(this);
        l3.add(tth);

        fth = new JButton("Rs. 5000");
        fth.setForeground(Color.black);
        fth.setBackground(new Color(65,125,128));
        fth.setBounds(410,362,150,35);
        fth.addActionListener(this);
        l3.add(fth);

        th = new JButton("Rs. 10000");
        th.setForeground(Color.black);
        th.setBackground(new Color(65,125,128));
        th.setBounds(700,362,150,35);
        th.addActionListener(this);
        l3.add(th);

        back = new JButton("BACK");
        back.setForeground(Color.black);
        back.setBackground(new Color(65,125,128));
        back.setBounds(700,406,150,35);
        back.addActionListener(this);
        l3.add(back);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back) {
            setVisible(false);
            new main_Class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Connect c = new Connect();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"', 'withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }


    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
