 package com.sreesha.time;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Describe extends JFrame {
	Describe(){
		 JFrame frame = new JFrame("Nayana Dialogs");
	      JPanel panel = new JPanel();
//	      frame.setLayout(null);
//	      frame.getContentPane().setBackground(Color.yellow);
	      JLabel label = new JLabel("NAYANA MANOHARI");
	      JLabel label1 = new JLabel("BEAUTY ANGEL");
	      JLabel label2 = new JLabel("CULTURAL");
//	      JLabel label3 = new JLabel("SWEET VOICE");
//	      JLabel label4 = new JLabel("WONDER DANCER");
//	      JLabel label5 = new JLabel("ADORABLE GIRL");
	      
	      Dimension size = label.getPreferredSize();
	      panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      frame.add(panel);
	      frame.setSize(100, 300);
	      frame.setVisible(true);
	      
	      label.setBounds(50, 50, size.width, size.height);
	      panel.setLayout(null);
	      panel.add(label);
	      label1.setBounds(50, 90, size.width, size.height);
	      panel.add(label1);
	      label2.setBounds(50, 130, size.width, size.height);
	      panel.add(label2);
	      
//	      label3.setBounds(200, 50, size.width, size.height);
//	      panel.add(label3);
//	      
//	      label4.setBounds(200, 90, size.width, size.height);
//	      panel.add(label4);
//	      
//	      label5.setBounds(200, 130, size.width, size.height);
//	      panel.add(label5);
	      	
	}
	
//	public static void main(String[] args) {
//		new Describe();
//	   }
	
}
