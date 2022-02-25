package ExerciciosPortugol.java;

import java.util.Scanner;

public class Portugol3 {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);	
		
	int horas, minutos, segundos, seg;
	
	System.out.println("Digite a duração do evento em segundos: ");
	segundos = leia.nextInt();
	
	horas = (segundos / 3600);
	minutos = ((segundos % 3600) / 60);
	seg = ((segundos % 3600) % 60);
	
	System.out.println("A duração do evento foi de " + horas + " horas " + minutos + " minutos " + seg + " segundos ");
		
	leia.close();
	
		
	}

}
