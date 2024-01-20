package com.java.swingDemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleCalculator {

	public SimpleCalculator() {

		JFrame frame = new JFrame();
		
		JTextField field = new JTextField(20);
		JTextField field2 = new JTextField(20);
		JLabel labelField = new JLabel("1 field");
		JLabel labelField2 = new JLabel("2 field");
		JLabel label = new JLabel("Result");

		JButton buttonAdd = new JButton("Add");
		JButton buttonSub = new JButton("Sub");
		JButton buttonMul = new JButton("Mul");
		JButton buttonDiv = new JButton("Div");

		buttonAdd.addActionListener(e -> {

			int num1 = Integer.parseInt(field.getText());
			int num2 = Integer.parseInt(field2.getText());

			int value = num1 + num2;
			label.setText(value + " ");

		});

		buttonSub.addActionListener(e -> {

			int num1 = Integer.parseInt(field.getText());
			int num2 = Integer.parseInt(field2.getText());

			int value = num1 - num2;
			label.setText(value + " ");

		});

		buttonMul.addActionListener(e -> {

			int num1 = Integer.parseInt(field.getText());
			int num2 = Integer.parseInt(field2.getText());

			int value = num1 * num2;
			label.setText(value + " ");

		});

		buttonDiv.addActionListener(e -> {

			int num1 = Integer.parseInt(field.getText());
			int num2 = Integer.parseInt(field2.getText());

			int value = num1 / num2;
			label.setText(value + " ");

		});

		frame.add(labelField);
		frame.add(field);
		frame.add(labelField2);
		frame.add(field2);
		frame.add(buttonAdd);
		frame.add(buttonSub);
		frame.add(buttonMul);
		frame.add(buttonDiv);
		frame.add(label);

		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
//		frame.setSize(280, 400);
		frame.setBounds(400, 200, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new SimpleCalculator();

	}

}
