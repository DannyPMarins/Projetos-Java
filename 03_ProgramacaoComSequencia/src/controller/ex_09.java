package controller;

import util.Teclado;

public class ex_09 {
	/*
	 * 9)	Fazer um algoritmo que pergunte 1 número e apresente:
			a)	O próprio número
			b)	O quadrado deste número
			c)	A raiz quadrada deste número

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, quadrado, raiz;
		
		num = Teclado.lerDouble("Digite um numero: ");
		quadrado = Math.pow(num, 2);
		raiz = Math.sqrt(num);
		
		System.out.println("A) O numero digitado é " + num);
		System.out.println("B) O quadrado desse numero é " + quadrado);
		System.out.println("C) A raiz quadrada do numero é " + raiz);
		

	}

}
