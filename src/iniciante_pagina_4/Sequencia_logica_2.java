package iniciante_pagina_4;

import java.util.Scanner;

public class Sequencia_logica_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		int Y = teclado.nextInt();
		for(int i = 1; i <= Y; i++) {
			for(int v = 0; v < X; v++) {
				if(v == (int) X-1) {
					System.out.println(i);
				}else {
					System.out.printf("%d ", i);
					i++;
				}
			}
		}
		teclado.close();
	}

}
