package com.java.swingDemo;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

//public class SwingIntro extends JFrame{

public class SwingIntro {

	public SwingIntro() {

		JFrame frame = new JFrame();

		
		
		
	
		
		// Child Components
		JTextField textFieldUserName = new JTextField(50);

		frame.add(textFieldUserName, BorderLayout.NORTH);
		// or
//		frame.getContentPane().add(Component);
		// both are same

		
		
		
		
	
		// ADDING MENU
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenuItem menuItemExit = new JMenuItem("Exit");

		menuFile.add(menuItemExit);
		menuBar.add(menuFile);

		// adds menu bar to the frame
		frame.setJMenuBar(menuBar);

		
		
		
		
		
		
		// TYPES OF LAYOUT:
		// In which manner you want component to be displayed in the frame
		frame.setLayout(new FlowLayout());
//		frame.setLayout(new GridBagLayout());
//		frame.setLayout(new CardLayout());
//		frame.setLayout(new BorderLayout());
//		frame.getContentPane().setLayout(layout);
//		frame.setLayout(null);

		
		
		
		
		
		
		// SET FRAME LOCATION:

//		frame.setLocationRelativeTo(null);

		// Maximize the frame window:
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Set window location on screen:
//		frame.setLocation(350, 190);

		// set size before Visiblity
//		frame.setSize(600, 400);

		// Set size and location together: We can use the setBounds(x, y, width, height)
		// method
		// to set size and location of the frame in one call:
		frame.setBounds(400, 200, 600, 400);

		
		
		
		
		
		
		
		// Pack the frame: If we don’t want to specify or (don’t know) the exact size of
		// the frame,
		// we can use the method pack() to let the frame resizes itself in a manner
		// which ensures
		// all its subcomponents have their preferred sizes:
//		frame.pack();

		
		
		
		
		
		// Set the frame window always on top other windows:
//		frame.setAlwaysOnTop(true);

		
		
		
		
		
		// In case we want to listen to only one
		
		// In case we want to listen to only one (or more, but not all) events, 
		// we can create a listener class that extends from the WindowAdapter class 
		// and override only the interested event methods:
		
//		class MyWindowListener extends WindowAdapter {
//			// overrides only one method:
//			public void windowClosing(WindowEvent event) {
//				System.out.println("About to close the window");
//				}
//			}
		
		
		
		
		
		
//		//Then add this listener for the frame as follows:
//		MyWindowListener listener = new MyWindowListener();
//		frame.addWindowListener(listener);
//		
////		Or we can use anonymous class syntax like this:
//		frame.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent event) {
//				System.out.println("About to close the window");
//			}});
		
		
		
		
		
		
		frame.addWindowListener(new WindowListener() {

			public void windowActivated(WindowEvent event) {
				System.out.println("The window has been activated");
			}

			public void windowClosed(WindowEvent event) {
				System.out.println("The window has been closed");
			}

			public void windowClosing(WindowEvent event) {
				System.out.println("About to close the window");
			}

			public void windowDeactivated(WindowEvent event) {
				System.out.println("The window has been deactivated");
			}

			public void windowDeiconified(WindowEvent event) {
				System.out.println("The window has been restored");
			}

			public void windowIconified(WindowEvent event) {
				System.out.println("The window has been minimized");
			}

			public void windowOpened(WindowEvent event) {
				System.out.println("The window has been opened");
			}
		});

		
		
		
		
		// FOR TITLE ICON
		
		Image icon = new ImageIcon("C:\\Users\\satya\\eclipse-workspace\\CAPGEMINI-Learning\\src\\com\\java\\swingDemo\\images\\android.png").getImage();
		frame.setIconImage(icon);

		
		
		
		
		// Disable resizing: By default, the users can resize the frame. 
		// Use the following code if we want to prevent the frame from being resized:
		frame.setResizable(false);
		
		
		
		
		//Set background color:
		frame.setBackground(Color.GREEN);
		
		
		
		
		
		// Undecorate the frame:
		// If the frame is undecorated, its border, title bar and window buttons are all removed, 
		// only keep its content pane visible.
//		frame.setUndecorated(true);
		 
		
		
				
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new SwingIntro();
	}

}
