package iniciante_pagina_2;

import java.util.Scanner;

public class Tempo_de_jogo_com_minutos {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int hora_inicio = t.nextInt();
		int minuto_inicio = t.nextInt();
		int hora_fim = t.nextInt();
		int minuto_fim = t.nextInt();
		int hora = 0;
		int minuto = 0;
		if(hora_fim > hora_inicio) {
			hora = hora_fim - hora_inicio;
			if(minuto_fim == minuto_inicio) {
				minuto = 0;
			}else if(minuto_fim > minuto_inicio) {
				minuto = minuto_fim - minuto_inicio;
			}else {
				hora -= 1;
				minuto = 60 + (minuto_fim - minuto_inicio);
			}
		}else if(hora_fim == hora_inicio){
			if(minuto_fim == minuto_inicio) {
				hora = 24;
				minuto = 0;
			}else if(minuto_fim > minuto_inicio) {
				hora = 0;
				minuto = minuto_fim - minuto_inicio;
			}else {
				hora = 23;
				minuto = 60 + (minuto_fim - minuto_inicio);
			}
		}else {
			hora = 24 + (hora_fim - hora_inicio);
			if(minuto_fim > minuto_inicio) {
				minuto = minuto_fim - minuto_inicio;
			}else if(minuto_fim == minuto_inicio) {
				minuto = 0;
			}else {
				minuto = 60 + (minuto_fim - minuto_inicio);
				hora -= 1;
			}
		}

		
		System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");
		t.close();
	}
}
