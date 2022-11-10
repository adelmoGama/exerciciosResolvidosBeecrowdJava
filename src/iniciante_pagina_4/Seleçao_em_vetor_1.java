package iniciante_pagina_4;

import java.util.Scanner;

public class Seleçao_em_vetor_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] A = new double[100];
		
		for(int i = 0; i < 100; i++) {
			A[i] = teclado.nextDouble();
		}
		
		for(int i = 0; i< 100; i++) {
			if(A[i] <= 10) {
				System.out.println("A["+ i + "] = " + A[i]);
			}
		}
		teclado.close();
	}
}
