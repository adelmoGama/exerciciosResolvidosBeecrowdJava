package iniciante_pagina_4;

import java.util.Scanner;

public class Crescimento_populacional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dados");
		int T = teclado.nextInt();
		int PA, PB, anos;
		double G1, G2;
		
		for(int i = 0; i < T; i++) {
			anos = 0;
			PA = teclado.nextInt();
			PB = teclado.nextInt();
			G1 = teclado.nextDouble();
			G2 = teclado.nextDouble();

			while(PB >= PA) {
				PA += (PA * G1)/100;
				PB += (PB * G2)/100;
				anos++;
				if(anos > 100) {
					break;
				}
			}
			if(anos > 100) {
				System.out.println("Mias de 1 seculo.");
			}else {
				System.out.println(anos + " anos.");
			}
			
		}
		teclado.close();

	}

}
