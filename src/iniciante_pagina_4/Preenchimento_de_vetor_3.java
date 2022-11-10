package iniciante_pagina_4;

import java.util.Scanner;

public class Preenchimento_de_vetor_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("l");
		double [] N = new double[100];
		double X = teclado.nextDouble();
		N[0] = X;
		for(int i = 1; i < N.length; i++) {
			N[i] = N[i - 1]/2;
		}
		for(int i = 0; i < N.length; i++) {
			System.out.print("N["+i+"] = ");
			System.out.println(String.format("%.4f",N[i]));
		}
		teclado.close();
	}
}
