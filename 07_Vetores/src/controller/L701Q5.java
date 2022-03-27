package controller;

import util.Teclado;

public class L701Q5 {
	
	/*
	 * 5)	Desenvolver um programa que pergunte 5 valores do vetor a, e em seguida crie um 
	 *      vetor b de mesma dimensão contendo os valores ao quadrado correspondentes no vetor a.
	 *      Ao final exibir os 2 vetores.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a[] = new double[5];
		double b[] = new double[5];
		
		for(int cont = 1; cont < 5; cont++) {
			a[cont] = Teclado.lerDouble("Informe o falor de a:");
			b[cont] = Math.pow(a[cont], 2);
		}
		System.out.println("---- vetor a---- ");
		for(int cont = 1; cont < 5; cont++) {
			System.out.println(a[cont] + " ");
		}
		System.out.println("---- vetor b---- ");
		for(int cont = 1; cont < 5; cont++) {
			System.out.println(b[cont] + " ");
		}
	}

}
