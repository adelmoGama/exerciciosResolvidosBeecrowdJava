package iniciante_pagina_2;

import java.util.Scanner;

public class Tempo_jogo {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Tempos");
		int inicioJogo = t.nextInt();
		int finalJogo = t.nextInt();
		
		if(inicioJogo == finalJogo) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}else if(finalJogo > inicioJogo) {
			int duracao = finalJogo - inicioJogo;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}else if(inicioJogo > finalJogo) {
			int duracao = 24 - (inicioJogo - finalJogo);
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		t.close();

	}

}
