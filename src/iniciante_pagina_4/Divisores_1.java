package iniciante_pagina_4;

import java.util.Scanner;

public class Divisores_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("h");
		int N = teclado.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				System.out.println(i);
			}
		}
		teclado.close();
	}

}
