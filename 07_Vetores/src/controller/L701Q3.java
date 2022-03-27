package controller;

import util.Teclado;

public class L701Q3 {
	
	/*
	 * 3)  Desenvolver um programa que pergunte cinco elementos de um vetor a. No final, 
	 *     apresente a soma de todos os elementos que sejam ímpares.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		int soma = 0;
		
		for ( int cont = 0; cont < 5 ; cont++ ) {
			a[cont] = Teclado.lerInt("Informe um numero:");
		
		if(a[cont] % 2 == 1) {
			soma = soma + a[cont];
		
		   }
		}
		System.out.println("O valor dos elementos impares são: " + soma);
	}

}
