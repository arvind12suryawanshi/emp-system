/*
package employee.management.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame{
    
    Splash()  // constructor
    {
        
        getContentPane().setBackground(Color.WHITE);   // change frame color
        setLayout(null); // we have create own layout
        
        setSize(1170,650);  // frame size
        setVisible(true);   // show frame 
        setLocation(200,50); // frame open in left so its indicate 200 right 50 top
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");  // print text in frame
        heading.setBounds(80,30,1200,60); // set the direction of text
        heading.setFont(new Font("serif", Font.PLAIN, 60)); // font add
        heading.setForeground(Color.RED); //label color red
         add(heading);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));  // add image
         Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);  // scale image I2
         ImageIcon i3 = new ImageIcon(i2);   // convert icon image
         JLabel image = new JLabel(i3);
         image.setBounds(50, 100, 1050, 500);
          add(image);
          
       JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
         clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        
       image.add(clickhere);
       
       
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
            
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
    }
    
    public static void main(String[]args)
    {
        new Splash(); // constructor calling
    }
    
}
*/


package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    
    Splash() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
        
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
            
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}