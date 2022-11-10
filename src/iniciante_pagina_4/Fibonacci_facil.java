package iniciante_pagina_4;

import java.util.Scanner;

public class Fibonacci_facil {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int p = 0;
		int a = 0;
		int at = 1;
		for(int i = 0; i < N; i++) {
			if(i == N-1) {
				System.out.println(a);
			}else {
				System.out.printf("%d ", a);
				p = a + at;
				a = at;
				at = p;
			}
		}
		teclado.close();
	}

}
