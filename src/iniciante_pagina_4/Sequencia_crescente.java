package iniciante_pagina_4;

import java.util.Scanner;

public class Sequencia_crescente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		
		while(X != 0) {
			for(int i = 1; i <= X; i++) {
				if(i == X) {
					System.out.println(i);
				}else {
					System.out.print(i + " ");
				}
			}
			X = teclado.nextInt();
		}
		teclado.close();
	}
}
