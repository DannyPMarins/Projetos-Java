package controller;

import util.Teclado;

public class ex_09 {
	/*
	 * 9)	Fazer um algoritmo que pergunte 1 n�mero e apresente:
			a)	O pr�prio n�mero
			b)	O quadrado deste n�mero
			c)	A raiz quadrada deste n�mero

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, quadrado, raiz;
		
		num = Teclado.lerDouble("Digite um numero: ");
		quadrado = Math.pow(num, 2);
		raiz = Math.sqrt(num);
		
		System.out.println("A) O numero digitado � " + num);
		System.out.println("B) O quadrado desse numero � " + quadrado);
		System.out.println("C) A raiz quadrada do numero � " + raiz);
		

	}

}
