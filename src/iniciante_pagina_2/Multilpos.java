package iniciante_pagina_2;

import java.util.Scanner;

public class Multilpos {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        // ENTRADA:
        System.out.println("Informe os 2 valores: ");
        int a = t.nextInt();
        int b = t.nextInt();
        // LÓGICA:
        t.close();
        if(a % b == 0 || b % a == 0) {
        	System.out.println("Sao Multiplos");
        }else {
        	System.out.println("Nao sao Multiplos");
        }
	}
}
