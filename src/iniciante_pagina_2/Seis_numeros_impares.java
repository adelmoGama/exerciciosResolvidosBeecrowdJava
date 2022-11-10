package iniciante_pagina_2;

import java.util.Scanner;

public class Seis_numeros_impares {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	
		int X = teclado.nextInt();
		
		for(int i = X; i <= X + 11; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		teclado.close();
	}

}
