package controller;

import util.Teclado;

public class ex_12 {
	/*
	 * 12)	Desenvolver um programa que pergunte 5 números inteiros e identifique o maior número e o menor número.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4, n5, maior, menor;
		
		n1 = Teclado.lerInt("Digite um numero inteiro:");
		n2 = Teclado.lerInt("Digite o segundo numero inteiro:");
		n3 = Teclado.lerInt("Digite o terceiro numero inteiro:");
		n4 = Teclado.lerInt("Digite o quarto numero inteiro:");
		n5 = Teclado.lerInt("Digite o quinto numero inteiro:");
		maior = n1;
		menor = n1;
		
		// MAIOR
		if (n2 > maior) {
			maior = n2;
		}
		if (n3 > maior) {
			maior = n3;
		}
		if (n4 > maior) {
			maior = n4;
		}
		if (n5 > maior) {
			maior = n5;
		}
		// MENOR
		if (n2 < menor) {
			menor = n2;
		}
		if (n3 < menor) {
			menor = n3;
		}
		if (n4 < menor) {
			menor = n4;
		}
		if (n5 < menor) {
			menor = n5;
		}
		
		System.out.println("O maior numero é + "+ maior + " e o menor numero é " + menor);

	}

}
