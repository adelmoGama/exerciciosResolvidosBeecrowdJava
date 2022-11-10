package iniciante_pagina_4;

import java.util.Scanner;

public class Numero_primo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("h");
		int N = teclado.nextInt();
		int X = 0;
		int qtdNaoPrimo = 0;
		
		for(int i = 1; i <= N; i++) {
			X = teclado.nextInt();
			qtdNaoPrimo = 0;
			for(int k = 2; k < X; k++) {
				if(X % k == 0) {
					qtdNaoPrimo++;
				}
			}	
			if(qtdNaoPrimo == 0) {
				System.out.println(X + " eh primo");
			}else {
				System.out.println(X + " nao eh primo");
			}
		}

		teclado.close();
	}
}