import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Okno extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	private JPanel druhyPanel;
	
	private JPanel volnaLista;
	private JPanel volnaLista2;

	int x = 0;
	int y = 0;
	int width = 50;
	int height = 50;
	
	
	
	
	

	/**
	 * Create the frame.
	 */
	public Okno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//hlavni layout
		setBounds(100, 100, 1000, 500);
		setLayout(new BorderLayout());
		
		
		
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(10,10));
		this.add(contentPane,BorderLayout.WEST);
		
		
		//prvni okno
		for(int i = 0; i<10; i++) 
		{
			for(int j = 0; j<10; j++)
			{
				JButton b = new JButton();
				b.addActionListener(this);
				b.setBounds(x+j*width,y+i*(-height),width,height);
				contentPane.add(b);
			}
		}
		
		druhyPanel = new JPanel();
		druhyPanel.setLayout(new GridLayout(10,10));
		
		//druhe okno
		for(int i = 0; i<10; i++) 
		{
			for(int j = 0; j<10; j++)
			{
				JButton b = new JButton();
				
				
				b.setBounds(x+j*width,y+i*(-height),width,height);
				druhyPanel.add(b);
			}
		}
		this.add(druhyPanel,BorderLayout.EAST);
		
		//volne listy
		volnaLista = new JPanel();
		volnaLista.setLayout(new FlowLayout(25,25,25));
		this.add(volnaLista, BorderLayout.SOUTH);
		
		
		volnaLista2 = new JPanel();
		volnaLista2.setLayout(new FlowLayout(25,25,25));
		this.add(volnaLista2, BorderLayout.NORTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}



	
	
	

}
