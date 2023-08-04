package Principal;

import java.util.Scanner;

public class EntandaDeDADOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		
		System.out.println("Digite seu nome:");
		nome = leia.nextLine ();
		
		System.out.println("Digite sua  idade:");
		idade = leia.nextInt();
		
		System.out.println ("Digite sua altura:");
		altura= leia.nextDouble();
		
		System.out.println("Qual é o seu sexo (f/m):");
		sexo= leia.next().charAt(0);
		
		System.out.println("O nome digitado foi" +nome);
		System.out.println("A idade digitada foi"+idade);
		System.out.println("A altura digitada foi:"+ altura);
		System.out.println ("O gênero digitado foi"+ sexo);
		
		leia.close();
		

	}

}
