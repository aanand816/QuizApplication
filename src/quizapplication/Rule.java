package quizapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class Rule extends JFrame implements ActionListener {
    String name;
    JButton back;

    Rule(String name){
        this.name = name; 
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());  // Use BorderLayout

        JLabel heading = new JLabel("Welcome to Simple Minds "+ name );
        heading.setHorizontalAlignment(SwingConstants.CENTER);  // Center the heading
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
        heading.setForeground(Color.blue.darker());
        add(heading, BorderLayout.NORTH);  // Add heading to the top

        JLabel rules = new JLabel();
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.black);
        rules.setText("<html>" +
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have a lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, maybe he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint-hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                "<html>");
        add(rules, BorderLayout.CENTER);  // Add rules to the center

        // Back button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);
        back = new JButton(" Back ");
        back.setBackground(new Color(87, 95, 207).darker());
        back.setFont(new Font("Mongolian Baiti",Font.BOLD,22));
        back.setForeground(Color.white);
        back.addActionListener(this);
        buttonPanel.add(back);
        add(buttonPanel, BorderLayout.SOUTH);  // Add button panel to the bottom

        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == back) {
            setVisible(false); 
            new Login();
        }
    }
    public static void main(String[] x ){
        new Rule("User");
    }
}