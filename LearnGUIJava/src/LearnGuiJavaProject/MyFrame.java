package LearnGuiJavaProject;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame {
	
	public MyFrame() {
		super("Meu Frame");
		
		Container container = getContentPane();
		
		JButton botao = new JButton("Centro Teste Clique");
		botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Você clicou");
            }
        });
		
		
		container.add(BorderLayout.NORTH, new JButton("Norte"));
		container.add(BorderLayout.SOUTH, new JButton("Sul"));
		container.add(BorderLayout.EAST, new JButton("Leste"));
		container.add(BorderLayout.WEST, new JButton("Oeste"));
		container.add(BorderLayout.CENTER, botao);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
	}

}
