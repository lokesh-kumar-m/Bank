package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{

    JRadioButton radioMale,radioFemale,statusMarried,statusUnmarried,statusOther;
    JButton next,clear;

    JTextField nameTextField , textEmail,addressTextField,textcity,textState,pinTextField,cntryTextField;
    JDateChooser dateChooser;
    Long formNumber=(long) 1000;
    Signup(){
        super("REGISTRATION FORM");

        ImageIcon bankIcn = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bankImg = bankIcn.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon bankImgIcn = new ImageIcon(bankImg);
        JLabel imageLabel = new JLabel(bankImgIcn);
        imageLabel.setBounds(25,10,100,100);
        add(imageLabel);

        JLabel formLabel = new JLabel("REGISTRATION FORM NO."+ formNumber);
        formLabel.setBounds(180,20,500,40);
        formLabel.setFont(new Font("Raleway",Font.PLAIN,28));
        add(formLabel);

        JLabel page1 = new JLabel("Page 1");
        page1.setFont(new Font("Ralway",Font.PLAIN, 20));
        page1.setBounds(330,70,500,30);
        add(page1);

        JLabel personInfo = new JLabel("Personal Details");
        personInfo.setFont(new Font("Raleway", Font.PLAIN,20));
        personInfo.setBounds(290,90,500,30);
        add(personInfo);

        JLabel namLabel = new JLabel("Name :");
        namLabel.setFont(new Font("Raleway", Font.PLAIN, 20));
        namLabel.setBounds(100,190,100,30);
        add(namLabel);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.PLAIN, 14));
        nameTextField.setBounds(300,190,400,30);
        add(nameTextField);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.PLAIN, 20));
        DOB.setBounds(100,230,150,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,230,200,30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Raleway", Font.PLAIN, 20));
        gender.setBounds(100,270,200,30);
        add(gender);

        radioMale = new JRadioButton("Male");
        radioMale.setFont(new Font("Raleway", Font.PLAIN,14));
        radioMale.setBackground(new Color(222,255,228));
        radioMale.setBounds(300,270,90,30);
        add(radioMale);

        radioFemale = new JRadioButton("Female");
        radioFemale.setBackground(new Color(222,255,228));
        radioFemale.setFont(new Font("Raleway", Font.PLAIN,14));
        radioFemale.setBounds(450,270,90,30);
        add(radioFemale);

        ButtonGroup maleFemalBtnGroup = new ButtonGroup();
        maleFemalBtnGroup.add(radioMale);
        maleFemalBtnGroup.add(radioFemale);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.PLAIN, 20));
        labelEmail.setBounds(100,310,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.PLAIN, 14));
        textEmail.setBounds(300,310,400,30);
        add(textEmail);


        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.PLAIN, 20));
        labelMs.setBounds(100,350,200,30);
        add(labelMs);

        statusMarried = new JRadioButton("Married");
        statusMarried.setBounds(300,350,100,30);
        statusMarried.setBackground(new Color(222,255,228));
        statusMarried.setFont(new Font("Raleway", Font.PLAIN,14));
        add(statusMarried);

        statusUnmarried = new JRadioButton("Unmarried");
        statusUnmarried.setBackground(new Color(222,255,228));
        statusUnmarried.setBounds(450,350,130,30);
        statusUnmarried.setFont(new Font("Raleway", Font.PLAIN,14));
        add(statusUnmarried);

        statusOther = new JRadioButton("Other");
        statusOther.setBackground(new Color(222,255,228));
        statusOther.setBounds(635,350,100,30);
        statusOther.setFont(new Font("Raleway", Font.PLAIN,14));
        add(statusOther);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(statusMarried);
        buttonGroup1.add(statusUnmarried);
        buttonGroup1.add(statusOther);

        JLabel countryLabel = new JLabel("country :");
        countryLabel.setFont(new Font("Raleway", Font.PLAIN, 20));
        countryLabel.setBounds(100,390,200,30);
        add(countryLabel);

        cntryTextField = new JTextField();
        cntryTextField.setFont(new Font("Raleway",Font.PLAIN, 14));
        cntryTextField.setBounds(300,390,400,30);
        add(cntryTextField);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.PLAIN, 20));
        labelAdd.setBounds(100,430,200,30);
        add(labelAdd);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.PLAIN, 14));
        addressTextField.setBounds(300,430,400,30);
        add(addressTextField);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.PLAIN, 20));
        labelCity.setBounds(100,470,200,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.PLAIN, 14));
        textcity.setBounds(300,470,400,30);
        add(textcity);

        JLabel pinLabel = new JLabel("Pin Code :");
        pinLabel.setFont(new Font("Raleway", Font.PLAIN, 20));
        pinLabel.setBounds(100,510,200,30);
        add(pinLabel);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.PLAIN, 14));
        pinTextField.setBounds(300,510,400,30);
        add(pinTextField);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.PLAIN, 20));
        labelstate.setBounds(100,550,200,30);
        add( labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.PLAIN, 14));
        textState.setBounds(300,550,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.PLAIN, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.black);
        next.setBounds(620,600,80,30);
        next.addActionListener(this);
        add(next);

        clear = new JButton("Clear");
        clear.setFont(new Font("Raleway",Font.PLAIN, 14));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.black);
        clear.setBounds(500,600,80,30);
        clear.addActionListener(this);
        add(clear);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,700);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = ""+formNumber;
        String name = nameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(radioMale.isSelected()){
            gender = "Male";
        }else {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital =null;
        if (statusMarried.isSelected()){
            marital = "Married";
        } else if (statusUnmarried.isSelected()) {
            marital = "Unmarried";
        } else if (statusOther.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = textcity.getText();
        String pincode = pinTextField.getText();
        String state = textState.getText();

        try{

            if (nameTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Connect c = new Connect();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                c.statement.executeUpdate(q);
                new SignupTwo(formno);
                setVisible(false);  
            }

            if(e.getSource()==clear){
                nameTextField.setText(" "); 
                textEmail.setText(" ");
                addressTextField.setText(" ");
                textcity.setText(" ");
                textState.setText(" ");
                pinTextField.setText(" ");
                cntryTextField.setText(" ");
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
