package bank.management.system;

import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class SignupTwo extends JFrame implements ActionListener {

    Random ran = new Random();
    int ranpin=1000*ran.nextInt(1,9)+100*ran.nextInt(1,9)+10*ran.nextInt(1,9)+ran.nextInt(1,9);
    String sranpin=""+ranpin;
    String cardno=""+ran.nextInt(1000,9998)+""+ran.nextInt(1000,9998)+""+ran.nextInt(1000,9998)+""+ran.nextInt(1000,9998);

    JComboBox accountBox,incomeBox,eduBox,occupationBox;
    JCheckBox card,iBanking,mBanking,eAlert,cBook,eStatement;
    JButton submit,cancel;
    String formno;

    private static String iban(String fn){
        String country_code = "SE";
        String prefix = "00";
        String padded = "000000000".substring(fn.length()) + fn;
        return country_code + prefix + padded;
    }

    SignupTwo(String formno){
        super("APPLICATION FORM");

        ImageIcon imgIcn = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img = imgIcn.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon imgIcon = new ImageIcon(img);
        JLabel imgLabel = new JLabel(imgIcon);
        imgLabel.setBounds(150,5,100,100);
        add(imgLabel);

        this.formno = formno;

        JLabel pageTwo = new JLabel("Page 2");
        pageTwo.setFont(new Font("Raleway", Font.BOLD,22));
        pageTwo.setBounds(300,30,600,40);
        add(pageTwo);

        JLabel detailsLabel = new JLabel("Additonal Details");
        detailsLabel.setFont(new Font("Raleway", Font.BOLD,22));
        detailsLabel.setBounds(300,60,600,40);
        add(detailsLabel);

        JLabel accountLabel = new JLabel("Account Type:");
        accountLabel.setFont(new Font("Raleway",Font.PLAIN,18));
        accountLabel.setBounds(100,140,200,30);
        add(accountLabel);

        String accounts[] = {"Saving Account","Fixed Deposit Account","Current Account", "Recurring Deposit Account"};
        accountBox = new JComboBox(accounts);
        accountBox.setBackground(new Color(252,208,76));
        accountBox.setFont(new Font("Raleway",Font.PLAIN,14));
        accountBox.setBounds(350,140,320,30);
        add(accountBox);

        JLabel incomeLabel = new JLabel("Income : ");
        incomeLabel.setFont(new Font("Raleway", Font.PLAIN,18));
        incomeLabel.setBounds(100,180,100,30);
        add(incomeLabel);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        incomeBox = new JComboBox(income);
        incomeBox.setBackground(new Color(252,208,76));
        incomeBox.setFont(new Font("Raleway",Font.PLAIN,14));
        incomeBox.setBounds(350,180,320,30);
        add(incomeBox);

        JLabel l6 = new JLabel("Education : ");
        l6.setFont(new Font("Raleway", Font.PLAIN,18));
        l6.setBounds(100,220,150,30);
        add(l6);

        String educational [] = {"Student","Graduate","Post-Graduate", "Doctrate", "Others"};
        eduBox = new JComboBox(educational);
        eduBox.setBackground(new Color(252,208,76));
        eduBox.setFont(new Font("Raleway",Font.PLAIN,14));
        eduBox.setBounds(350,220,320,30);
        add(eduBox);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.PLAIN,18));
        l7.setBounds(100,260,150,30);
        add(l7);

        String Occupation [] = {"Government Employee","Self-Employed","Business", "Student", "Retired"};
        occupationBox = new JComboBox(Occupation);
        occupationBox.setBackground(new Color(252,208,76));
        occupationBox.setFont(new Font("Raleway",Font.PLAIN,14));
        occupationBox.setBounds(350,260,320,30);
        add(occupationBox);

        
        JLabel iBan = new JLabel("IBAN:");
        iBan.setFont(new Font("Raleway",Font.PLAIN,18));
        iBan.setBounds(100,300,200,20);
        add(iBan);

        JLabel ibLabel=new JLabel(iban("123"));
        ibLabel.setFont(new Font("Raleway",Font.PLAIN,14));
        ibLabel.setBounds(360,300,250,30);
        add(ibLabel);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.PLAIN,18));
        l8.setBounds(100,340,200,30);
        add(l8);

        JLabel l9 = new JLabel(sranpin);
        l9.setFont(new Font("Raleway",Font.PLAIN,18));
        l9.setBounds(360,340,200,30);
        add(l9);

        JLabel pageTwo2 = new JLabel("Form No : ");
        pageTwo2.setFont(new Font("Raleway", Font.PLAIN,14));
        pageTwo2.setBounds(707,10,100,30);
        add(pageTwo2);

        JLabel pageTwo3 = new JLabel(formno);
        pageTwo3.setFont(new Font("Raleway", Font.PLAIN,14));
        pageTwo3.setBounds(760,10,60,30);
        add(pageTwo3);

        JLabel pageLabel1 = new JLabel("Services Required:");
        pageLabel1.setFont(new Font("Raleway",Font.BOLD,18));
        pageLabel1.setBounds(100,380,200,30);
        add(pageLabel1);

        card = new JCheckBox("ATM CARD");
        card.setBackground(new Color(215,252,252));
        card.setFont(new Font("Raleway",Font.PLAIN,16));
        card.setBounds(100,420,200,30);
        add(card);

        iBanking = new JCheckBox("Internet Banking");
        iBanking.setBackground(new Color(215,252,252));
        iBanking.setFont(new Font("Raleway",Font.PLAIN,16));
        iBanking.setBounds(350,420,200,30);
        add(iBanking);

        mBanking = new JCheckBox("Mobile Banking");
        mBanking.setBackground(new Color(215,252,252));
        mBanking.setFont(new Font("Raleway",Font.PLAIN,16));
        mBanking.setBounds(100,460,200,30);
        add(mBanking);

        eAlert = new JCheckBox("EMAIL Alerts");
        eAlert.setBackground(new Color(215,252,252));
        eAlert.setFont(new Font("Raleway",Font.PLAIN,16));
        eAlert.setBounds(350,460,200,30);
        add(eAlert);

        cBook = new JCheckBox("Cheque Book");
        cBook.setBackground(new Color(215,252,252));
        cBook.setFont(new Font("Raleway",Font.PLAIN,16));
        cBook.setBounds(100,500,200,30);
        add(cBook);

        eStatement = new JCheckBox("E-Statement");
        eStatement.setBackground(new Color(215,252,252));
        eStatement.setFont(new Font("Raleway",Font.PLAIN,16));
        eStatement.setBounds(350,500,200,30);
        add(eStatement);


        JCheckBox declare = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.",true);
        declare.setBackground(new Color(215,252,252));
        declare.setFont(new Font("Raleway",Font.BOLD,12));
        declare.setBounds(100,580,600,20);
        add(declare);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.black);
        submit.setBounds(250,660,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.black);
        cancel.setBounds(420,660,100,30);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accType = (String) accountBox.getSelectedItem();
        String inc = (String) incomeBox.getSelectedItem();
        String edu = (String) eduBox.getSelectedItem();
        String occ = (String) occupationBox.getSelectedItem();
        String ibn = (String) accountBox.getSelectedItem();
        String services = "";
        if(card.isSelected()){
            services = services+"ATM CARD ";
        } else if (iBanking.isSelected()) {
            services = services+"Internet Banking";
        } else if (mBanking.isSelected()) {
            services = services+"Mobile Banking";
        } else if (eAlert.isSelected()) {
            services = services+"EMAIL Alerts";
        } else if (cBook.isSelected()) {
            services=services+"Cheque Book";
        } else if (eStatement.isSelected()) {
            services=services+"E-Statement";
        }

        try{
            /* 
            if ( || ){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connect c = new Connect();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"''"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
            */
            if (e.getSource()==submit){
                if (accType.equals("") ||inc.equals("") ||edu.equals("") ||occ.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Connect con = new Connect();
                    String q1 = "insert into signuptwo values('"+formno+"','"+cardno+"','"+sranpin+"','"+services+"','"+edu+"','"+accType+"','"+inc+"','"+occ+"','"+ibn+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+sranpin+"')";
                    con.statement.executeUpdate(q1);
                    con.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+sranpin );
                    
                    new Login();
                    setVisible(false);
                }
            } else if (e.getSource()==cancel) {
                //System.exit(0);
                setVisible(false);
                new Login();
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
