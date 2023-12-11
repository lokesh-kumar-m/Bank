package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Login
 */
public class Login extends JFrame implements ActionListener{

    JLabel welcomLabel,accNumber,password;
    JTextField accTextField;
    JPasswordField passworTextField;
    JButton signInBtn,clearBtn,registerBtn;

        
    Login(){
        super("Banking Application");
        
        ImageIcon Bankimage=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img=Bankimage.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon bankIcn=new ImageIcon(img);
        JLabel imageLabel =new JLabel(bankIcn);
        imageLabel.setBounds(350,10,100,100);
        add(imageLabel);

        ImageIcon cardImg=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image card=cardImg.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon cardIcn=new ImageIcon(card);
        JLabel cardLabel =new JLabel(cardIcn);
        cardLabel.setBounds(650,330,90,90);
        add(cardLabel);
       
        welcomLabel=new JLabel("HEY! WELCOME");
        welcomLabel.setForeground(Color.white);
        welcomLabel.setFont(new Font("AvantGarde",Font.BOLD,38));
        welcomLabel.setBounds(250, 140, 450, 40);
        add(welcomLabel);

        accNumber=new JLabel("Account Number: ");
        accNumber.setForeground(Color.white);
        accNumber.setFont(new Font("Arial",Font.BOLD,18));
        accNumber.setBounds(150, 200, 200, 30);
        add(accNumber);
        accTextField=new JTextField(15);
        accTextField.setForeground(Color.BLACK);
        accTextField.setFont(new Font("Arial",Font.PLAIN,15));
        accTextField.setBounds(335, 200, 220, 30);
        add(accTextField);

        password=new JLabel("PIN: ");
        password.setForeground(Color.white);
        password.setFont(new Font("Arial",Font.BOLD,18));
        password.setBounds(150, 250, 200, 30);
        add(password);
        passworTextField=new JPasswordField(15);
        passworTextField.setForeground(Color.BLACK);
        passworTextField.setFont(new Font("Arial",Font.PLAIN,15));
        passworTextField.setBounds(335, 250, 220, 30);
        add(passworTextField);

        signInBtn=new JButton("Sign In");
        signInBtn.setForeground(Color.black);
        signInBtn.setBackground(Color.black);
        signInBtn.setFont(new Font("Arial",Font.BOLD,14));
        signInBtn.setBounds(300, 300, 90, 30);
        signInBtn.addActionListener(this);
        add(signInBtn);

        clearBtn=new JButton("Clear");
        clearBtn.setForeground(Color.black);
        clearBtn.setBackground(Color.black);
        clearBtn.setFont(new Font("Arial",Font.BOLD,14));
        clearBtn.setBounds(430, 300, 90, 30);
        clearBtn.addActionListener(this);
        add(clearBtn);

        registerBtn=new JButton("Register");
        registerBtn.setForeground(Color.black);
        registerBtn.setBackground(Color.black);
        registerBtn.setFont(new Font("Arial",Font.BOLD,14));
        registerBtn.setBounds(360, 350, 90, 30);
        registerBtn.addActionListener(this);
        add(registerBtn);

        ImageIcon background=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image backgrnd=background.getImage().getScaledInstance(800, 480, Image.SCALE_DEFAULT);
        ImageIcon backgrndIcn=new ImageIcon(backgrnd);
        JLabel backgroundLabel =new JLabel(backgrndIcn);
        backgroundLabel.setBounds(0,0,800,480);
        add(backgroundLabel);

        setLayout(null);
        setSize(800,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==signInBtn){
                Connect conn= new Connect();
                String cardno = accTextField.getText();
                String pin = passworTextField.getText();
                String q = "select * from login where cardno = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = conn.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }

            }else if(e.getSource()==clearBtn){
                accTextField.setText("");
                passworTextField.setText("");
            }
            else if(e.getSource()==registerBtn){
                new Signup();
                setVisible(false);
            }
            
        } catch (Exception excpt) {
            excpt.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}