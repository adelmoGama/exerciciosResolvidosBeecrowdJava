package iniciante_pagina_4;

import java.util.Scanner;

public class Ultrapassando_Z {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		int Z = teclado.nextInt();
		int soma = 0;
		int cont = 0;
		while(Z <= X) {
			Z = teclado.nextInt();
		}
		for(int i = 0; i <= Z; i++) {
			soma += X + i;
			cont++;
			if(soma > Z) {
				break;
			}
		}
		System.out.println(cont);
		teclado.close();
	}

}
