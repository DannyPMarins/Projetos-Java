package controller;

import util.Teclado;

public class L601Q3 {
	
	/*
	 * 3)	Desenvolver um programa que pergunte um número e informe como resposta se o número 
	 *      informado é par ou é ímpar.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, aux;
		
		numero = Teclado.lerInt("Informe um qualquer numero:");
		
		aux = numero % 2;
		
		
		switch (aux) {
		
		case 0:
			System.out.println("O numero " + numero + " é par.");
			break;
		
		case 1:
			System.out.println("O numero " + numero + " é impar.");
			break;

		}

	}

}
