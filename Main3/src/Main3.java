import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		Zbran dudu = new Zbran();
		Scanner s = new Scanner(System.in);
		System.out.println("zbran: "+dudu.jmeno);
		System.out.println("potrebna sila: "+dudu.sila);
		System.out.println("poskozeni: "+dudu.dmg);
		System.out.println("");
		System.out.println("Zadejte jmeno vasi zbrane: ");
		String jm = s.nextLine();
		System.out.println("Zadejte potrebnou silu k drzeni zbrane: ");
		int str = s.nextInt();
		System.out.println("Zadejte dmg zbrane: ");
		int ouch = s.nextInt();
		Zbran garbage = new Zbran(jm,str,ouch);
		
		
		System.out.println("zbran: "+garbage.jmeno);
		System.out.println("potrebna sila: "+garbage.sila);
		System.out.println("poskozeni: "+garbage.dmg);
		System.out.println("");
		if(garbage.sila>dudu.sila) 
		{
			System.out.println("k vasi zbrani - "+garbage.jmeno+" - je treba vice sily. Potrebna sila: "+garbage.sila);
		}
		else if(garbage.sila<dudu.sila) 
		{
			System.out.println("k udrzeni zbrani "+dudu.jmeno+" je treba vice sily. Potrebna sila: "+dudu.sila);
		}
		else 
		{
			System.out.println("k oboum zbranim je potreba stejne mnozstvi sily pro ovladani. Potrebna sila: "+dudu.sila);
		}
	}
}
