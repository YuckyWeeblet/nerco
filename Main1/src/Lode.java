import java.util.*;
public class Lode {

	static boolean j = true;
	
	public Lode() 
	{
		
	}
	
	public static int[] parnik(ArrayList<pocitacPole> idk) 
	{
		int[] souradnice = new int[4];
		
		
		Random r = new Random();
		
		
		
	while(j) 
	{
		j = false;
		
		
		int x = r.nextInt(10);
		int y = r.nextInt(10);
		
		int rotace = r.nextInt(4);
		
		
		
		
		switch(rotace) 
		{
		case 0:
			
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		
		}
		
	for() 
	{
		for(int i = 0; i<idk.size(); i++) 
		{
			if(idk.get(i).x == x && idk.get(i).y == y) 
			{
				if(idk.get(i).getShip() == true)
				{
					j = true;
				}
			}
		}
	}
	
	
	
	}	
	
		
		return souradnice;
}
	
	
}
