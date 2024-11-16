import java.swing*;

public class GUI{
	
	// Components
	private JFrame frame = new JFrame();
	private JPanel friendPanel = new JPanel();
	private JPanel textPanel = new JPanel();
	private JPanel inputPanel = new JPanel();
	private JTextField input = new JTextField();
	private JLabel text = new JLabel();
	
	// Frame attributes
	private int height;
	private int width;

	public GUI(int height, int width){
		
		this.height = height;
		this.width = width;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(height, width);
		
		
		frame.add(friendPanel);
		
		frame.add(textPanel);
		textPanel.add(text);

		frame.add(inputPanel);
		inputPanel.add(input);

		frame.setVisible(true);
	}
}
