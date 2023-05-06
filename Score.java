package exam.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    JButton exit, submit;

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(214, 250, 250));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/scorefr.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(60, 30, 600, 400);
        add(image);
        
        JLabel heading = new JLabel("Thank you " + name + " for attending all Question");
        heading.setBounds(45, 30, 700, 50);
        heading.setFont(new Font("Roboto", Font.BOLD, 30));
        heading.setForeground(new Color(153, 18, 217));
        add(heading);
        
        JLabel lblscore = new JLabel(""+ score);
        lblscore.setBounds(350, 250, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblscore.setForeground(new Color(153, 18, 217));
        add(lblscore);
        
        submit = new JButton("Play Again");
        submit.setBounds(230, 420, 120, 30);
        submit.setBackground(new Color(153, 18, 217));
        submit.setFont(new Font("Roboto", Font.PLAIN, 15));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        exit = new JButton("Exit");
        exit.setBounds(370, 420, 120, 30);
        exit.setBackground(new Color(153, 18, 217));
        exit.setFont(new Font("Roboto", Font.PLAIN, 15));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit){
            setVisible(false);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
