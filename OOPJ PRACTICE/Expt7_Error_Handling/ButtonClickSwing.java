import javax.swing.*; 
import java.awt.event.*; 
public class ButtonClickSwing { 
public static void main(String[] args) {         
 
 
        JFrame frame = new JFrame("Button Click Example"); 
        JLabel label = new JLabel("Click a button!"); 
        JButton button1 = new JButton("Button 1"); 
        JButton button2 = new JButton("Button 2"); 
 
        label.setBounds(100, 20, 200, 30); 
        button1.setBounds(50, 70, 120, 30); 
        button2.setBounds(180, 70, 120, 30); 
 
        button1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                label.setText("Button-1 clicked"); 
            } 
        }); 
 
        button2.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                label.setText("Button-2 clicked"); 
            } 
        }); 
 
        frame.add(label); 
        frame.add(button1); 
        frame.add(button2); 
 
 
 
        frame.setSize(350, 200); 
        frame.setLayout(null); 
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
} 