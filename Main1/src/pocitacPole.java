import javax.swing.*;
public class pocitacPole extends JButton{

	public boolean isHit = false;
	public boolean isShip = false;
	
	public int x;
	public int y;
	
	
	public pocitacPole(int x, int y) 
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	//int x, int y, int width, int heigth
	//super(x,y,width,heigth);
	
	public boolean getHit(JButton b) {
		if(!isHit) 
		{
			isHit = true;
		}
		return isHit;
	}
	public boolean getShip() {
		return isShip;
	}
	
	
}
