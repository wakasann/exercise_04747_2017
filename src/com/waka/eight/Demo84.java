package com.waka.eight;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo84 extends WindowAdapter implements ActionListener{
	
	JFrame frame;
	JButton button;
	JTextField textField;
	int tag = 0;
	
	public static void main(String[] args) {
		Demo84 demo84 = new Demo84();
		demo84.go();
	}
	
	public void go() {
		frame = new JFrame("Demo84");
		button = new JButton("Button");
		button.addActionListener(this);
		frame.getContentPane().add(button,BorderLayout.SOUTH);
		
		textField = new JTextField();
		frame.getContentPane().add(textField,BorderLayout.CENTER);
		frame.addWindowListener(this);
		frame.setSize(500,600);
		frame.setVisible(true);
	}
	
	//implements interface's actionPerformed method
	public void actionPerformed(ActionEvent e) {
		String s1 = "You have pressed the button";
		String s2 = "You do another time";
		if(tag == 0) {
			textField.setText(s1);
			tag = 1;
		}else {
			textField.setText(s2);
			tag = 0;
		}
	}
	
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
