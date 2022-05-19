package com.sreesha.time;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CosinFrame extends JFrame{
	int x=30, y=300;
	CosinFrame()
	{
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("graph-frame");
		this.setResizable(true);
		//this.setLayout(new FlowLayout());
		//this.getContentPane().setBackground(Color.black);
//		JTextField textfield = new JTextField();
//		textfield.setBounds(100, 100, 100, 100);
//		this.add(textfield);
		this.setVisible(true);
	}
	
	public void paint (Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(300, 30, 300, 600); //y axis
		g.drawLine(30, 300, 600, 300); //x aixs
		g.fillOval(x, y, 3, 3);
		g.drawString("God has developed cosmos using maths to code for lives", 20, 100);
		run();
		repaint();
	}
	
	public void run ()
	{
		
		try {
			Thread.sleep(12);
			int ax, ay;
			ax=x-300;
			ay=y-300;
			ay=(int)(60*Math.cos(0.2*ax/3.14));
			x= ax+300;
			y =300-ay;
			x++;
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
