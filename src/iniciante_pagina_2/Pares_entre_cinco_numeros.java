package iniciante_pagina_2;

import java.util.Scanner;

public class Pares_entre_cinco_numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pares = 0;
		for(int i =0; i < 5; i++) {
			int valor = teclado.nextInt();
			if(valor % 2 == 0) {
				pares += 1;
			}
		}
		System.out.println(pares + " valores pares");
		teclado.close();
	}

}
