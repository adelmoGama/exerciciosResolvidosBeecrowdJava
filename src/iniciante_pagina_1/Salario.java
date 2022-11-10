package iniciante_pagina_1;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		System.out.println("Start 2");
        Scanner t = new Scanner(System.in);
        int numero = t.nextInt();
        int qtd_horas = t.nextInt();
        double valor_hora = t.nextDouble();
        t.close();
        
        double salario = valor_hora * qtd_horas;
        
        System.out.println("NUMBER = " + numero); 
		System.out.println(String.format("SALARY = U$ %.2f", salario)); 
	}
}