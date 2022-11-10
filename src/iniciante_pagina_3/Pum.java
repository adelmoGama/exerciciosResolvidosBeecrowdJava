package iniciante_pagina_3;

import java.util.Scanner;

public class Pum {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int cont = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(cont + " ");
				cont++;
			}
			System.out.println("PUM");
			cont++;
		}
		teclado.close();
	}

}
