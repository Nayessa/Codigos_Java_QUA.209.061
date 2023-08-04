package principal;

import java.util.Scanner;


public class Prova2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		  
		double nota;
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.println("Digite a primeira nota:");
		nota = leia.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota1 = leia.nextDouble ();
		
		System.out.println("Digite a terceira nota");
		nota2 = leia.nextDouble();
				
		System.out.println("Digite a quarta nota");
		nota3 = leia.nextDouble ();
		
		media = (nota + nota1 + nota2 + nota3)/4 ;
		
		System.out.println ("A média obtida foi" + media);
		
		leia.close();
		
	}

}
