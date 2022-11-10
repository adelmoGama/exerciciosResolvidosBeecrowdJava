package iniciante_pagina_3;

import java.util.Scanner;

public class Dividindo_X_por_Y {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		
		for(int i = 0; i < N; i++) {
			int X = teclado.nextInt();
			int Y = teclado.nextInt();
			if(Y == 0) {
				System.out.println("divisao impossivel");
			}else {
				float divisao = (float) X / Y;
				System.out.println(String.format("%.1f", divisao));
			}
		}
		teclado.close();
	}

}
