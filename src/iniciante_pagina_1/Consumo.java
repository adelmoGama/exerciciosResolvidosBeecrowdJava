package iniciante_pagina_1;

import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		System.out.println("Teste: ");
        Scanner t = new Scanner(System.in);
        int X = t.nextInt();
        double Y = t.nextDouble();
        t.close();
        
        double consumo = X / Y;
        
        System.out.println(String.format("%.3f km/l", consumo));
	}
}