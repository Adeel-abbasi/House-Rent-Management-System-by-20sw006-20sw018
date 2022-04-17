

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{
    
//******Text And Password Fields For Admin Data*******
    
    static JTextField userName = new JTextField();
    static JPasswordField password = new JPasswordField();
//******Text And Password Fields For Admin Data*******

//*********buttons*********
    JButton login;
    JButton cancel;
//******Buttons************    
    
//********Lgin Frame*******
    static JFrame frame = new JFrame();
//********Lgin Frame*******
    
//*******counter******
   static boolean counter = false;
//*******counter******
    
    LoginFrame(){
    
        //*******Labels and text*********
        JLabel lbl1 = new JLabel("User Name");
        lbl1.setBounds(40, 30, 200, 30);
        lbl1.setFont(new Font("BOLD",Font.BOLD,16));
            
        userName = new JTextField();
        userName.setBounds(140,35,150,23);
        userName.setFont(new Font("BOLD",Font.BOLD,14));
            
        JLabel lbl2 = new JLabel("Password");
        lbl2.setBounds(40, 70, 200, 30);
        lbl2.setFont(new Font("BOLD",Font.BOLD,16));
            
        password = new JPasswordField();
        password.setBounds(140,75,150,23);
        //*******Labels and text*********
            
        //********Buttons**********
        login = new JButton("Login");
        login.setBounds(80,110,100,27);
        login.addActionListener(this);
        login.setFocusable(false);
        login.setFont(new Font("BOLD",Font.BOLD,16));
            
        cancel = new JButton("Cancel");
        cancel.setBounds(200,110,100,27);
        cancel.setFocusable(false);
        cancel.setFont(new Font("BOLD",Font.BOLD,16));
        //*********Buttons***********
            
        //*******frame*********
        frame = new JFrame();
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(400,200);
        frame.setIconImage(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //*******frame*********
            
        //*****addin components to frame*******
        frame.add(lbl1);
        frame.add(userName);
        frame.add(lbl2);
        frame.add(password);
        frame.add(login);
        frame.add(cancel);
        //*****addin components to frame*******
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            if(counter==true){
                frame.setVisible(false);
                new HouseRent();
            }
            if(counter==false){
                counter=true;
              frame.setVisible(false);
                new HouseRent().setVisible(true);
            }
        }    
    }
    public static void main(String[] args) {
     LoginFrame ln=new LoginFrame();
           
    }   
}