package ExerciciosPortugol.java;

import java.util.Scanner;

public class Portugol5 {

	public static void main(String[] args) {
		
		String nome;
		float media, nota1, nota2, nota3;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("---------------------------");
		System.out.println("\nCALCULANDO A MÉDIA DO ALUNO");
		System.out.println("\n---------------------------");

		System.out.println("\nInforme o nome do aluno: ");
		nome = leitor.nextLine();
		System.out.println("Informe a primeira nota do aluno: ");
		nota1 = leitor.nextFloat();
		System.out.println("Informe a segunda nota do aluno: ");
		nota2 = leitor.nextFloat();
		System.out.println("Informe a terceira nota do aluno: ");
		nota3 = leitor.nextFloat();

		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 3;

		System.out.println("\n---> Aluno: " + nome);
		System.out.printf("\n---> Média: %.1f",media);
		
		leitor.close();

	}

}