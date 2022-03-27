package controller;

import util.Teclado;

public class L701Q14 {
	
/*
 * 14)	Desenvolver um programa que pergunte os valores de um vetor a com 15 elementos,
 * 	    construa um vetor b de mesmo tipo, sendo que cada elemento do vetor b deve ser o fatorial
 * 	    do elemento correspondente no vetor a. Apresentar como resposta todo o conteúdo do vetor b.
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a[] = new double[15];
		double b[] = new double[15];
		double fat = 1;
		
		for( int cont = 0; cont < 15; cont++) {
			a[cont] = Teclado.lerDouble("Digite o valor de A: ");
						
			for(int aux = 1; aux <= a[cont]; aux++) {
				fat = fat * aux;
			}
			
			b[cont] = fat;
			
			fat = 1;
		}
		System.out.println("Respostas:");
		System.out.println("\n");
		for( int cont = 0; cont < 15; cont++) {
			System.out.println(a[cont] + " fatorial " + b[cont]);
		}
		

	}

}
