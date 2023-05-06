package exam.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(214, 250, 250));
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Online Java MCQ Test");
        heading.setBounds(63, 20, 700, 50);
        heading.setFont(new Font("Roboto",Font.BOLD, 35));
        heading.setForeground(new Color(153, 18, 217));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(40, 70, 700, 450);
        rules.setFont(new Font("Mongolian Baiti",Font.PLAIN, 18));
        rules.setText(
            "<html>"+ 
                "1. You are given 10 multiple choice questions of Java language." + "<br><br>" +
                "2. Enter Your Name First to start the Exam." + "<br><br>" +
                "3. Every question has 10 points so total points are 100." + "<br><br>" +
                "4. You have 15 seconds to attempt a question, if you don't select any option then it will automatically submitted after 15 seconds." + "<br><br>" +
                "5. You will also have a 50 - 50 Lifeline, you can use it only once during exam." + "<br><br>" +
                "6. DYou can not submit you paper before attempting all questions, you have to attempt all question to submit the paper." + "<br><br>" +
                "7. Once you Complete the exam, you can play again or Logout(exit) the exam." + "<br><br>" +
                "8. All the best for exam, Give your best." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(153, 18, 217));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(153, 18, 217));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String...args){
        new Rules("User");
    }
}
