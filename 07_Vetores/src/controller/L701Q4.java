package controller;

import util.Teclado;

public class L701Q4 {
	
	/*
	 * 4)	Desenvolver um programa que pergunte oito elementos em um vetor a, construa um vetor b
	 * 	    de mesma dimens�o com os elementos do vetor a multiplicados por 3. Apresente ao final o 
	 *      vetor b. Na exibi��o, o elemento b[1] deve ser implicado pelo elemento a[1] * 3, o elemento
	 *      b[2] implicado pelo a[2] * 3, e assim por diante, at� 8.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[8];
		int b[] = new int[8];
		
		for (int cont = 0; cont < 8; cont++) {
			a[cont] = Teclado.lerInt("Informe um numero: ");
			b[cont] = a[cont] * 3;
		}

		for (int cont = 0; cont < 8; cont++) {
			System.out.println(a[cont] + " x 3 = " + b[cont]);
		}
	}

}
