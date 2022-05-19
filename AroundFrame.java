package com.sreesha.time;
//god (vishnu) the supreme developer & analyst 

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AroundFrame extends JFrame {
	int x=10, y=10; //2D coordinates, for image
	Image img, sun;

	AroundFrame() //constructor 
	{
		this.setSize(900, 900); //size of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("circle-frame");
		this.setResizable(true);
		JLabel label = new JLabel("PRINCESS");
		 this.add(label);
		this.setVisible(true);
	}
	
	public void paint (Graphics g)
	{
		
		 img = new ImageIcon("cycle.jpg").getImage(); //path. in windows like: C:\\(path\)filename.extention
		 sun = new ImageIcon("sun.jpg").getImage();
		 g.drawImage(sun, 300, 300, null); //reference is top left in swing
		 g.drawImage(img, x, y, null); //draws image at first
		 
		 
			try
			{	
				for(int i=1;i<=30;i++)
				{
					x=x+20; //x+ to move right
					g.drawImage(img, x, y, null); // draw image at new position till for loop
					Thread.sleep(50); //delay in milliseconds
					
				}
				
				for(int i=1;i<=30;i++)
				{	
					y=y+20; //y+ to move bottom
					g.drawImage(img, x, y, null);
					Thread.sleep(50); 
				}
				
				for(int i=1;i<=30;i++)
				{
					x=x-20; //x- to move left
					g.drawImage(img, x, y, null);
					Thread.sleep(50); 
				}
				
				for(int i=1;i<=30;i++)
				{
					y=y-20; //y- to move top
					g.drawImage(img, x, y, null);
					Thread.sleep(50); 
				}
				
				repaint(); // calls paint() function again & again
				
			}
			catch(InterruptedException e) {
				System.out.println("exception in sleeping!");
			}
		}
	
	public static void main(String[] args) {
		new AroundFrame();
		
	}
	
}
