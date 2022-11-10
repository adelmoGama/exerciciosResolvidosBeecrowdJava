package iniciante_pagina_1;
import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
        System.out.println("Teste: ");
        Scanner teclado = new Scanner(System.in);
        int valorCheio = teclado.nextInt();
        teclado.close();
        
        int valorAtualizado = valorCheio;
        int notas100 = valorAtualizado / 100;
        
        valorAtualizado -= notas100 * 100;
        int notas50 = valorAtualizado / 50;
        
        valorAtualizado -= notas50 * 50;
        int notas20 = valorAtualizado / 20;
        
        valorAtualizado -= notas20 * 20;
        int notas10 = valorAtualizado / 10;
        
        valorAtualizado -= notas10 * 10;
        int notas5 = valorAtualizado / 5;
        
        valorAtualizado -= notas5 * 5;
        int notas2 = valorAtualizado / 2;
        
        valorAtualizado -= notas2 * 2;
        int notas1 = valorAtualizado;
        
        System.out.println(valorCheio);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
	}
}
