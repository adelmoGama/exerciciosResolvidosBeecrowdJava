package iniciante_pagina_4;

import java.util.Scanner;

public class Preenchimento_de_vetor_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("B");
		int [] N = new int[10];
		int V = teclado.nextInt();
		for(int i = 0; i < N.length; i++) {
			N[i] = V;
			V *= 2;
		}
		for(int i = 0; i < N.length; i++) {
			System.out.println("N["+i+"] = "+N[i]);
		}
		teclado.close();
	}
}
