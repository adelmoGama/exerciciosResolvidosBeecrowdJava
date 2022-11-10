package iniciante_pagina_1;

import java.util.Scanner;

public class ConversaoTempo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Segundos");
		int N = teclado.nextInt();
		int calculo = N;
		int tempoHoras = calculo / 3600;
		calculo -= tempoHoras * 3600;
		int tempoMinutos = calculo / 60;
		calculo -= tempoMinutos * 60;
		int tempoSegundos = calculo;
		
		System.out.println(tempoHoras + ":" + tempoMinutos + ":" + tempoSegundos);
		teclado.close();
	}

}
