
public class Valec {
	public int polomer;
	public int vyska;
	
	public Valec(int pol, int vys) 
	{
		polomer = pol;
		vyska = vys;
	}
	public Valec() 
	{
		polomer = 3;
		vyska = 5;
	}
	public float objemValce() 
	{
		float objem = 3.14f * 2 * polomer * vyska;
		return objem;
	}
	public float povrchValce() 
	{
		float povrch = 2 * 3.14f * polomer * (polomer + vyska);
		return povrch;
	}
}

