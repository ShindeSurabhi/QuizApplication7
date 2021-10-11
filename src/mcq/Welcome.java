package mcq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  

public class Welcome extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	JButton b1,b2; 
	JTextField t1; 
	
	Welcome(){
		
		//Frame Welcome
		setBounds(150,100,1000,500);
	    getContentPane().setBackground(new Color(255,223,34)); 
	    setLayout(null);
	    
	    //Image
	    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mind/icons/Quizz7.jpg"));
	    JLabel l1 = new JLabel(i1);
	    l1.setBounds(0,0,500,500);
	    add(l1);
	    
	    //Title of Frame
	    JLabel l2= new JLabel("Master Minds");
	    l2.setFont(new Font("Arial",Font.BOLD,40 ));  
        l2.setForeground(Color.black);
        l2.setBounds(625, 60, 300, 45);
        add(l2); 
        
        //Text
        JLabel l3= new JLabel("Enter your name");
        l3.setFont(new Font("Arial",Font.BOLD,18));  
        l3.setForeground(Color.BLACK); 
        l3.setBounds(700, 150, 300, 30);
        add(l3); 
        
        //TextField to enter name
        t1=new JTextField();
        t1.setBounds(625,200,300,30);
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t1);
        
        
        //Rules Button
        b1=new JButton("Rules");
        b1.setBounds(625,270,120,25);
        b1.setFont(new Font("Arial",Font.BOLD,14));  
        b1.setBackground(new Color(255,195,0));
        b1.setForeground(Color.BLACK); 
        b1.addActionListener(this); 
        add(b1);
        
        //Exit Button 
        b2=new JButton("Exit");
        b2.setBounds(805,270,120,25);
        b2.setFont(new Font("Arial",Font.BOLD,14)); 
        b2.setBackground(new Color(255,195,0));
        b2.setForeground(Color.BLACK); 
        b2.addActionListener(this); 
        add(b2);
        
		setVisible(true);  
	}
	 
	
	public void actionPerformed(ActionEvent ae) {
		
		//If Rules button get clicked
		if(ae.getSource() == b1) {   
	
			String name = t1.getText();
			this.setVisible(false);  
			new Rules(name); 
			
		} 
		//else Exit button get clicked
		else {
			System.exit(0);
		}
		
	}
	
	
	public static void main(String[] args) {
		new Welcome();
	}

}
