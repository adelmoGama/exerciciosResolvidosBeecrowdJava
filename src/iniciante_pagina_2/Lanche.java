package iniciante_pagina_2;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double produto1 = 4.00;
		double produto2 = 4.50;
		double produto3 = 5.00;
		double produto4 = 2.00;
		double produto5 = 1.50;
		int codigo = t.nextInt();
		int quantidade = t.nextInt();
		if(codigo == 1) {
			double total = produto1 * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		}else if(codigo == 2) {
			double total = produto2 * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		}else if(codigo == 3) {
			double total = produto3 * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		}else if(codigo == 4) {
			double total = produto4 * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		}else {
			double total = produto5 * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		t.close();
	}
}
