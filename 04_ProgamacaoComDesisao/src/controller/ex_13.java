package controller;

import util.Teclado;

public class ex_13 {
	/*
	 * 13)	Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) e 
	 * 	ao final apresente-os dispostos em ordem crescente.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, maior, menor;
		
		a = Teclado.lerInt("Digite um valor: ");
		b = Teclado.lerInt("Digite outro valor: ");
		c = Teclado.lerInt("Digite o ultimo valor: ");
		maior = a;
		
		if (b > maior) {
			System.out.println("O numero " + maior + " é o maior");
		}

	}

}
