package iniciante_pagina_3;

import java.util.Scanner;

public class Medias_ponderadas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		
		for(int i = 0; i < N; i++) {
			double valor1 = teclado.nextDouble();
			double valor2 = teclado.nextDouble();
			double valor3 = teclado.nextDouble();
			
			double media = (valor1*2 + valor2*3 + valor3*5)/10;
			System.out.println(String.format("%.1f", media));
		}teclado.close();

	}

}
