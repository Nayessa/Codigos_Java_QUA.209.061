package prova3;

import java.util.Scanner;

public class Prova3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double valorhora;
		double horastrabalhadas;
		double multiplicacao;
		System.out.println("Qual � o valor da sua hora trabalhada?");
		valorhora = leia.nextDouble();

		System.out.println("Quantas horas voc� trabalha por m�s?");
		horastrabalhadas = leia.nextDouble();

		multiplicacao = (valorhora * horastrabalhadas);

		System.out.println("Seu sal�rio mensal � R$" +  multiplicacao);

		leia.close();

	}

}
