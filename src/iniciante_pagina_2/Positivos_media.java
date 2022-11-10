package iniciante_pagina_2;

import java.util.Scanner;

public class Positivos_media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int positivos = 0;
		double soma = 0;
		for(int i = 0; i < 6; i++) {
			double numero = teclado.nextDouble();
			if(numero > 0) {
				positivos += 1;
				soma += numero;
			}
		}
		double media = soma / positivos;
		System.out.println(positivos + " valores positivos\n" + media);
		teclado.close();
	}

}
