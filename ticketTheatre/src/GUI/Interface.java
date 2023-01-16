package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Interface extends JFrame{

    Image img;
    public Interface(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.DARK_GRAY);
        setSize(1920, 1080);

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        //GridBagConstraints constraints = new GridBagConstraints();
        //constraints.insets = new Insets(5, 5, 5, 5);


       ImageIcon icon = new ImageIcon("D:\\Facultate\\Projects\\oopProject\\MainBG.png");
       img = icon.getImage();


        JButton button = new JButton("Ce vei deveni cand vei fi mare?");
        //constraints.gridx = 0;
        //constraints.gridy = 0;
        //layout.setConstraints(button, constraints);
        //constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBackground(Color.PINK);
        button.setFocusable(false);
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Esecul Familiei");
            }});


        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img,0, 0,null);
    }
}
