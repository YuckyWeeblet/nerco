import java.awt.BorderLayout;
import java.util.*;
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

	private JPanel prvniPanel;
	
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
		
		//array pocitace
		ArrayList<pocitacPole> pocitacArra = new ArrayList<>();
		
		
		//array hrace
		ArrayList<hracPole> hracArra = new ArrayList<>();
		
		
		//hlavni layout
		setBounds(100, 100, 1000, 500);
		setLayout(new BorderLayout());
		
		
		
		prvniPanel = new JPanel();
		prvniPanel.setLayout(new GridLayout(10,10));
		this.add(prvniPanel,BorderLayout.WEST);
		
		
		//prvni okno
		for(int i = 0; i<10; i++) 
		{
			for(int j = 0; j<10; j++)
			{
				hracPole b = new hracPole(j,i);
				
				b.setBounds(x+j*width,y+i*(-height),width,height);
				prvniPanel.add(b);
				hracArra.add(b);
				
			}
		}
		
		druhyPanel = new JPanel();
		druhyPanel.setLayout(new GridLayout(10,10));
		
		//druhe okno
		for(int i = 0; i<10; i++) 
		{
			for(int j = 0; j<10; j++)
			{
				pocitacPole b = new pocitacPole(j,i);
				druhyPanel.add(b);
				b.setBounds(x+j*width,y+i*(-height),width,height);
				pocitacArra.add(b);
				b.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						if(b.getHit(b)) 
						{
							b.setEnabled(false);
						}
						if(b.getShip()) 
						{
							b.setText("X");	
						}
					}
				});
				
				
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
	public void actionPerformed(ActionEvent e) {
		
		
	}

	



	
	
	

}
