package prova10;

import java.util.Scanner;

public class Prova10 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	double mes;
	double mes1;
	double mes2;
	double media;
	
	System.out.println("Digite a despesa do primeiro mês");
	mes = leia.nextDouble();
	
	System.out.println("Digite a despesa do segundo mês");
	mes1 = leia.nextDouble();
	
	System.out.println ("Digite a despesa do terceiro mês");
	mes2 = leia.nextDouble ();
	
	media = (mes + mes1 + mes2)/3;
			;
			System.out.println ("A sua despesa trimestral foi R$" +media);
			
			leia.close ();

	}

}
