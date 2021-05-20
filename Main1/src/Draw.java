
public class Draw {

	
	public void vykresli(int delkaRadku) 
	{
		String s = "";
		System.out.println("A B C D E F G H I J");
		for(int i = 0; i<delkaRadku; i++) 
		{
			s += " ";
		}
		
		for(int i = 0; i<delkaRadku; i++) 
		{
			System.out.println(i+" "+s);
		}
		
	}
	
	
	
}
