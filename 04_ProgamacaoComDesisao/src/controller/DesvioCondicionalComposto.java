package controller;

import util.Teclado;

public class DesvioCondicionalComposto {
	/*
	 * Algoritmo para ler dois valores num�ricos, efetuar a adi��o. Se a soma
	for maior ou igual a 10, apresente o resultado somando 5, sen�o, apresente o
	resultado subtraindo 7.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, soma;
		
		num1 = Teclado.lerInt("Digite um numero: ");
		num2 = Teclado.lerInt("Digite o segundo numero: ");
		
		soma = num1 + num2;
		
		if (soma >= 10) 
		{
			System.out.println("O resultado da soma com o acrecimo de 5 � " + (soma + 5));
		}	
		
		else 
		{
			System.out.println("O resultado da soma subtraindo 7 � " + ( soma - 7));
		}
		

	}

}
