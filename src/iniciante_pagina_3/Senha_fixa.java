package iniciante_pagina_3;

import java.util.Scanner;

public class Senha_fixa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor = teclado.nextInt();
		
		while(valor != 2002) {
			System.out.println("Senha Invalida");
			valor = teclado.nextInt();
		}
		System.out.println("Acesso Permitido");
		teclado.close();
	}

}
