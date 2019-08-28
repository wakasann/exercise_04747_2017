package com.waka.eight;

import java.awt.*;
import javax.swing.*;

public class Demo82 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo8.2");
		JButton button = new JButton("Press me");
		JPanel contentPanel = new JPanel();
		
		contentPanel.setLayout(new BorderLayout());
		contentPanel.add(button,BorderLayout.CENTER);
		frame.setContentPane(contentPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
