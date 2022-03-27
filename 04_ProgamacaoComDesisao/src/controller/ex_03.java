package controller;

import util.Teclado;

public class ex_03 {
	/*
	 * 3) Desenvolver um programa que pergunte um número, e apresente como resposta
	 * se o referido número é par ou é ímpar.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, resto;
		
		num = Teclado.lerInt("Digite um numero: ");
		
		resto = num % 2;
		
	if (resto == 0) {
		System.out.println("Esse numero é PAR");
	}else {
		System.out.println("Esse numero é IMPAR");
	}

	}

}
