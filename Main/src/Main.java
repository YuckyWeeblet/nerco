import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		float prumer = 0f;
		int zaporna = 0;
		int kladna = 0;
		int jednociferna = 0;
		int max = 0;
		for(int i = 1; i<21;i++) 
		{
			prumer = 0f;
			int cislo = r.nextInt()%101;
			if (cislo > 0) 
			{
				kladna++;
			}
			else if(cislo < 10) {
				zaporna++;
			}
			if(cislo < 0 && cislo > -1) 
			{
				jednociferna++;
			}
			if (cislo > max) 
			{
				
			}
			
			System.out.print(" cislo "+  cislo);
			prumer = prumer + cislo / i;
			
		}
		System.out.println();
		System.out.println("prumer je: "+prumer);
		System.out.println("pocet kladnych cisel: "+kladna);
		System.out.println("pocet zapornych cisel: "+zaporna);
		System.out.println("pocet jednocifernych cisel: "+jednociferna);
		
		
	}

}
