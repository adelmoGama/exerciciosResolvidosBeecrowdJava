package iniciante_pagina_1;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		System.out.println("Teste: ");
		Scanner teclado = new Scanner(System.in);
		int distancia = teclado.nextInt();
		teclado.close();
		
		int tempo = distancia * 2;
		
		System.out.println(tempo + " minutos");
	}

}
