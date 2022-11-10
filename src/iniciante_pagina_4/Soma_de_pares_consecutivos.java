package iniciante_pagina_4;

import java.util.Scanner;

public class Soma_de_pares_consecutivos {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ç");
        int X = teclado.nextInt();
        int soma=0;
        int cont=0;
        while (X != 0) {
        	cont = 0;
        	soma = 0;
        	while (cont < 5) {
        		if (X % 2 == 0) {
        			soma += X;
        			cont++;
        		}
        		X++;
        	}
        	System.out.println(soma);
        	X = teclado.nextInt();
	}
        teclado.close();

}
}