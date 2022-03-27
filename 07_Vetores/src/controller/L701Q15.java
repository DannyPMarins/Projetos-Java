package controller;

import util.Teclado;

public class L701Q15 {
	/*
	 * 15) Desenvolver um programa que leia um vetor a com 15 elementos inteiros.
	 * Construir um vetor b de mesmo tipo, sendo cada um dos elementos do vetor b
	 * ordenados de forma decrescente.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[15];
		int b[] = new int[15];
		int aux;

		for (int cont = 0; cont < 15; cont++) {
			a[cont] = Teclado.lerInt("Informe um numero para o vetor a:");
			b[cont] = a[cont];
		}
		
		// colocando o vetor b em ordem decrecente
		for( int x = 0; x < 14; x++) {
			for (int y = x + 1; y < 15; y++) {
				if( b[x] < b[y]) {
					aux = b[x];
					b[x] = b[y];
					b[y] = aux;
				}
			}
			
		}
		
		System.out.println("Vetor A: ");
		for (int cont = 0; cont < 15; cont++) {
			System.out.print(a[cont] + " ");
		}
		
		System.out.println("\nVetor B: ");
		for (int cont = 0; cont < 15; cont++) {
			System.out.print(b[cont] + " ");
		}
	}

}
