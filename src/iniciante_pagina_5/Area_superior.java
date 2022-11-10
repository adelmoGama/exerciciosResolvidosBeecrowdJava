package iniciante_pagina_5;

import java.util.Scanner;

public class Area_superior {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char O = teclado.next().toUpperCase().charAt(0);
		double M [][] = new double [12][12];
		int F = -1;
		int T = -1;
		int cont = 0;
		double soma = 0;
		for(int l = 0; l < M.length; l++) {
			for(int c = 0; c < M[l].length; c++) {
				M[l][c] = teclado.nextDouble();
			}
		}
		for(int l = 0; l < 5; l++) {
			F++;
			T++;
			for(int c = 1 + F; c < 11 - T; c++) {
				soma += M[l][c];
				cont++;
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
