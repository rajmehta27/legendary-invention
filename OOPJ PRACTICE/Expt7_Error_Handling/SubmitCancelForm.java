import javax.swing.*; 
import java.awt.event.*; 
 
public class SubmitCancelForm { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Login Form"); 
        JLabel username = new JLabel("Username: "); 
 	JTextField user = new JTextField(20); 
 	JLabel password = new JLabel("Password: "); 
 	JTextField pass = new JTextField(20); 
 	JLabel label = new JLabel(""); 
 
        JButton login = new JButton("Login"); 
        JButton cancel = new JButton("Cancel"); 
 
        username.setBounds(50, 20, 100, 20); 
      
  
 
 
 
 user.setBounds(150, 20, 100, 20); 
 password.setBounds(50, 50, 100, 20); 
 pass.setBounds(150, 50, 100, 20); 
        login.setBounds(50, 80, 100, 30); 
        cancel.setBounds(150, 80, 100, 30); 
 label.setBounds(55, 110, 300, 20); 
 
        login.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if(user.getText() == "admin" && pass.getText() == "admin123"){ 
      		label.setText(""); 
      		JFrame success = new JFrame("Login SuccessFull"); 
      JLabel message = new JLabel("Login Successfull"); 
       
      message.setBounds(100, 20, 100, 20); 
       
      success.add(message); 
   
      success.setSize(300,150); 
      success.setLayout(null); 
      success.setLocationRelativeTo(null); 
             success.setVisible(true); 
  } else { 
      user.setText(""); 
      pass.setText(""); 
        
  
 
 
 
      label.setText("Incorrect Username or Password"); 
  } 
            } 
        }); 
 
        cancel.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                user.setText(""); 
  pass.setText(""); 
            } 
        }); 
 
        frame.add(username); 
 frame.add(user); 
 frame.add(password); 
        frame.add(pass); 
 frame.add(label); 
 frame.add(login); 
        frame.add(cancel); 
 
        frame.setSize(300, 200); 
        frame.setLayout(null); 
 frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     
} 
}