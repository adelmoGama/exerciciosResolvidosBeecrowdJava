package iniciante_pagina_1;

import java.util.Scanner;

public class Area_circulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n = 3.14159;
		System.out.println("j");
		double raio = teclado.nextDouble();
		
		double area = (raio*raio) * n;
		
		System.out.println(String.format("A=%.4f", area));
		teclado.close();
	}

}
