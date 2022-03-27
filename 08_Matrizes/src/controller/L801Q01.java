package controller;

import util.Teclado;

public class L801Q01 {

	/*
	 * 1) Desenvolver um programa que crie uma matriz com 5 linhas e 3 colunas.
	 * Pergunte ao usuário o conteúdo desta matriz e ao final exiba a matriz
	 * inteira.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = new int[5][3];

		for (int linha = 0; linha < 5; linha++) {
			for (int col = 0; col < 3; col++) {
				m[linha][col] = Teclado.lerInt("INFORME UM NUMERO: ");
			}
		}
		System.out.println("EXIBINDO OS VALORES DA MATRIZ");

		for (int linha = 0; linha < 5; linha++) {
			for (int col = 0; col < 3; col++) {
				System.out.println(m[linha][col]);
			}
		}

	}

}
