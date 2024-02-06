package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    JButton close, login;
    String name;

    Score(String name, int score) {
        this.name = name;
        setBounds(400, 200, 800, 500);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image img = icon.getImage().getScaledInstance(300, 150, 300);
        icon = new ImageIcon(img);
        JLabel image = new JLabel(icon);
        image.setBounds(0, -60, 800, 300);
        add(image);

        JLabel heading = new JLabel("Thankyou " + name + " for playing Simple minds!!");
        heading.setBounds(140, 200, 600, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 25));
        heading.setForeground(Color.blue.darker());
        add(heading);

        JLabel scorel = new JLabel("Your Score is " + score);
        scorel.setBounds(290, 270, 400, 30);
        scorel.setFont(new Font("Tahoma", Font.BOLD, 25));
        scorel.setForeground(Color.blue.darker());
        add(scorel);

        close = new JButton("Play Again");
        close.setBackground(new Color(87, 95, 207).darker());
        close.setFont(new Font("Tahoma", Font.BOLD, 20));
        close.setBounds(200, 330, 150, 40);
        close.setForeground(Color.white);
        close.addActionListener(this);
        add(close);

        login = new JButton("Login Page");
        login.setBackground(new Color(87, 95, 207).darker());
        login.setFont(new Font("Tahoma", Font.BOLD, 20));
        login.setBounds(400, 330, 150, 40);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == close) {
                setVisible(false);
                new Quiz(name);   
        }else if (ae.getSource() == login) {
                setVisible(false);
                new Login();
    }
 }

    public static void main(String[] x) {
        new Score("user",0);
    }

}
