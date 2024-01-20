package com.java.swingDemo;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {
	
	JFrame frame;
	JButton button;

	Button() {
		frame = new JFrame();
		button = new JButton("Click me");

//		button.setBounds(150, 100, 30, 20);
		button.setBounds(50, 50, 90, 50);

		frame.add(button);
		frame.setSize(300, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Button();
	}

}
