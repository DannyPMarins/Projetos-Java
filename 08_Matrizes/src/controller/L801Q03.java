package controller;

import util.Teclado;

public class L801Q03 {

	/*
	 * 3) Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz, e ao final, exiba a
	 * matriz inteira e a soma dos números pares contidos na matriz.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = new int[4][3];
		int soma = 0;

		for (int linha = 0; linha < 4; linha++) {
			for (int col = 0; col < 3; col++) {
				m[linha][col] = Teclado.lerInt("IMFORME OS NUMEROS PARA PREENCHA TODA A MATRIZ:");
				if (m[linha][col] % 2 == 0) {
					soma = soma + m[linha][col];
				}
			}
		}

		System.out.println("EXIBINDO OS VALORES DA MATRIZ");

		for (int linha = 0; linha < 3; linha++) {
			for (int col = 0; col < 2; col++) {

				System.out.println(m[linha][col] + " ");
			}
			System.out.println();
		}
		System.out.println("A SOMA DOS VALORES PARES É: " + soma);
	}

}
