package com.javaAprilTask;

import java.awt.FlowLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

public class ExcelTask {

	public ExcelTask() {

		JFrame frame = new JFrame();

		JLabel labelFILE1 = new JLabel("FILE 1 :");
		JLabel labelFILE2 = new JLabel("FILE 2 :");
		JLabel labelKEYFILE1 = new JLabel("KEY 1 :");
		JLabel labelKEYFILE2 = new JLabel("KEY 2 :");
		JLabel labelOUTPUT = new JLabel("OUTPUT :");

		JButton buttonFile1 = new JButton("open File");
		
		
		
		frame.add(labelFILE1);
		frame.add(buttonFile1);
		frame.add(labelFILE2);
		frame.add(labelKEYFILE1);
		frame.add(labelKEYFILE2);
		frame.add(labelOUTPUT);

		frame.setTitle("EXCEL TASK");
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(280, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ExcelTask();
	}

}
