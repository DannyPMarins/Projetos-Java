package controller;

import util.Teclado;

public class ex_10 {
	/*
	 * 10)	Desenvolver um programa que pergunte dois números inteiros, 
	 * 		e apresente como resultado se o segundo número informado é ou 
	 * 		não um divisor do primeiro número informado.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, div;
		
		
		n1 = Teclado.lerInt("Digite um numero inteiro:");
		n2 = Teclado.lerInt("Digite outro numero inteiro:");
		
		div = n2 % n1;
		
		if (div == 0 ) {
			System.out.println("O " + n2 + " é divisor do " + n1);
		}else {
			System.out.println("O " + n2 + " não é divisivel por " + n1);
		}

	}

}
