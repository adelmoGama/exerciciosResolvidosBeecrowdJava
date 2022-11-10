package iniciante_pagina_1;
import java.util.Scanner;

public class Idades_dias {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
        int idadeDias = teclado.nextInt();
        int anos = idadeDias / 365;
        idadeDias -= anos * 365;
        int meses = idadeDias / 30;
        idadeDias -= meses * 30;
        int dias = idadeDias;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
		
		teclado.close();
	}

}
