package iniciante_pagina_2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_simples {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] numeros = new int[3];
        int[] numerosP = new int[3];
        System.out.println("Informe os 3 valores: ");
        int valor1 = t.nextInt();
        int valor2 = t.nextInt();
        int valor3 = t.nextInt();
        numeros[0] = valor1;
        numeros[1] = valor2;
        numeros[2] = valor3;
        t.close();
        Arrays.sort(numeros);
        for(int i : numeros) {
        	System.out.println(i);
        }
        System.out.println("");
        numerosP[0] = valor1;
        numerosP[1] = valor2;
        numerosP[2] = valor3;
        for(int i : numerosP) {
        	System.out.println(i);
        }
	}

}
