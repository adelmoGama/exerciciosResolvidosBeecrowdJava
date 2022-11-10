package iniciante_pagina_3;

import java.util.Scanner;

public class Grenais {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int jogos = 1;
		int opcao = 1;
		int golInter;
		int golGremio;
		int vitInter = 0;
		int vitGremio = 0;
		int empate = 0;

		while(opcao ==1) {
			golInter = teclado.nextInt();
			golGremio = teclado.nextInt();
			System.out.println("Novo grenal (1-sim 2-nao)");
			opcao = teclado.nextInt();
			if(opcao == 1) {
				jogos++;
			}
			
			if(golInter > golGremio) {
				vitInter++;
			}else if(golInter < golGremio) {
				vitGremio++;
			}else {
				empate++;
			}			
			while(opcao != 1 && opcao != 2) {
				System.out.println("nao");
				System.out.println("Novo grenal (1-sim 2-nao)");
				opcao = teclado.nextInt();
		}
	}
		System.out.println(jogos + " grenais");
		System.out.println("Inter:" + vitInter);
		System.out.println("Gremio:" + vitGremio);
		System.out.println("Empates:" + empate);
		if(vitInter > vitGremio) {
			System.out.println("Inter venceu mais");
		}else if(vitInter < vitGremio) {
			System.out.println("Gremio venceu mais");
		}else {
			System.out.println("Nao houve vencedor");
		}
		teclado.close();
	}
}
