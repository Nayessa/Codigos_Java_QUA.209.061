
package prova;

import java.util.Scanner;

public class Prova {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero;
		double numero1;
		double soma;
		
		System.out.println ("Digite o primeiro n�mero" );
		numero = leia.nextDouble ();
		
		System.out.println("Digite o segundo n�mero");
		numero1  = leia.nextDouble();
		
		soma = numero+numero1;
		
		System.out.println("O resultado final �: " + (numero +numero1));
		
		leia.close ();
	}

}
