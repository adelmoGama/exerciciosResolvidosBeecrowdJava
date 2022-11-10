package iniciante_pagina_3;

import java.util.Scanner;

public class Varias_notas_com_validacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int X = 1;
		while (X == 1) {
			double nota1 = teclado.nextDouble();
			while (nota1 > 10 || nota1 < 0) {
				System.out.println("nota invalida");
				nota1 = teclado.nextDouble();
			}

			double nota2 = teclado.nextDouble();
			while (nota2 > 10 || nota2 < 0) {
				System.out.println("nota invalida");
				nota2 = teclado.nextDouble();
			}

			double media = (nota1 + nota2) / 2;
			System.out.println(String.format("media = %.2f", media));

			System.out.println("novo calculo (1-sim 2-nao)");
			X = teclado.nextInt();
			while (X != 1 && X != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				X = teclado.nextInt();
			}

		}
		teclado.close();
	}

}
