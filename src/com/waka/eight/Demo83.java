package com.waka.eight;

import java.awt.*;
import javax.swing.*;

public class Demo83 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo 8.3"); 
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setSize(300, 100);
		
		JButton button = new JButton("点击我",new ImageIcon("gur-project/gur-project-03.png"));
		button.setSize(100, 50);
		button.setToolTipText("我是带有图标的Button");
		
		JLabel lable = new JLabel("我只是1个文本Label");
		
		panel.add(button,BorderLayout.AFTER_LAST_LINE);
		panel.add(lable,BorderLayout.AFTER_LAST_LINE);
		
		contentPane.add(panel,BorderLayout.SOUTH);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		//@link https://blog.csdn.net/u012151974/article/details/22735365
		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
