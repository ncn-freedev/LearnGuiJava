package LearnGuiJavaProject;

import javax.swing.JFrame;
import javax.swing.JButton;


public class MyFrame extends JFrame {
	
	public MyFrame() {
		super("Meu Frame");
		
		JButton frameButton = new JButton("Clique");
		
		getContentPane().add(frameButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

}
