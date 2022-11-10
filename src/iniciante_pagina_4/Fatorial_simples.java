package iniciante_pagina_4;

import java.util.Scanner;

public class Fatorial_simples {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ç");
        int N = teclado.nextInt();
        int fatorial = 1;
        
        for (int i = 1; i <= N; i++) {
        	fatorial *= i;
        }
        System.out.println(fatorial);
        teclado.close();
	}

}
