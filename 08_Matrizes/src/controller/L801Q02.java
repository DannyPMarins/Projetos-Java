package controller;

import util.Teclado;

public class L801Q02 {

	/*
	 * 2) Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz, e ao final exiba a
	 * matriz inteira e também a soma dos números desta matriz.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][] = new int[3][2];
		int soma = 0;
		
		for (int linha = 0; linha < 3; linha++) {
			for (int col = 0; col < 2; col++) {
				m[linha][col] = Teclado.lerInt("IMFORME OS NUMEROS PARA PREENCHA TODA A MATRIZ:");
				soma = soma + m[linha][col];
			}
		}
		
		
		System.out.println("EXIBINDO OS VALORES DA MATRIZ");
		
		for (int linha = 0; linha < 3; linha++) {
			for (int col = 0; col < 2; col++) {
				System.out.println("MATRIZ PREENCHIDA:");
				System.out.println(m[linha][col]);
				System.out.println("\n");
				System.out.println("SOMA DA MATRIZ:");
				System.out.println(soma);
				System.out.println("---------------");
			}
		}

	}

}
