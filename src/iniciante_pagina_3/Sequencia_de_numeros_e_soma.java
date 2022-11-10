package iniciante_pagina_3;

import java.util.Scanner;

public class Sequencia_de_numeros_e_soma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int M = teclado.nextInt();
		int N = teclado.nextInt();
		int soma = 0;

		while(M > 0 && N > 0) {
			if(M < N) {
				for(int i = M; i <= N; i++) {
					soma += i;
					System.out.print(i + " ");
				}
			}else {
				for(int i = N; i <= M; i++) {
					soma += i;
					System.out.print(i + " ");
				}
			}
			System.out.print("Sum=" + soma + "\n");
			M = teclado.nextInt();
			N = teclado.nextInt();
			soma = 0;
			
		}
		teclado.close();
	}

}
