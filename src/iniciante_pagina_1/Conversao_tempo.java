package iniciante_pagina_1;

import java.util.Scanner;

public class Conversao_tempo {

	public static void main(String[] args) {
		System.out.println("Teste: ");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		teclado.close();
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int aux = N;
		if (aux >= 3600) {
			horas = aux / 3600;
			aux = aux - (3600*horas);
		}
		if(aux >= 60) {
			minutos = aux / 60;
			aux = aux - (60*minutos);
		}
		segundos = aux;
		System.out.printf("%d:%d:%d", horas, minutos, segundos);
	}
}
