package network;
	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
	public class login extends JFrame {
		JLabel l1,l2,l3;
		JPanel p;
		 JTextField t1;
		 JPasswordField pf;
		  JRadioButton mr,fr;
		  ButtonGroup g;
		  JButton b;
		  JCheckBox c1,c2,c3 ;
		  
		  login(){
		 l1 = new JLabel("UserName:");
	     t1 = new JTextField(10);
	     
	     l2 = new JLabel("Password:");
	     pf = new JPasswordField(10);
	        
	     mr = new JRadioButton("Male");
	     fr = new JRadioButton("Female");
	    
	     g = new ButtonGroup();
	     b = new JButton("Submit");
	     
	     l3=new JLabel();
	     c1=new JCheckBox("Java");
	     c2=new JCheckBox("DBMS");
	     c3=new JCheckBox("Scripting");
	     
	     b.addActionListener(new ActionListener(){
	    	 
	     @Override
	         public void actionPerformed(ActionEvent e)
	         {
	    	 String student="subject selected";
	    	 student="username:"+t1.getText()+" password :"+"***";
	    	 if(mr.isSelected()){
	    		 student+="male";
	    	 }
	    	 if(fr.isSelected()){
	    		student+="female"; 
	    	 }
	    		 if(c1.isSelected())
	    		 {
	    			 student+="Java";
	    		 }
	    			 if(c2.isSelected()){
	    		 student+="DBMS";
	    			 }
	    	 if(c3.isSelected())
	    	 {
	    		
	    		 student+="Scripting";
	    		 
	    	 }
	    	 System.out.println(student);
	    	 l3.setText(student);
	         }
	    	  
	    	 });
	     
	         
	       
	        add(l1);
	        add(t1);
	        
	        add(l2);
	        add(pf);
	         
	        g.add(mr);
	        g.add(fr);
	        
	        JPanel g = new JPanel();
	        g.add(mr);
	        g.add(fr);
	        
	        add(new JLabel("Gender:"));
	        g.add(mr);
	        g.add(fr);
	        add(g);
	        
	        JPanel p=new JPanel();
	        p.add(c1);
	        p.add(c2);
	        p.add(c3);
	         
	        add(new JLabel("subject:"));
	        add(p);
	        
	        add(b);
	        setLayout(new FlowLayout());
	        setSize(500, 500);
	        setVisible(true);
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   new login();
		}

	}
