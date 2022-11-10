package iniciante_pagina_4;

import java.util.Scanner;

public class Troca_em_vetor_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("j");
		int [] N = new int[20];
		int aux;
		int aux2 = 1;
		
		for(int i = 0; i < N.length; i++) {
			N[i] = teclado.nextInt();
		}

		for(int i = 0; i < N.length/2; i++) {
			aux = N[i];
			N[i] = N[N.length - aux2];
			N[N.length - aux2] = aux;
			aux2++;
		}
		for(int i = 0; i < N.length; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
		teclado.close();
	}

}
