
package prova;

import java.util.Scanner;

public class Prova {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero;
		double numero1;
		double soma;
		
		System.out.println ("Digite o primeiro número" );
		numero = leia.nextDouble ();
		
		System.out.println("Digite o segundo número");
		numero1  = leia.nextDouble();
		
		soma = numero+numero1;
		
		System.out.println("O resultado final é: " + (numero +numero1));
		
		leia.close ();
	}

}
