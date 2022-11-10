package iniciante_pagina_4;

import java.util.Scanner;

public class Substituicao_em_Vetor_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] X = new int[10];
		for(int i = 0; i < X.length; i++) {
			X[i] = teclado.nextInt();
			}
		for(int i = 0; i < X.length; i++) {
			if(X[i] <= 0) {
				X[i] = 1;
			}
		}
		for(int i = 0; i < X.length; i++) {
			System.out.println("X["+i+"] = "+X[i]);
		}
		teclado.close();
	}

}
