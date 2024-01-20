package com.java.swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JComponentDemo {

	public JComponentDemo() {

		JFrame frame = new JFrame();

		JTextField textField = new JTextField(20);
		textField.setToolTipText("Please enter some text here");

		JButton button = new JButton("Click");
		JLabel label = new JLabel("Result:");

//		Setting input focus for JTextField
//		Normally, the text field gets focused when the user is clicking on it or pressing the TAB key. 
//		To set input focus programmatically, use the following code:
//		Setting input focus initially just after the container (such as a JFrame) is displayed:

		textField.requestFocusInWindow();

		
		
		
		
		
		
		
		// JButtonDemo

		
		
		
		
		JButton button1 = new JButton("Edit");
//		JButton button2 = new JButton(new ImageIcon(
//				"C:\\\\Users\\\\satya\\\\eclipse-workspace\\\\CAPGEMINI-Learning\\\\src\\\\com\\\\java\\\\swingDemo\\\\images\\\\android.png"));
//		JButton button3 = new JButton("Start", new ImageIcon(
//				"C:\\\\Users\\\\satya\\\\eclipse-workspace\\\\CAPGEMINI-Learning\\\\src\\\\com\\\\java\\\\swingDemo\\\\images\\\\android.png"));

		button.addActionListener(e -> {
			String content = textField.getText();
			label.setText(content);
		});

//		Adding event listener for JButton
//		Adding an event listener using anonymous class (shortcut way):
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		// Recommended ActionListener
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				// do everything here...
			}
		});

		// Setting a JButton as the default button
		frame.getRootPane().setDefaultButton(button);

		// Customise Button
		button1.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		button1.setBackground(Color.YELLOW);
		button1.setForeground(Color.BLUE);

		
		
		
		
		
		
		
		
		
		
		
		
		
		// JComboBoxDemo

	
		
		
		String[] bookTitles = new String[] { "Effective Java", "Head First Java", "Thinking in Java",
				"Java for Dummies" };

		JComboBox<String> bookList = new JComboBox<>(bookTitles);
		// add more books
		bookList.addItem("Java Generics and Collections");
		bookList.addItem("Beginnning Java 7");
		bookList.addItem("Java I/O");
		
		
		
		JButton comboButton = new JButton("Show ComboBox selected");
		JLabel labelCombo = new JLabel("ComboBox is");
		
		comboButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				// do everything here...
				// get the selected item:
				String selectedBook = (String) bookList.getSelectedItem();
				System.out.println("You seleted the book: " + selectedBook);
				labelCombo.setText(selectedBook + " ");
				}
		});
		
		//1
		JComboBox<String> myTitles = new JComboBox<String>(); 
		JComboBox<Integer> myNumbers = new JComboBox<Integer>();
		
		// create an empty combo box with items of type String
		JComboBox<String> comboLanguage = new JComboBox<String>();
		// add items to the combo box
		comboLanguage.addItem("English");
		comboLanguage.addItem("French");
		comboLanguage.addItem("Spanish");
		comboLanguage.addItem("Japanese");
		comboLanguage.addItem("Chinese");
		
		
		//2
		comboLanguage.setEditable(true);
		
		
		
		//5
		// remove an item of type String
//		bookList.removeItem("Thinking in Java");
		
		// remove an item of a custom type Job
		// the Job class must override the equals() method
//		Job consultantJob = new Job("Consultant");
//		jobList.removeItem(consultantJob);
		// remove an item at a given index:
//		jobList.removeItemAt(2);

//		Removing all items (using the removeAllItems()method):
//		bookList.removeAllItems();
		
		
		// get the selected item as an object
		String selectedBook = (String) bookList.getSelectedItem();
		
		
		
		
		//6
		bookList.addActionListener(new ActionListener() { 
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String selectedBook = (String) combo.getSelectedItem();
		 
		        if (selectedBook.equals("Effective Java")) {
		            System.out.println("Good choice!");
		        } else if (selectedBook.equals("Head First Java")) {
		            System.out.println("Nice pick, too!");
		        }
		    }
		});
		
		
//		bookList.setForeground(Color.BLUE);
		bookList.setBackground(Color.WHITE);
		bookList.setFont(new Font("Arial", Font.BOLD, 14));
		// And limit the maximum number of items displayed in the drop-down list:
		bookList.setMaximumRowCount(5); // scroller
		
		
		
		//
		String [] countries = new String[] {"India","Japan","USA","Canada"};
//		private String[][] countries = {{"USA", "us.png"},{"India", "in.png"},{"Vietnam", "vn.png"},{"Germany", "de.png"},{"Canada", "ca.png"},{"Japan", "jp.png"},{"Great Britain", "gb.png"},{"France", "fr.png"}};
		
		JComboBox<String> countriess = new JComboBox<String>(countries);
		
//		CountryComboBox customCombobox = new CountryComboBox();
//        customCombobox.setPreferredSize(new Dimension(120, 30));
//        customCombobox.setEditable(true);
//        customCombobox.addItems(countryList);
		

		countriess.addItem(selectedBook);
//		countriess.setMaximumRowCount(3);
		countriess.setBackground(Color.ORANGE);
		countriess.setFont(new Font("Arial", Font.BOLD, 14));
		
		
		
		
		
		// JPasswordField
		
		
		
		
		JPasswordField passwordField = new JPasswordField(20);
//		passwordField.setText("SaTyaM");
//		JPasswordField passwordField2 = new JPasswordField("Enter password");
//		JPasswordField passwordField3 = new JPasswordField("Enter Password", 20);
//		passwordField.setText("secret");
		
		JButton buttonPass = new JButton("passCheck");
		passwordField.selectAll();
		passwordField.setEchoChar('*');
		
		buttonPass.addActionListener(e -> {
			char[] password = passwordField.getPassword();
			char[] correctPass = new char[] {'s', 'e', 'c', 'r', 'e', 't'};
			
//			if (password.length < 8) {
//				System.out.println("Password must contain at least 8 characters!");
//				}
			if (Arrays.equals(password, correctPass)) {
				System.out.println("Password is correct");
				} 
			else {
				System.out.println("Incorrect password");
				}
			});
		
		
		
		
		
		
		//
		// Adding Components

		frame.add(textField);
		frame.add(button);
		frame.add(label);
		frame.add(button1);
//		frame.add(button2);
//		frame.add(button3);
		frame.add(bookList);
		frame.add(comboButton);
		frame.add(labelCombo);
		frame.add(countriess);
		frame.add(passwordField);
		frame.add(buttonPass);
//		frame.add(passwordField3);
		

		
		//
		//
		//
		//
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 400);
//		frame.setBounds(300, 300, 300, 400);
//		frame.setLocation(400, 200);
//		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JComponentDemo();
	}
}
