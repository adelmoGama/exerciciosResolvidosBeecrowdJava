package iniciante_pagina_1;

import java.util.Scanner;

public class Esfera {
	public static void main(String[] args) {
		System.out.println("Teste: ");
        Scanner t = new Scanner(System.in);
        double raio = t.nextDouble();
        t.close();
        
        double volume = ((4.0/3.0) * 3.14159 * (Math.pow(raio, 3)));
        
		System.out.println(String.format("VOLUME = %.3f", volume)); 
	}
}