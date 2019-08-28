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
		
		JButton button = new JButton("�����",new ImageIcon("gur-project/gur-project-03.png"));
		button.setSize(100, 50);
		button.setToolTipText("���Ǵ���ͼ���Button");
		
		JLabel lable = new JLabel("��ֻ��1���ı�Label");
		
		panel.add(button,BorderLayout.AFTER_LAST_LINE);
		panel.add(lable,BorderLayout.AFTER_LAST_LINE);
		
		contentPane.add(panel,BorderLayout.SOUTH);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		//@link https://blog.csdn.net/u012151974/article/details/22735365
		int windowWidth = frame.getWidth(); //��ô��ڿ�
		int windowHeight = frame.getHeight(); //��ô��ڸ�
		Toolkit kit = Toolkit.getDefaultToolkit(); //���幤�߰�
		Dimension screenSize = kit.getScreenSize(); //��ȡ��Ļ�ĳߴ�
		int screenWidth = screenSize.width; //��ȡ��Ļ�Ŀ�
		int screenHeight = screenSize.height; //��ȡ��Ļ�ĸ�
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//���ô��ھ�����ʾ 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
