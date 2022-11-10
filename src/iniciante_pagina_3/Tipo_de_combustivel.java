package iniciante_pagina_3;

import java.util.Scanner;

public class Tipo_de_combustivel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 1;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(opcao != 4) {
			System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1: alcool++; break;
			case 2: gasolina++; break;
			case 3: diesel++; break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		teclado.close();
	}
}
