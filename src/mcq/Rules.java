
package mcq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	JButton b1,b2;
	String username; //name coming from previous frame Welcome.java

	Rules(String username){
		 
		//Frame Rules
		setBounds(300,100,800,500); 
	    getContentPane().setBackground(new Color(255,223,34)); 
	    setLayout(null);
	    
	    
	    //Title of Frame
	    JLabel l1= new JLabel("Welcome " + username + " to Master Minds"); //username is coming from previous frame SimpleMinds.java
	    l1.setBounds(130,50,700,30);
	    l1.setFont(new Font("Arial",Font.BOLD,35 ));  
	  //  l1.setFont(new Font("Viner Hand ITC",Font.BOLD,35));
        l1.setForeground(Color.black);
	    add(l1);
	    
	    //Rules 
	    JLabel l2= new JLabel(""); 
	    l2.setText(
	    	"<html>"+ 
	    			"1. There are 10 questions and all are compulsory." + "<br><br>" +
	    			"2. There will be four options for each question , select one option only." + "<br><br>" +
	    			"3. You can make use of 50-50 lifeline.After selecting it, two wrong options get disabled." + "<br><br>" +
	    			"4. You have only 15 seconds to answer each question." + "<br><br>" +
            "<html>"
        );  
	    l2.setBounds(60,70,600,300);
	    l2.setFont(new Font("Arial",Font.BOLD,17));
	    l2.setForeground(Color.black);
	    add(l2);
	    
	    
	    //Back Button
	    b1 = new JButton("Back");
	    b1.setBounds(180,350,120,25);
	    b1.setFont(new Font("Arial",Font.BOLD,14));  
        b1.setBackground(new Color(255,195,0));
        b1.setForeground(Color.BLACK); 
        b1.addActionListener(this); 
	    add(b1);
	    
	    //Start Button
	    b2 = new JButton("Start");
	    b2.setBounds(400,350,120,25);
        b2.setFont(new Font("Arial",Font.BOLD,14));  
        b2.setBackground(new Color(255,195,0));
        b2.setForeground(Color.BLACK); 
        b2.addActionListener(this); 
	    add(b2);

	    setVisible(true); 
		
	}
	

	public void actionPerformed(ActionEvent ae) {
	 
		//If Back button get clicked
		if(ae.getSource() == b1) {   
	
			this.setVisible(false);   	
			new Welcome().setVisible(true); 
	
		}
		//else if Start button get clicked
		else if(ae.getSource() == b2){
			
            this.setVisible(false);
            new QuizStart(username).setVisible(true);
        }
		
	}

	
	public static void main(String[] args) {
		
		new Rules("");  
		
	}

}
