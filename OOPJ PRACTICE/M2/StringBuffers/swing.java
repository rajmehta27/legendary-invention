import javax.swing.*;
import java.awt.event.*;

public class swing {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first Swing App");
        JLabel l = new JLabel("My Name is: ", SwingConstants.CENTER);
        l.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 20));
        JButton b = new JButton("Click!!");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("My Name is: Raj Mehta");
            }
        });

        f.setLayout(new java.awt.BorderLayout());
        f.add(l, java.awt.BorderLayout.CENTER);
        f.add(b, java.awt.BorderLayout.SOUTH);
        f.setSize(300, 300);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}