package iniciante_pagina_3;

import java.util.Scanner;

public class Resto_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		
		for(int i = 2; i < 10000; i++) {
			if(i % N == 2) {
				System.out.println(i);
			}
		}
		teclado.close();
	}

}
