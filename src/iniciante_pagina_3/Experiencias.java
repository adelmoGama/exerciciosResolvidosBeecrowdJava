package iniciante_pagina_3;

import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int totalCobaias = 0;
		int totalSapos = 0;
		int totalRatos = 0;
		int totalCoelhos = 0;
		int N = teclado.nextInt();
		for(int i = 1; i <= N; i++) {
			int Quantia = teclado.nextInt();
			char Tipo = teclado.next().charAt(0);
			if(Tipo == 'C') {
				totalCoelhos += Quantia;	
				totalCobaias += Quantia;
			}else if(Tipo == 'R') {
				totalRatos += Quantia;
				totalCobaias += Quantia;
			}else if(Tipo == 'S') {
				totalSapos += Quantia;
				totalCobaias += Quantia;
			}

		}
		teclado.close();
		double media_coelhos = (totalCoelhos*100) / (double) totalCobaias;
		double media_ratos = (totalRatos*100) / (double) totalCobaias;
		double media_sapos = (totalSapos*100) / (double) totalCobaias;
		System.out.println("Total: " + totalCobaias + " cobaias" +
				"\nTotal de coelhos: " + totalCoelhos +
				"\nTotal de ratos: " + totalRatos +
				"\nTotal de sapos: " + totalSapos);
		System.out.printf("Percentual de coelhos: %.2f", media_coelhos);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f", media_ratos);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f", media_sapos);
		System.out.println(" %");
	}
}


