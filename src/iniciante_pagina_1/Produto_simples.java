package iniciante_pagina_1;

import java.util.Scanner;

public class Produto_simples {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int A = t.nextInt();
        int B = t.nextInt();
        t.close();
        int PROD = (A * B);
        System.out.println("PROD = " + PROD);
        
	}
}