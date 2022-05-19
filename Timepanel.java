package com.sreesha.time;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Timepanel extends JPanel{
	
	JPanel panel = new JPanel();
	
	public void createPanel()
	{
		panel.setPreferredSize(new Dimension(400, 250));
		
		panel.setVisible(true);
		
		
	}
	public void paint(Graphics g)
	{
		g.drawString("time is important", 100, 100);
	}
}
