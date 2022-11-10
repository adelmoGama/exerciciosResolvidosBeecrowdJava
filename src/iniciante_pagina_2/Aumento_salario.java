package iniciante_pagina_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aumento_salario {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("0.00");
		Scanner t = new Scanner(System.in);
		System.out.println("Salário atual: ");
		double salario = t.nextDouble();
		t.close();
		if(salario <= 400.00) {
			System.out.println("Novo salario: " + f.format((salario*1.15)) +
					"\nReajuste ganho: " + f.format((salario*0.15)) + 
					"\nEm percentual: 15 %");
		}else if(salario > 400.00 && salario <= 800.00) {
			System.out.println("Novo salario: " + f.format((salario*1.12)) +
					"\nReajuste ganho: " + f.format((salario*0.12)) + 
					"\nEm percentual: 12 %");
		}else if(salario > 800.00 && salario <= 1200.00) {
			System.out.println("Novo salario: " + f.format((salario*1.10)) +
					"\nReajuste ganho: " + f.format((salario*0.10)) + 
					"\nEm percentual: 10 %");
		}else if(salario > 1200.00 && salario <= 2000.00) {
			System.out.println("Novo salario: " + f.format((salario*1.07)) +
					"\nReajuste ganho: " + f.format((salario*0.07)) + 
					"\nEm percentual: 7 %");
		}else {
			System.out.println("Novo salario: " + f.format((salario*1.04)) +
					"\nReajuste ganho: " + f.format((salario*0.04)) + 
					"\nEm percentual: 4 %");
		}

	}

}
