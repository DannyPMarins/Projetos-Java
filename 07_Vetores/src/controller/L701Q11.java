package controller;

import util.Teclado;

public class L701Q11 {
	
	/*
	 * 11)	Crie um vetor a com 10 elementos e pergunte ao usuário 10 números para preencher este vetor.
	 *      Ao final, apresente o maior e o menor valor informados, além da média dos 10 números informados.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero[] = new double[10];
		double maior = numero[0], menor = numero[0], media, soma = 0;
		
		for(int cont = 0; cont < 10; cont++) {
			
			numero[cont] = Teclado.lerDouble("Informe um numero:");
			soma = soma + numero[cont];
		}
		
		media = soma / 10;
		
		for(int cont = 0; cont < 10; cont++) {
				
			if(maior < numero[cont]) {
				maior = numero[cont];
			}
			if( menor > numero[cont]) {
				menor = numero[cont];
			}
					
		}
			
		System.out.println("O maior valor informado foi " + maior);
		System.out.println("O menor valor informado foi " + menor);
		System.out.println("A media dos valores é " + media);
	}

}
