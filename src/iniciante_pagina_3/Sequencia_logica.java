package iniciante_pagina_3;

import java.util.Scanner;

public class Sequencia_logica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		
		for(int i = 1; i <= (N); i++) {
			System.out.println(i + " " + i*i + " " + i*i*i);
			System.out.println(i + " " + (i*i + (1)) + " " + (i*i*i+(1)));
			
		}
		teclado.close();

	}

}
