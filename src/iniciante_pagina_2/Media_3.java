package iniciante_pagina_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media_3 {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat ( "0.0" );
		Scanner teclado = new Scanner(System.in);
		double N1 = teclado.nextDouble();
		double N2 = teclado.nextDouble();
		double N3 = teclado.nextDouble();
		double N4 = teclado.nextDouble();
		
		double media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
		System.out.println("Media: " + formato.format(media));
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}else if(media < 5.0) {
			System.out.println("Aluno reprovado.");
		}else if(media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			double exame = teclado.nextDouble();
			System.out.println("Nota do exame: " + formato.format(exame));
			double nova_media = ((media + exame) / 2);
			if(nova_media >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f\n", nova_media);
			}else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: " + formato.format(nova_media));
			}
		}
		teclado.close();
	}

}
