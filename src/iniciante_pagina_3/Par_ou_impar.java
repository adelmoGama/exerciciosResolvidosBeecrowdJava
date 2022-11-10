package iniciante_pagina_3;

import java.util.Scanner;

public class Par_ou_impar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		
		for(int i = 0; i < N; i++) {
			int X = teclado.nextInt();
			if(X % 2 == 0) {
				if(X> 0) {
					System.out.println("EVEN POSITIVE");
				}else if(X < 0) {
					System.out.println("EVEN NEGATIVE");
				}else {
					System.out.println("NULL");
				}
			}else {
				if(X> 0) {
					System.out.println("ODD POSITIVE");
				}else if(X < 0) {
					System.out.println("ODD NEGATIVE");
				}else {
					System.out.println("NULL");
				}
				
			}
		}teclado.close();

	}

}
