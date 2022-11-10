package iniciante_pagina_1;

import java.util.Scanner;

public class Calculo_simples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int codigo1 = teclado.nextInt();
		int quantidade1 = teclado.nextInt();
		double valor1 = teclado.nextDouble();
		int codigo2 = teclado.nextInt();
		int quantidade2 = teclado.nextInt();
		double valor2 = teclado.nextDouble();
		teclado.close();
		
		double valorTotal = (quantidade1 * valor1) + (quantidade2 * valor2);
		System.out.println(codigo1 + " " + codigo2);
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorTotal));
	}
}
