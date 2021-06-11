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
			
			y++;
			
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
			
			x++;
			
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
			
			x--;
			y++;
			
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
			break;
		case 1:
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
			
			y++;
			
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
			
			x--;
			
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
			
			x++;
			y++;
			
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
			
			break;
		case 2:
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
			
			x++;
			
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
			
			y++;
			
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
			
			y--;
			x++;
			
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
			
			break;
		case 3:
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
			
			x++;
			
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
			
			y--;
			
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
			
			y++;
			x++;
			
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
			
			break;
		
		}
		
	
	
		
	
	
	
	
	}	
	
		
		return souradnice;
}
	
	
}
