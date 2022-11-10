package iniciante_pagina_4;

import java.util.Scanner;

public class Somando_inteiros_consecutivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int N = teclado.nextInt();
		int soma = 0;
		while(N <= 0) {
			N = teclado.nextInt();
		}
		for(int i = 0; i < N; i++) {
			soma += A + i;
		}
		System.out.println(soma);
		teclado.close();
	}

}
