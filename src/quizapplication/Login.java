package quizapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JButton rule, start;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        Image image = img.getImage().getScaledInstance(800, 200, Image.SCALE_SMOOTH); // Resize the image
        img = new ImageIcon(image); // Convert the resized image back to an ImageIcon
        JLabel label = new JLabel(img); // Add the resized image to a JLabel
        label.setBounds(0, 0, 800, 200); // Set the bounds of the JLabel to match the frame
        add(label); // Add the JLabel to the frame

        //Adding the heading Font 
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(290, 220, 300, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        heading.setForeground(Color.blue.darker());
        add(heading);

        //Adding the Name heading 
        JLabel name = new JLabel("Enter Your Name : ");
        name.setBounds(200, 280, 210, 30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        name.setForeground(Color.blue.darker());
        add(name);

        //Adding the text field for name
        tfname = new JTextField();
        tfname.setBounds(385, 282, 200, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 18));
        tfname.setForeground(Color.blue.darker());
        add(tfname);

        //Adding the start button 
        start = new JButton("START");
        start.setBounds(250, 340, 100, 30);
        start.setFont(new Font("", Font.BOLD, 16));
        start.setBackground(new Color(87, 95, 207).darker());
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);

        //Adding the Rule button 
        rule = new JButton("RULES");
        rule.setBounds(420, 340, 100, 30);
        rule.setFont(new Font("", Font.BOLD, 16));
        rule.setBackground(new Color(87, 95, 207).darker());
        rule.setForeground(Color.white);
        rule.addActionListener(this);
        add(rule);

        setSize(800, 500); //settinng the size for the frame
        setLocation(350, 180); //setting the locating for the frame for first look
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            String name = tfname.getText();
            setVisible(false);
            new Quiz(name);

        } else if (ae.getSource() == rule) {
            String name = tfname.getText();
            setVisible(false);
            new Rule(name);

        } else {
        }

    }

    public static void main(String[] args) {
        new Login();

    }

}
