package com.waka.eight;

import java.awt.*;
import javax.swing.*;

/**
 *  �ڰ��� ����8.1
 * @author wakasann
 *
 */
public class Demo81 {
	
	public static void main(String[] args) {
		//����һ���ֱ����JFrameʵ��
		JFrame frame = new JFrame("Demo8.1");
		//����һ��JButton��ť����ť�ı���"Press me"
		JButton button = new JButton("Press me");
		//����ť�ŵ�JFrame������
		frame.getContentPane().add(button,BorderLayout.CENTER);
		//��JFrame����Ϊ�ʵ���С
		frame.pack();
		//��ʾJFrame
		frame.setVisible(true);
		//�˳�ʱ�رմ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
