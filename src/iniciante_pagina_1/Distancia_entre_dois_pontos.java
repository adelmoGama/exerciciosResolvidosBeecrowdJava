package iniciante_pagina_1;

import java.util.Scanner;

public class Distancia_entre_dois_pontos {

	public static void main(String[] args) {
		System.out.println("Teste: ");
		Scanner teclado = new Scanner(System.in);
		double x1 = teclado.nextDouble();
		double y1 = teclado.nextDouble();
		double x2 = teclado.nextDouble();
		double y2 = teclado.nextDouble();
		teclado.close();
		
		double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println(String.format("%.4f", distancia));
	}

}
