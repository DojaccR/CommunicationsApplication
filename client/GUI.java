/*
	This is the GUI class, faily self explainatory, houses code for writing to client's screens.
	This class fetches information from the client/Client to display.
*/

package client;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;

public class GUI{
	
	// Components
	private JFrame frame = new JFrame();
	private JPanel friendPanel = new JPanel();
	private JPanel textPanel = new JPanel();
	private JPanel inputPanel = new JPanel();
	private JTextField input = new JTextField();
	private final JButton sendButton = new JButton("Send");
	private JLabel text = new JLabel();
	
	// Frame attributes
	private int height;
	private int width;

	public GUI(int height, int width){
		
		this.height = height;
		this.width = width;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		
		friendPanel.setSize(width/3, height);
		frame.add(friendPanel);
		friendPanel.setLocation(0,0);
		friendPanel.setBackground(Color.black);

		textPanel.setSize(2*width/3, 4*height/5);
		frame.add(textPanel);
		textPanel.setLocation(width/3, 0);
		textPanel.add(text);
		textPanel.setBackground(Color.cyan);

		inputPanel.setLayout(new BorderLayout());
		inputPanel.setSize(2*width/3, height/5);
		inputPanel.setLocation(2*width/3, 4*height/5);
		inputPanel.add(input, BorderLayout.PAGE_START);
		input.setSize(2*width/3 - 20, 4*height/5 - 30);
		input.setLocation(10, 15);
		inputPanel.setBackground(Color.darkGray);
		inputPanel.add(sendButton, BorderLayout.SOUTH);
		sendButton.setSize(new Dimension(30, 10));
		inputPanel.setVisible(true);

		frame.add(inputPanel);
		frame.setVisible(true);
	}
}
