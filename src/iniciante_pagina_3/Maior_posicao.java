package iniciante_pagina_3;

import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int maior = 0;
		int posicao = 0;
		int valor;

		for (int i = 1; i <= 100; i++) {

			valor = teclado.nextInt();
			if (i == 1) {
				maior = valor;
				posicao = i;
			} else if (valor > maior) {
				maior = valor;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
		teclado.close();

	}

}
