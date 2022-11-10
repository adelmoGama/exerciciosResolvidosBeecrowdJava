package iniciante_pagina_4;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("f");
		
		int idade= 0;
		int cont = 0;
		int soma = 0;
		double media = 0;
		while(idade >= 0) {
			idade = teclado.nextInt();
			if(idade >= 0) {
				soma += idade;
				cont++;
			}else {
				
			}
		}
		if(cont > 0) {
			media = (double) soma / cont;
		}else {
			media = 0;
		}
		System.out.println(String.format("%.2f", media));
		teclado.close();
	}
}