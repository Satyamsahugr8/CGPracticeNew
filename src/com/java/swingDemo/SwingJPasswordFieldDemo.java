	package com.java.swingDemo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

/**
 * A Swing program that demonstrates usages of JPasswordField component.
 * @author www.codejava.net
 *
 */
public class SwingJPasswordFieldDemo extends JFrame {
	
	private JLabel labelPassword = new JLabel("Enter password:");
	private JLabel labelConfirmPassword = new JLabel("Confirm password:");
	
	private JPasswordField passwordField1 = new JPasswordField(20);
	private JPasswordField passwordField2 = new JPasswordField(20);
	
	private JButton buttonOK = new JButton("OK");
	
	public SwingJPasswordFieldDemo() {
		super("Swing JPasswordField Demo Program");
		
		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		add(labelPassword, constraints);
		
		constraints.gridx = 1;
		add(passwordField1, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		add(labelConfirmPassword, constraints);
		
		constraints.gridx = 1;
		add(passwordField2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		add(buttonOK, constraints);

		buttonOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				buttonOKActionPerformed(event);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}
	
	private void buttonOKActionPerformed(ActionEvent event) {
		char[] password1 = passwordField1.getPassword();
		char[] password2 = passwordField2.getPassword();

		if (!Arrays.equals(password1, password2)) {
			JOptionPane.showMessageDialog(SwingJPasswordFieldDemo.this, 
					"Passwords do not match!");
			return;
		}		

		char[] correctPass = new char[] {'c', 'o', 'd', 'e', 'j', 'a', 'v', 'a'};
		if (Arrays.equals(password1, correctPass)) {
			JOptionPane.showMessageDialog(SwingJPasswordFieldDemo.this, 
				"Congratulations! You entered correct password.");			
		} else {
			JOptionPane.showMessageDialog(SwingJPasswordFieldDemo.this, 
				"Wrong password!");			
		}
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingJPasswordFieldDemo().setVisible(true);
			}
		});
	}
}