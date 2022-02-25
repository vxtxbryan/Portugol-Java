package ExerciciosPortugol.java;

import java.util.Scanner;

public class Portugol8 {

	public static void main(String[] args) {
		
		double custoFabrica, custoConsumidor, custoDistribuidor, valorImposto;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("--->CALCULA O CUSTO DE UM CARRO NOVO AO CONSUMIDOR<---");
		
		System.out.println("\nInforme o custo de fábrica: ");
		custoFabrica = leitor.nextFloat();

		custoDistribuidor = custoFabrica + (custoFabrica * 0.28);
		valorImposto = custoFabrica + (custoFabrica * 0.45);

		custoConsumidor = custoFabrica + custoDistribuidor + valorImposto;

		System.out.printf("\nCUSTO AO CONSUMIDOR = R$ %.2f", custoConsumidor);

		leitor.close();
	}

}