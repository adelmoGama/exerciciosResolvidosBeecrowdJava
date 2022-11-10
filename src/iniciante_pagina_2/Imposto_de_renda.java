package iniciante_pagina_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imposto_de_renda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.00");
		double salary = teclado.nextDouble();
		teclado.close();
		
		if(salary >= 0 && salary <= 2000.00) {
			System.out.println("Isento");
		}else if(salary > 2000.00 && salary <= 3000.00) {
			double ir = ((salary - 2000.00) * 0.08);
			System.out.println("R$ " + formato.format(ir));
		}else if(salary > 3000.00 && salary <= 4500.00) {
			double ir = 80 + ((salary - 3000.00) * 0.18);
			System.out.println("R$ " + formato.format(ir));
		}else {
			double ir = ((salary-4500) * 0.28) + 350;
			System.out.println("R$ " + formato.format(ir));
		}
	}

}
