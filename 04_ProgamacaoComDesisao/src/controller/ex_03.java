package controller;

import util.Teclado;

public class ex_03 {
	/*
	 * 3) Desenvolver um programa que pergunte um n�mero, e apresente como resposta
	 * se o referido n�mero � par ou � �mpar.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, resto;
		
		num = Teclado.lerInt("Digite um numero: ");
		
		resto = num % 2;
		
	if (resto == 0) {
		System.out.println("Esse numero � PAR");
	}else {
		System.out.println("Esse numero � IMPAR");
	}

	}

}
