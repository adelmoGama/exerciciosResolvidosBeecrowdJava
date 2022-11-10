package iniciante_pagina_3;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

//		System.out.println("Informe o valor da coordenada X:");
		int x = t.nextInt();
//		System.out.println("Informe o valor da coordenada Y:");
		int y = t.nextInt();

		while(x != 0 && y != 0) {
			if(x == 0 && y == 0) {
				System.out.println("Origem");
			}else if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}
			
			x = t.nextInt();
			y = t.nextInt();
		}
		t.close();
	}

}
