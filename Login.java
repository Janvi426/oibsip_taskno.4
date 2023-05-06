// online Exam application - Java MCQ

package exam.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(new Color(214, 250, 250));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quizzr.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(40, -70, 600, 600);
        add(image);
        
        JLabel heading = new JLabel("JavaTestify");
        heading.setBounds(750, 90, 300, 55);
        heading.setFont(new Font("Roboto",Font.BOLD, 50));
        heading.setForeground(new Color(153, 18, 217));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name : ");
        name.setBounds(810, 200, 300, 20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        name.setForeground(new Color(153, 18, 217));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 240, 300, 25);
        tfname.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 310, 125, 28);
        rules.setBackground(new Color(153, 18, 217));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 310, 125, 28);
        back.setBackground(new Color(153, 18, 217));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,550);
        setLocation(90,130);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String...args){
        new Login(); // Anonymous object
    }
            
}
