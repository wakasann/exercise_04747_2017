package com.waka.eight;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Demo85 {
	
	JFrame frame = new JFrame("Demo 8.5");
	
	JToggleButton tb1 = new JToggleButton("Button 1",new ImageIcon("gur-project/gur-project-09.png"));
	JToggleButton tb2 = new JToggleButton("Button 1",new ImageIcon("gur-project/gur-project-13.png"));
	JToggleButton tb3 = new JToggleButton("Button 1",new ImageIcon("gur-project/gur-project-04.png"));
	
	JCheckBox cb1 = new JCheckBox("JCheckbox 1");
	JCheckBox cb2 = new JCheckBox("JCheckbox 2");
	JCheckBox cb3 = new JCheckBox("JCheckbox 3");
	JCheckBox cb4 = new JCheckBox("JCheckbox 4");
	JCheckBox cb5 = new JCheckBox("JCheckbox 5");
	JCheckBox cb6 = new JCheckBox("JCheckbox 6");
	
	JRadioButton rb1 = new JRadioButton("JRadionButton 1");
	JRadioButton rb2 = new JRadioButton("JRadionButton 2");
	JRadioButton rb3 = new JRadioButton("JRadionButton 3");
	JRadioButton rb4 = new JRadioButton("JRadionButton 4");
	JRadioButton rb5 = new JRadioButton("JRadionButton 5");
	JRadioButton rb6 = new JRadioButton("JRadionButton 6");
	
	JTextArea textArea = new JTextArea();
	
	public static void main(String[] args) {
		Demo85 demo = new Demo85();
		demo.go();
	}
	
	public void go() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JPanel pa = new JPanel();
		JPanel pb = new JPanel();
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		Border etched = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etched,"JCheckbox First Group");
		p1.setBorder(border);
		
		p2.add(cb4);
		p2.add(cb5);
		p2.add(cb6);
		border = BorderFactory.createTitledBorder(etched,"JCheckbox Second Group");
		p2.setBorder(border);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(cb4);
		group1.add(cb5);
		group1.add(cb6);
		
		p3.add(rb1);
		p3.add(rb2);
		p3.add(rb3);
		border = BorderFactory.createTitledBorder(etched,"JRadio First Group");
		p3.setBorder(border);
		
		p4.add(rb4);
		p4.add(rb5);
		p4.add(rb6);
		border = BorderFactory.createTitledBorder(etched,"JRadio Second Group");
		p4.setBorder(border);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rb4);
		group2.add(rb5);
		group2.add(rb6);
		
		JScrollPane jp = new JScrollPane(textArea);
		
		p5.setLayout(new BorderLayout());
		p5.add(jp);
		border = BorderFactory.createTitledBorder(etched,"Result");
		p5.setBorder(border);
		
		//checkbox event
		ItemListener il = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				JCheckBox cb = (JCheckBox)e.getSource();
				if(cb == cb1) {
					textArea.append("\n JCcheckbox Button 1" + cb1.isSelected());
				}else if(cb == cb2) {
					textArea.append("\n JCcheckbox Button 2" + cb2.isSelected());
				}else if(cb == cb3) {
					textArea.append("\n JCcheckbox Button 3" + cb3.isSelected());
				}else if(cb == cb4) {
					textArea.append("\n JCcheckbox Button 4" + cb4.isSelected());
				}else if(cb == cb5) {
					textArea.append("\n JCcheckbox Button 5" + cb5.isSelected());
				}else{
					textArea.append("\n JCcheckbox Button 6" + cb6.isSelected());
				}
			}
		};
		
		cb1.addItemListener(il);
		cb2.addItemListener(il);
		cb3.addItemListener(il);
		cb4.addItemListener(il);
		cb5.addItemListener(il);
		cb6.addItemListener(il);
		
		//radio button event
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JRadioButton rb = (JRadioButton) e.getSource();
				if(rb == rb1) {
					textArea.append("\n You selected Radio Button 1" + rb1.isSelected());
				}else if(rb == rb2) {
					textArea.append("\n You selected Radio Button 2" + rb2.isSelected());
				}else if(rb == rb3) {
					textArea.append("\n You selected Radio Button 3" + rb3.isSelected());
				}else if(rb == rb4) {
					textArea.append("\n You selected Radio Button 4" + rb4.isSelected());
				}else if(rb == rb5) {
					textArea.append("\n You selected Radio Button 5" + rb5.isSelected());
				}else{
					textArea.append("\n You selected Radio Button 6" + rb6.isSelected());
				}
			}
		};
		
		rb1.addActionListener(al);
		rb2.addActionListener(al);
		rb3.addActionListener(al);
		rb5.addActionListener(al);
		rb5.addActionListener(al);
		rb6.addActionListener(al);
		
		
		ActionListener al2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JToggleButton tb = (JToggleButton) e.getSource();
				if(tb == tb1) {
					textArea.append("\n Toggle Button 1 Clicked,State:" + tb1.isSelected());
				}else if(tb == tb2) {
					textArea.append("\n Toggle Button 2 Clicked,State:" + tb2.isSelected());
				}else {
					textArea.append("\n Toggle Button 3 Clicked,State:" + tb3.isSelected());
				}
			}
		};
		
		tb1.addActionListener(al2);
		tb2.addActionListener(al2);
		tb3.addActionListener(al2);
		
		p6.add(tb1);
		p6.add(tb2);
		p6.add(tb3);
		border = BorderFactory.createTitledBorder(etched,"ToggleButton");
		p6.setBorder(border);
		
//		ButtonGroup group3 = new ButtonGroup();
//		group3.add(tb1);
//		group3.add(tb2);
//		group3.add(tb3);
		
		
		pa.setLayout(new GridLayout(0,1));
		pa.add(p1);
		pa.add(p2);
		
		pb.setLayout(new GridLayout(0, 1));
		pb.add(p3);
		pb.add(p4);
		
		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(0,1));
		cp.add(pa);
		cp.add(pb);
		cp.add(p6);
		cp.add(p5);
		
		
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
