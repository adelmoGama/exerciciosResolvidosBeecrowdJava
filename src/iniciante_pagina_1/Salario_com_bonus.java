package iniciante_pagina_1;
import java.util.Scanner;

public class Salario_com_bonus {
	public static void main(String[] args) {
		System.out.println("Start 2");
        Scanner t = new Scanner(System.in);
        String nome = t.nextLine();
        double salario_fixo = t.nextDouble();
        double vendas = t.nextDouble();
        t.close();
        
        double salario = salario_fixo + (vendas * 0.15);
        
        System.out.println("NOME = " + nome); 
		System.out.println(String.format("TOTAL = R$ %.2f", salario)); 
	}
}