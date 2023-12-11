package bank.management.system;

import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BalanceEnquriy extends JFrame implements ActionListener{

    String pin;
    JLabel balLabel;
    JButton back;

    public BalanceEnquriy(String pin) {
        this.pin =pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel currentBalance = new JLabel("Your Current Balance is");
        currentBalance.setForeground(Color.black);
        currentBalance.setFont(new Font("System", Font.BOLD, 16));
        currentBalance.setBounds(430,180,700,35);
        l3.add(currentBalance);

        balLabel = new JLabel();
        balLabel.setForeground(Color.black);
        balLabel.setFont(new Font("System", Font.BOLD, 16));
        balLabel.setBounds(430,220,400,35);
        l3.add(balLabel);

        back = new JButton("Back");
        back.setBounds(700,406,150,35);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.black);
        back.addActionListener(this);
        l3.add(back);

        int balance =0;
        try{
            Connect c = new Connect();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        balLabel.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    public static void main(String[] args) {
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }

}
