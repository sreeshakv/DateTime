package com.sreesha.time;


import java.awt.Color;
import java.awt.Event.*;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mytimeframe extends JFrame implements ActionListener{
	
	SimpleDateFormat timeformat, dayformat, dateformat;
	Calendar calendar;
	JLabel timelabel, daylabel, datelabel, name;
	String time, day, date, str;
	
	//Timepanel tp = new Timepanel();
	
	Mytimeframe(){
		this.setSize(500, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("sreesha-time: ಶ್ರೀಶ");
		this.setLayout(new FlowLayout());
		//this.setLayout(null);
		this.setResizable(true);
		
		timeformat = new SimpleDateFormat("hh:mm:ss a");
		timelabel = new JLabel();
		time = timeformat.format(Calendar.getInstance().getTime());
		timelabel.setText(time);
		
		dayformat = new SimpleDateFormat("EEEE");
		daylabel = new JLabel();
		day = dayformat.format(Calendar.getInstance().getTime());
		
		dateformat = new SimpleDateFormat("dd MM yyyy");
		datelabel = new JLabel();
		date = dateformat.format(Calendar.getInstance().getTime());
		
		timelabel.setFont(new Font("Courier", Font.BOLD,28));
		
		name = new JLabel("time waits for none but carries many...");
		
		JTextField text = new JTextField();
		 str = text.getText();
		
		JButton but = new JButton("click for cosine wave!");
		//but.addActionListener(this);
		
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		new CosinFrame();
	}
	});
		
		this.add(timelabel);
		this.add(daylabel);
		this.add(datelabel);
		this.add(name);
		
		this.add(but);
		this.add(text);
		
		JPanel panel = new JPanel();
		
		this.setVisible(true);
		setTime();
	}
		public void setTime()
		{
			while(true)
			{
				time = timeformat.format(Calendar.getInstance().getTime());
				timelabel.setText(time);
				
				day= dayformat.format(Calendar.getInstance().getTime());
				daylabel.setText(day);
				
				date= dateformat.format(Calendar.getInstance().getTime());
				datelabel.setText(date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		public static void main(String[] args) {
			new Mytimeframe();
			
		}

		@Override
		public void actionPerformed(ActionEvent a) {
			// TODO Auto-generated method stub
			new CosinFrame();
			
		}
}

