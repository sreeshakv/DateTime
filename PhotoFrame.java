package com.sreesha.time;
//god (vishnu) the supreme developer & analyst 

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PhotoFrame extends JFrame {
	int x=50, y=500; //2D coordinates, for image
	Image img, sun;
	PhotoFrame() //constructor 
	{
		this.setSize(900, 900); //size of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("move-frame");
		this.setResizable(true);
		this.setVisible(true);
	}
	
	public void paint (Graphics g)
	{
		
		 img = new ImageIcon("images.jpg").getImage(); //path. in windows like: C:\\(path\)filename.extention
		 sun = new ImageIcon("sun.jpg").getImage();
		 g.drawImage(sun, 20, 20, null);
		 g.drawImage(img, x, y, null);
	
		    x=x+5; //x distance & position between images
			y=y-5; //y distance & position between images
			repaint(); //drawing images again at new position
			
			if(x==500 || y==50) {
				x=50;
				y=500;
				repaint();
			}
			
			try
			{	
				Thread.sleep(50); //speed in milliseconds
				
			}
			catch(InterruptedException e) {
				System.out.println("exception in sleeping!");
			}
		}
	
	
	public static void main(String[] args) {
		new PhotoFrame();
		
	}
	
}
