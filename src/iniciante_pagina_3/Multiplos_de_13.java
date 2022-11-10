package iniciante_pagina_3;

import java.util.Scanner;

public class Multiplos_de_13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		int Y = teclado.nextInt();
		int soma = 0;
		if(X > Y) {
			for(int i = Y; i <= X; i++) {
				if(i % 13 != 0) {
					soma += i;
				}
			}
		}else {
			for(int i = X; i <= Y; i++) {
				if(i % 13 != 0) {
					soma += i;
				}
			}
		}

		System.out.println(soma);
		teclado.close();
	}

}
