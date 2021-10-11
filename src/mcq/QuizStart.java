package mcq;

import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;
import mcq.QuizStart;

public class QuizStart extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public static int count =0;
	public static int timer=15;
	public static int ans_given = 0;
	public static int score = 0;
	
	JButton next,lifeline,submit; 
	JLabel qno,question;
	String q[][] = new String[10][5]; 
	String pa[][]=new String[10][1]; 
	String qa[][]=new String[10][2];
	JRadioButton opt1,opt2,opt3,opt4;
	ButtonGroup options;
	
	
	String username;
	QuizStart(String username){
		
		this.username = username;
		
		//Frame QuizStart 
		setBounds(250,30,900,600); 
	    getContentPane().setBackground(new Color(255,223,34)); 
	    setLayout(null);
	    
	    //Image
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("mind/icons/start7.jpg"));
		JLabel l1=new JLabel (i1);
		setLayout(null);
		l1.setBounds(0,0,900,300);
		add(l1);
		
		//Question Number
	    qno = new JLabel("");
	    qno.setBounds(100,320,60,30);
	    qno.setFont(new Font("Arial",Font.BOLD,16) );
	    qno.setForeground(Color.black);
	    add(qno);
	    
	    //Question
	    question = new JLabel("");
	    question.setBounds(120,320,900,30);
	    question.setFont(new Font("Arial",Font.BOLD,16) );
	    question.setForeground(Color.black);
	    add(question);
	    
	    //2D Array of Question and Options
	    q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        
        //2D Array of Correct Answers
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        

	    //Option 1
	    opt1 = new JRadioButton("  ");
	    opt1.setBounds(150,355,400,30);
	    opt1.setFont(new Font("Arial",Font.BOLD,16) );
	    opt1.setBackground(new Color(255,223,34));
	    opt1.setForeground(Color.black);
	    add(opt1);
		
	    //Option 2
		opt2 = new JRadioButton(" ");
	    opt2.setBounds(150,390,400,30);
	    opt2.setFont(new Font("Arial",Font.BOLD,16) );
	    opt2.setBackground(new Color(255,223,34));
	    opt2.setForeground(Color.black);
	    add(opt2);
	    
	    //Option 3
		opt3 = new JRadioButton("  ");
	    opt3.setBounds(150,425,400,30);
	    opt3.setFont(new Font("Arial",Font.BOLD,16) );
	    opt3.setBackground(new Color(255,223,34));
	    opt3.setForeground(Color.black);
	    add(opt3);
	    
	    //Option 4
	    opt4= new JRadioButton("  ");
	    opt4.setBounds(150,460,400,30);
	    opt4.setFont(new Font("Arial",Font.BOLD,16) );
	    opt4.setBackground(new Color(255,223,34));
	    opt4.setForeground(Color.black);
	    add(opt4);
		
	    //Group of All options
		options = new ButtonGroup();
		options.add(opt1);  
		options.add(opt2);
		options.add(opt3);
		options.add(opt4);
		
		//Next Button
		next = new JButton("Next");
		next.setBounds(650,380,120,25);
		next.setFont(new Font("Arial",Font.BOLD,14));  
	    next.setBackground(new Color(255,195,0));
	    next.setForeground(Color.BLACK); 
		next.addActionListener(this);
		add(next);
		
		//50-50 Lifeline Button
		lifeline = new JButton("50-50 lifeline");
		lifeline.setBounds(650,415,120,25);
		lifeline.setFont(new Font("Arial",Font.BOLD,14));  
	    lifeline.setBackground(new Color(255,195,0));
	    lifeline.setForeground(Color.BLACK); 
		lifeline.addActionListener(this);
		add(lifeline);
		
		//Submit Buton
		submit = new JButton("Submit");
		submit.setBounds(650,450,120,25);
		submit.setFont(new Font("Arial",Font.BOLD,14));  
	    submit.setBackground(new Color(255,195,0));
	    submit.setForeground(Color.BLACK); 
		submit.setEnabled(false);  
		submit.addActionListener(this);
		add(submit);
		
		
		start(0);
	
		setVisible(true);
		
	}
	
		public void actionPerformed(ActionEvent ae) {
		
		//if next button get clicked
		if(ae.getSource() == next) {
			
			repaint();  
			
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			
			ans_given = 1;
		
			if(options.getSelection() == null) { 
				pa[count][0] = ""; 
			}else { 
				pa[count][0]=  options.getSelection().getActionCommand();
			}
			
			 if(count == 8 ) {
				  next.setEnabled(false);
				  submit.setEnabled(true);
			  }
			
			count++; 
			start(count);
			}
			else if(ae.getSource() == submit) {
			
			ans_given = 1;
			
			if(options.getSelection() == null) { 
				pa[count][0] = "";  
			}else { 				
				pa[count][0]=  options.getSelection().getActionCommand();
			}
		   
		   for(int i =0 ;i< pa.length;i++) {
			   if(pa[i][0].equals(qa[i][1])) {
				   score = score +10;
			   }
		   }
		   
		   this.setVisible(false);
		   new Result(username, score).setVisible(true);
			
		}
		//else if life line button get clicked
		else if(ae.getSource() == lifeline) {
			
			if(count == 2 || count == 4 || count == 6 || count ==8 || count ==9) {
				opt2.setEnabled(false);
				opt3.setEnabled(false);
			}else {
				opt1.setEnabled(false);
				opt4.setEnabled(false);
			}
			
			lifeline.setEnabled(false);
		}
		
		
	}
	
	public void paint(Graphics g) {
		
		  super.paint(g); 
		  
		  String time = "Time left - "+ timer;
		  g.setFont(new Font("Tahoma",Font.BOLD,18));
		  g.setColor(Color.RED); 		
		
		  if(timer >0) {
			  g.drawString(time, 660, 380); //display ("time left",x,y)
		  }else {
			  g.drawString("Times Up!!",660,380); 
		  }
		  
		  timer --; 
		  
		  try {
			  Thread.sleep(1000); 
			  repaint();
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		  
		  if(ans_given == 1 ) {
			  ans_given =0;
			  timer = 15;
		  }else if(timer < 0) {
			  
			  timer = 15;
			  
			  opt1.setEnabled(true);
			  opt2.setEnabled(true);
			  opt3.setEnabled(true);
			  opt4.setEnabled(true);

		  if(count == 8 ) {
			  next.setEnabled(false);
			  submit.setEnabled(true);
		  }
		  
		  if(count == 9) {
			   if(options.getSelection() == null) { 
					pa[count][0] = "";  
				}else { 
					pa[count][0]=  options.getSelection().getActionCommand();// selected option  ke value ko lega
				}
			   
			   for(int i =0 ;i< pa.length;i++) {
				   if(pa[i][0].equals(qa[i][1])) {
					   score = score +10;
				   }
			   }
			   
			   this.setVisible(false);
			   new Result(username, score).setVisible(true);
		
		  }else {
			  if(options.getSelection() == null) { 
					pa[count][0] = "";  	
				}else {
					pa[count][0]=  options.getSelection().getActionCommand();// selected option  ke value ko lega
				}
			  
			  count ++;
			  start(count);
		  }
		  
		  }
		  
		 
	}
	
	public void start(int count) {
		qno.setText("" + (count + 1)+ ". ");  //setText take string value so convert count to string
		question.setText(q[count][0]);
		
		opt1.setLabel(q[count][1]);//setting label to button
		opt1.setActionCommand(q[count][1]); //set value of label  in button
		
		opt2.setLabel(q[count][2]);
		opt2.setActionCommand(q[count][2]); //set value of label  in button

		
		opt3.setLabel(q[count][3]);
		opt3.setActionCommand(q[count][3]); //set value of label  in button

		opt4.setLabel(q[count][4]);
		opt4.setActionCommand(q[count][4]); //set value of label  in button

		options.clearSelection();
		
		
	}
	

	
	public static void main(String[] args) {
		 new QuizStart("").setVisible(true);
	}
	 
	
	
}
