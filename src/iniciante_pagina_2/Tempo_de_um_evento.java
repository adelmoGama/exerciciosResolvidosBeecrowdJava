package iniciante_pagina_2;


import java.util.Scanner;

public class Tempo_de_um_evento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias = 0, horas = 0, minutos = 0, segundos = 0;
		String[] dia_inicio = teclado.nextLine().split(" ");
		String[] hora_inicio = teclado.nextLine().replaceAll(" ", "").split(":");
        String[] dia_final = teclado.nextLine().split(" ");
        String[] hora_final = teclado.nextLine().replaceAll(" ", "").split(":");
        
        int dia_inicial = Integer.parseInt(dia_inicio[1]);
        int hora_inicial = Integer.parseInt(hora_inicio[0]);
        int minuto_inicial = Integer.parseInt(hora_inicio[1]);
        int segundo_inicial = Integer.parseInt(hora_inicio[2]);
        
        int dia_fim = Integer.parseInt(dia_final[1]);
        int hora_fim = Integer.parseInt(hora_final[0]);
        int minuto_fim = Integer.parseInt(hora_final[1]);
        int segundo_fim = Integer.parseInt(hora_final[2]);
		teclado.close();
		
		if(segundo_fim < segundo_inicial) {
			segundos += 60 - (segundo_inicial - segundo_fim);
			minuto_fim -= 1;
		}else if(segundo_fim > segundo_inicial) {
			segundos += segundo_fim - segundo_inicial;
		}else {
			segundos += 0;
		}
		
		if(minuto_fim < minuto_inicial) {
			minutos += (60 - minuto_inicial) + minuto_fim;
			hora_fim -= 1;
		}else if(minuto_fim > minuto_inicial) {
			minutos += minuto_fim - minuto_inicial;
		}else {
			minutos += 0;
		}
		
		if(hora_fim < hora_inicial) {
			horas += 24 - (hora_inicial - hora_fim);
			dias -= 1;
		}else if(hora_fim > hora_inicial) {
			horas += hora_fim - hora_inicial;
		}else {
			horas += 0;
		}
		
		if(dia_fim > dia_inicial) {
			dias += dia_fim - dia_inicial;
		}else {
			dias += 0;
		}
				
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

	}
}
