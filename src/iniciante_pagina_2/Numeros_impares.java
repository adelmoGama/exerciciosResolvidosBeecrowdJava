package iniciante_pagina_2;

import java.util.Scanner;

public class Numeros_impares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		for(int i = 1; i <= X; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		teclado.close();
	}

}
