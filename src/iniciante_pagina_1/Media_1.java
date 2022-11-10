package iniciante_pagina_1;

import java.util.Scanner;

public class Media_1 {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Start");
        double A = t.nextDouble();
        double B = t.nextDouble();
        t.close();
        double media = ((A * 3.5) + (B * 7.5)) / 11;
		System.out.println(String.format("MEDIA = %.5f", media)); 
	}
}