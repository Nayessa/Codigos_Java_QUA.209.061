package prova7;
import java.util.Scanner;
public class Prova7 {

	public static void main(String[] args) {
		
	double grauf;
	double grauc;
	double temperatura;
	
	Scanner leia = new Scanner (System.in);
	System.out.println ("Qual � a temperatura Fahrenheit hoje?");
	grauf = leia.nextDouble();
	
	// 1.8*c+32
	temperatura = (grauf - 32) / 1.8;
			
	System.out.println ("A temperatura em Celsius hoje � " + temperatura );
	
	System.out.println ("Qual � a temperatura em Celsiou hoje?");
	grauc = leia.nextDouble ();
	
	temperatura  = (grauc * 1.8 )+ 32;
	
	System.out.println ("A temperatura em Fahrenheit hoje �" + temperatura);
	
	leia.close();
	
	
	
	

	}

}
