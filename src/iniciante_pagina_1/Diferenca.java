package iniciante_pagina_1;

import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Start 2");
        int A = t.nextInt();
        int B = t.nextInt();
        int C = t.nextInt();
        int D = t.nextInt();
        t.close();
        int DIFERENCA = (A*B - C*D);
		System.out.println(String.format("DIFERENCA = " + DIFERENCA)); 
	}
}