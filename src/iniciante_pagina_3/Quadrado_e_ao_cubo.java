package iniciante_pagina_3;

import java.util.Scanner;

public class Quadrado_e_ao_cubo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int cont = 1;
		for(int i = 0; i < N; i++) {
				int quadrado = (int)Math.pow(cont, 2);
				int cubo = (int)Math.pow(cont, 3);
				System.out.println(cont + " " + quadrado + " " + cubo);
				cont++;
			
		}
		teclado.close();

	}

}
