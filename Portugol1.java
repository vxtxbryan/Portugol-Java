package ExerciciosPortugol.java;

import java.util.Scanner;

public class Portugol1 {

	public static void main(String[] args) {

		
	Scanner leia = new Scanner(System.in);
		
	int anos, mes, dias;
	
	System.out.println("Escreva o n�mero em anos: ");
    anos = leia.nextInt();
    
	System.out.println("Escreva o n�mero em meses: ");
	mes = leia.nextInt();
	
	System.out.println("Escreva o n�mero em dias: ");
    dias = leia.nextInt();
    
    dias = (anos * 365) + (mes * 30) + (dias * 1);
	
	
	System.out.println("Voc� possui " + dias + " dias de vida!");
	
	leia.close();

	}

}
