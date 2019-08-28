package com.waka.eight;

import java.awt.*;
import javax.swing.*;

/**
 *  第八章 程序8.1
 * @author wakasann
 *
 */
public class Demo81 {
	
	public static void main(String[] args) {
		//创建一个又标题的JFrame实例
		JFrame frame = new JFrame("Demo8.1");
		//创建一个JButton按钮，按钮文本是"Press me"
		JButton button = new JButton("Press me");
		//将按钮放到JFrame的中央
		frame.getContentPane().add(button,BorderLayout.CENTER);
		//将JFrame设置为适当大小
		frame.pack();
		//显示JFrame
		frame.setVisible(true);
		//退出时关闭窗口
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
