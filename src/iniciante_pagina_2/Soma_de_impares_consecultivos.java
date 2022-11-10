package iniciante_pagina_2;

import java.util.Scanner;

public class Soma_de_impares_consecultivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		int Y = teclado.nextInt();
		int soma = 0;
		if(X < Y) {
			for(int i = X+1; i < Y; i++) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
			System.out.println(soma);
		}else {
			for(int i = Y+1; i < X; i++) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
			System.out.println(soma);
		}
		teclado.close();
	}

}
