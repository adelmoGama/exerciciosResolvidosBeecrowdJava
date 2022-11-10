package iniciante_pagina_1;

import java.util.Scanner;

public class Media_2 {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Start 2");
        double A = t.nextDouble();
        double B = t.nextDouble();
        double C = t.nextDouble();
        t.close();
        double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
		System.out.println(String.format("MEDIA = %.1f", media)); 
	}
}