package iniciante_pagina_2;

import java.util.Scanner;

public class Numeros_positivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contagem = 0;
		
		for(int i = 0; i < 6; i++) {
			System.out.println("number");
			int number = teclado.nextInt();
			if(number > 0) {
				contagem++;
			}
		}teclado.close();
		System.out.println(contagem + " valores positivos");
	}

}
