package com.sreesha.time;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Testing extends JFrame {
	
	
	int x=10, y=10; //2D coordinates, for image
	Image img, sun;

	Testing() //constructor 
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
		Graphics2D g2d = (Graphics2D) g;
		
		 img = new ImageIcon("cycle.jpg").getImage(); //path. in windows like: C:\\(path\)filename.extention
		 g2d.drawImage(img, 100, 100, null);
		 
		AffineTransform at = AffineTransform.getTranslateInstance(150, 150);
		at.rotate(Math.toRadians(90));
		g2d.drawImage(img, at, null);
	}

	public static void main(String[] args) {
		new Testing();

	}

}
