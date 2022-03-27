package controller;

import util.Teclado;

public class DesvioCondicionalSimples {
	
	/*
	 * Algoritmo para ler dois valores numéricos, efetuar a adição e
		apresentar o resultado se o valor for maior que 10.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, soma;
		
		num1 = Teclado.lerInt("Informe o primeiro numero: ");
		num2 = Teclado.lerInt("Informe o segundo numero: ");
		
		soma = num1 + num2;
		
		if (soma > 10) {
			System.out.println("A soma dos valores inseridos é " + soma);
			
		}// fim do if
		
		System.out.println("Fim do programa");

	}// fim do método main

}// fim da classe 
