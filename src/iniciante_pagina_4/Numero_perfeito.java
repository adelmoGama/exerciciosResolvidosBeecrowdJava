package iniciante_pagina_4;

import java.util.Scanner;

public class Numero_perfeito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("h");
		int N = teclado.nextInt();
		int X;
		int soma = 0;
		for(int i = 1; i <= N; i++) {
			X = teclado.nextInt();
			soma = 0;
			for(int k = X-1; k > 0; k--) {
				if(X % k == 0) {
					soma += k;
				}
			}
			if(soma == X) {
				System.out.println(X + " eh perfeito");
			}else {
				System.out.println(X + " nao eh perfeito");
			}

		}
		teclado.close();
	}

}
