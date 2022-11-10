package iniciante_pagina_2;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("p");
		String palavra1 = t.nextLine().toLowerCase();
		String palavra2 = t.nextLine().toLowerCase();
		String palavra3 = t.nextLine().toLowerCase();
		t.close();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
					
				} else {
					System.out.println("pomba");
				}
			} else {
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
					
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
			} else {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				}else {
					System.out.println("minhoca");
				}
			}
		}

	}

}
