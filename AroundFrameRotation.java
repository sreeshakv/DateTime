package com.sreesha.time;
//god (vishnu) the supreme developer & analyst 

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AroundFrameRotation extends JFrame {
	int x=10, y=10; //2D coordinates, for image
	Image img, palace;

	AroundFrameRotation() //constructor 
	{
		this.setSize(900, 900); //size of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("square-frame");
		this.setResizable(true);
		this.setVisible(true);
	}
	
	public void paint (Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		 img = new ImageIcon("cycle.jpg").getImage(); //path. in windows like: C:\\(path\)filename.extention
		 palace = new ImageIcon("palace.jpg").getImage();
		 g.drawImage(palace, 300, 300, null); //reference point is top left in swing
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
					AffineTransform at = AffineTransform.getTranslateInstance(900, y);
					at.rotate(Math.toRadians(90)); //anticlockwise rotation by 90-degree
					g2d.drawImage(img, at, null);
					Thread.sleep(50); 
				}
				x=900;
				for(int i=1;i<=30;i++)
				{
					x=x-20; //x- to move left
					AffineTransform at = AffineTransform.getTranslateInstance(x, 900);
					at.rotate(Math.toRadians(180));
					g2d.drawImage(img, at, null);
					//g.drawImage(img, x, y, null); if no rotation required without changing x & y after for loops.
					Thread.sleep(50); 
				}
				y=900;
				for(int i=1;i<=30;i++)
				{
					y=y-20; //y- to move top
					AffineTransform at = AffineTransform.getTranslateInstance(10, y);
					at.rotate(Math.toRadians(270));
					g2d.drawImage(img, at, null);
					Thread.sleep(50); 
				}
				x=10;
				y=10;
				repaint(); // calls paint() function again & again
				
			}
			catch(InterruptedException e) {
				System.out.println("exception in sleeping!");
			}
		}
	
	public static void main(String[] args) {
		new AroundFrameRotation();
		
	}
	
}
