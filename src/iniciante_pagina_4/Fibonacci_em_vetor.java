package iniciante_pagina_4;

import java.util.Scanner;

public class Fibonacci_em_vetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int T = teclado.nextInt();
		int N = teclado.nextInt();
		int[] fibo = new int[N];
		int p = 0;
		int a = 0;
		int at = 1;
		for(int i = 0; i < T; i++) {
			for(int k = 0; k < N; k++) {
				if(k == N-1) {
					fibo[i] = k;
				}else {
					fibo[i] = k;
					p = a + at;
					a = at;
					at = p;
				}
			}
		}
		teclado.close();
	}

}
