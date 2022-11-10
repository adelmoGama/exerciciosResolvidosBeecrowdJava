package iniciante_pagina_4;

import java.util.Scanner;

public class Menor_e_posicao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("g");
		int N = teclado.nextInt();
		int[] X = new int[N];
		int menor = 1001;
		int posicao = 1001;
		
		for(int i = 0; i < X.length; i++) {
			X[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < X.length; i++) {
			if(X[i] < menor) {
				menor = X[i];
				posicao = i;
			}
		}
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
		teclado.close();
	}

}
