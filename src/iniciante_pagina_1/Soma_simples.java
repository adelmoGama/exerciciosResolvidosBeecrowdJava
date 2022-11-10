package iniciante_pagina_1;
import java.util.Scanner;

public class Soma_simples {

	public static void main(String[] args) {
		System.out.println("Informe os valores: ");
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        teclado.close();
        int SOMA = A + B;
        System.out.print("SOMA = ");
        System.out.println(SOMA);
	}
}