package controller;

import util.Teclado;

public class ex_11 {
	/*
	 * 11)Desenvolver um programa que pergunte um número de 3 casas e apresente como resultado somente 
	 * 		o algarismo das centenas.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, resto;
		
		n1 = Teclado.lerInt("Digite um numero com 3 digitos:");
		
		if (n1 >= 100 && n1 <= 999) {
			System.out.println("O algaritimo das centenas: " + (n1 /100));
		}else {
			System.out.println("O valor digitado não possui 3 digitos");
		}
		

	}

}
