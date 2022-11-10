package iniciante_pagina_3;

import java.util.Scanner;

public class Crescente_e_decrescente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		int Y = teclado.nextInt();
		
		while(X != Y) {
			if(X > Y) {
				System.out.println("Decrescente");
			}else {
				System.out.println("Crescente");
			}
			X = teclado.nextInt();
			Y = teclado.nextInt();
		}
		teclado.close();
	}

}
