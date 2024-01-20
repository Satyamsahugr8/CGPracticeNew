package com.ddd;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Test extends JFrame {
	public Test() {
		this.setSize(400, 400);
		int size = 8;

		JPanel content = new JPanel(new GridLayout(size, size));

		for (int i = 0; i < size * size; ++i) {
			JPanel panel = new JPanel();
			panel.setBackground(i % 2 == i / size % 2 ? Color.RED : Color.BLUE);
			content.add(panel);
		}
		this.add(content);
	}
	
	
	public static void main(String[] args) {
        Test app = new Test();
        app.setVisible(true);
        app.setResizable(false);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}