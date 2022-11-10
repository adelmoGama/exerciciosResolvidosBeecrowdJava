package iniciante_pagina_1;

import java.util.Scanner;

public class Gasto_combustivel {
	public static void main(String[] args) {
        System.out.println("Teste: ");
        Scanner t = new Scanner(System.in);
        int tempo = t.nextInt();
        int velocidade = t.nextInt();
        t.close();
        
        int distancia = tempo * velocidade;
        double consumo = distancia / 12.0;

		System.out.println(String.format("%.3f", consumo)); 
	}
}