package iniciante_pagina_1;

import java.util.Scanner;

public class Formula_bhaskara {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		teclado.close();
		
		double delta = Math.pow(B, 2) - (4 * A * C);
		if(delta <= 0 || A == 0) {
			System.out.println("Impossivel calcular");
		}else {
			double r1 = (-B + (Math.sqrt(delta))) / (2*A);
			double r2 = (-B - (Math.sqrt(delta))) / (2*A);
			
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
	}

}
