import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("zapiste vysku valce: ");
 		int v = s.nextInt();
 		System.out.println("zapiste polomer valce: ");
 		int p = s.nextInt();
 		Valec valec1 = new Valec(p,v);
 		Valec valec2 = new Valec();
 		if(valec1.objemValce() > valec2.objemValce()) 
 		{
 			System.out.println("objem valce s parametry co jste zadali je vetsi nez objem 2. valce");
 		}
 		else if(valec1.objemValce() < valec2.objemValce()) 
 		{
 			System.out.println("objem valce s parametry co jste zadali je mensi nez objem 2. valce");
 		}
 		else {
 			System.out.println("objemy obou valcu jsou stejne");
 		}
 		System.out.println("povrch vami zadaneho valce: "+valec1.povrchValce());
 		System.out.println("povrch valce 2: "+valec2.povrchValce());
 		System.out.println("objem vami zadaneho valce: "+valec1.objemValce());
 		System.out.println("objem valce 2: "+valec2.objemValce());
	}

}
