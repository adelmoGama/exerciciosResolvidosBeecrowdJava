package iniciante_pagina_5;

import java.util.Scanner;

public class Acima_da_diagonal_principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double soma = 0;
		int cont = 0;
		char O = teclado.next().toUpperCase().charAt(0);
		double[][] M = new double[12][12];
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = teclado.nextDouble();
			}
		}
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				if(i < j) {
					soma += M[i][j];
					cont++;
				}
			}
		}
		if(O == 'S') {
			System.out.println(String.format("%.1f", soma));
		}else if(O == 'M') {
			System.out.println(String.format("%.1f", soma/cont));
		}
		teclado.close();
	}

}
