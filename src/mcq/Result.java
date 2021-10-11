
package mcq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Result(String username, int score){
		
		//Frame Result
		setBounds(250,30,900,500); 
        getContentPane().setBackground(new Color(255,223,34)); 
        setLayout(null);
 
        //Image Thank you
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mind/icons/ThankYou.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 450, 550);
        add(l1);
        
        //Thank you Text
        JLabel l2 = new JLabel("Thankyou " + username + " for Playing Simple Minds !");
        l2.setBounds(130,50,700,40);
	    l2.setFont(new Font("Arial",Font.BOLD,35));
        l2.setForeground(Color.black);
        add(l2);
        
        //Text
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(460, 200, 300, 30);
        l3.setFont(new Font("Arial",Font.BOLD,40 ));  
        l3.setForeground(Color.black);
        add(l3);
        
        //Play again button
        JButton b1 = new JButton("Play Again");
        b1.setBounds(550, 270, 120, 30);
        b1.setFont(new Font("Arial",Font.BOLD,14));  
        b1.setBackground(new Color(255,195,0));
        b1.setForeground(Color.BLACK); 
        b1.addActionListener(this);
    
        add(b1);
    }
	
	//when play button get clicked
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Welcome().setVisible(true);
    }
    
    
    public static void main(String[] args){
        new Result("", 0).setVisible(true);
    }
}
