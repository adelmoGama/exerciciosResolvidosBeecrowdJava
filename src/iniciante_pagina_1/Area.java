package iniciante_pagina_1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		System.out.println("Teste: ");
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		teclado.close();
		
		double a1 = (A * C) / 2;
		double a2 = 3.14159 * (Math.pow(C, 2));
		double a3 = ((A+B) * C) / 2;
		double a4 = Math.pow(B, 2);
		double a5 = A * B;
		
		System.out.println(String.format("TRIANGULO: %.3f", a1));
		System.out.println(String.format("CIRCULO: %.3f", a2));
		System.out.println(String.format("TRAPEZIO: %.3f", a3));
		System.out.println(String.format("QUADRADO: %.3f", a4));
		System.out.println(String.format("RETANGULO: %.3f", a5));
	}
}
