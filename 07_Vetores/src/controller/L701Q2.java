package controller;

import util.Teclado;

public class L701Q2 {
	
	/*
	 * 2)    Desenvolver um programa que pergunte cinco elementos de um vetor a. 
	 *       No final, apresente a soma de todos os elementos deste vetor.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		int soma;
		soma = 0;
		
		for ( int cont = 0 ; cont < 5 ; cont++ ) {
			a [ cont ] = Teclado.lerInt("Informe um numero:" );
			
			soma = soma + a[cont];
		}
	
			System.out.println(soma);
		

	}

}
