import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;

public class Main1 {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno frame = new Okno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
		
		
	}

}
