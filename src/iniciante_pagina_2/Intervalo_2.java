package iniciante_pagina_2;

import java.util.Scanner;

public class Intervalo_2 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int contadorDentro = 0;
		int contadorFora = 0;

		int N = teclado.nextInt();
		
		for(int i = 0; i < N; i++) {
			int X = teclado.nextInt();
			if(X >= 10 && X <= 20) {
				contadorDentro++;
			}else {
				contadorFora++;
			}
		}
		System.out.println(contadorDentro + " in");
		System.out.println(contadorFora + " out");
		teclado.close();

    }
 
}
