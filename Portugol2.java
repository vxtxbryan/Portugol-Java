package ExerciciosPortugol.java;

import java.util.Scanner;

public class Portugol2 {

	public static void main(String[] args) {

		
	Scanner leia = new Scanner(System.in);
		
	int ano, mes, dia, dias;
	
	System.out.println("Escreva o n�mero em dias: ");
    dias = leia.nextInt();	
    
    ano = (dias / 365);
	mes = (dias % 365) / 30;
	dia = (dias % 365) % 30;
	
	System.out.println("Voc� possui " + ano + " anos, " + mes + " meses e " + dia + " dias de vida!");
	
	leia.close();

	}

}
