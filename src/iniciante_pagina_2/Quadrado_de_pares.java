package iniciante_pagina_2;

import java.util.Scanner;

public class Quadrado_de_pares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		for(int i = 1; i <= N; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "^2 = " + Math.pow(i, 2));
			}
		}
		teclado.close();
	}

}
