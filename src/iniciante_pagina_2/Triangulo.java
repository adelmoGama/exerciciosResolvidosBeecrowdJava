package iniciante_pagina_2;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double maior;
        double soma;
        boolean t;
        
        // ENTRADAS:
        System.out.println("Entradas: ");
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        teclado.close();
        // PARA FORMAR UM TRIÂNGULO:
        if(A > B && A > C) {       	
        	maior = A;
        }else if(B > C) {
        		maior = B;
        }else {
        	maior = C;
        }
        
        if(maior == A) {
        	soma = B + C;
        }else if(maior == B) {
        	soma = A + C;
        }else {
        	soma = A + B;
        }
        
        if(soma > maior) {
        	t = true;
        }else {
        	t = false;
        }
        
        if(t) {
        	double perimetro = A + B +C;
        	System.out.println(String.format("Perimetro = %.1f", perimetro));
        }else {
			double areaTrapezio = ((A + B) * C) / 2;
			System.out.println(String.format("Area = %.1f", areaTrapezio));
        }
        

	}
}
