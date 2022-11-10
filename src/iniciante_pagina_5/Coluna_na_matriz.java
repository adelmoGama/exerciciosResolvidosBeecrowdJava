package iniciante_pagina_5;

import java.util.Scanner;

public class Coluna_na_matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int C = teclado.nextInt();
		double soma = 0;
		char T = teclado.next().toUpperCase().charAt(0);
		double[][] M = new double[12][12];
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = teclado.nextDouble();
			}
		}
		for(int i = 0; i < M.length; i++) {
			soma += M[i][C];
		}
		if(T == 'S') {
			System.out.println(String.format("%.1f", soma));
		}else if(T == 'M') {
			System.out.println(String.format("%.1f", soma/12));
		}
		teclado.close();

	}

}
