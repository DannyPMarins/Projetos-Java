package controller;

import util.Teclado;

public class L701Q12 {
	
	/*
	 * 12)	Crie dois vetores a e b com 5 elementos cada e preencha-os com números 
	 *      informados pelo usuário. Ao final apresente os números que existem repetidos
	 *      entre os 2 vetores.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		int b[] = new int[5];
	
		
		System.out.println("Informaçoes do Vertor A");
		for(int cont = 0; cont < 5; cont++) {
			a[cont] = Teclado.lerInt("Informe um numero para o vetor a:");
		}
		
		System.out.println("Informaçoes do Vertor B");
		for(int cont = 0; cont < 5; cont++) {
			b[cont] = Teclado.lerInt("Informe um numero para o vetor b:");
		}
		
		for(int contA = 0; contA < 5; contA++) {
			for(int contB = 0; contB < 5; contB++) {
				if( a[contA] == b[contB]) {
					System.out.println(a[contA]);
				}
			}
		}
	}

}
