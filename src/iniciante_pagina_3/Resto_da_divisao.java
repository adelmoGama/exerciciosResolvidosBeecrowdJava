package iniciante_pagina_3;

import java.util.Scanner;

public class Resto_da_divisao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		int Y = teclado.nextInt();
		
		if(X < Y) {
			for(int i = X+1; i < Y; i++) {
				if(i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		}else {
			for(int i = Y+1; i < X; i++) {
				if(i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
		}

	}

}
	teclado.close();
}
}