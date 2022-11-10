package iniciante_pagina_4;

import java.util.Scanner;

public class Preenchimento_de_vetor_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("g");
		int [] par = new int[5];
		int [] impar = new int[5];
		int contPar = 0;
		int contImpar = 0;
		int X;
		
		for(int i = 0; i < 15; i++) {
			X = teclado.nextInt();
			if(X % 2 == 0) {
				par[contPar] = X;
				contPar++;
			}else {
				impar[contImpar] = X;
				contImpar++;
			}
			
			if(contPar == 5) {
				contPar = 0;
				for(int j = 0; j < par.length; j++) {
					System.out.println("par[" + j + "] = " + par[j]);
				}
			}else if(contImpar == 5) {
				contImpar = 0;
				for(int j = 0; j < impar.length; j++) {
					System.out.println("impar[" + j + "] = " + impar[j]);
				}
			}
		}
        for (int i = 0; i < contImpar; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < contPar; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
        }
        teclado.close();
	}
}
