package iniciante_pagina_4;

import java.util.Scanner;

public class Preenchimento_de_vetor_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ç");
		int [] N = new int[1000];
		int T = teclado.nextInt();
		int pos = 0;
		
		while(pos < 999) {
			for(int i = 0; i < T; i++) {
				if(pos > 999) {
					break;
				}
				N[pos] = i;
				pos++;
			}
		}
		for(int i = 0; i < N.length; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
		teclado.close();
	}
}
