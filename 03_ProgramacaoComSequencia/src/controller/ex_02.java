package controller;

import util.Teclado;

public class ex_02 {
	/*
	 * 2)	Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados: 
	 * 
			a)	Resultado de suas adições
			b)	Resultado de suas multiplicações

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, num4, adiç, mult;
		
		num1 = Teclado.lerInt("Digite um numero: ");
		num2 = Teclado.lerInt("Digite o segundo numero: ");
		num3 = Teclado.lerInt("Digite o terçeiro numero: ");
		num4 = Teclado.lerInt("Digite o quarto numero: ");
		
		adiç = num1 + num2 + num3 + num4;
		mult = num1 * num2 * num3 * num4;
		
		System.out.println("O resultado da adição dos quatro numeros é " + adiç);
		System.out.println("O resultado da multiplicação dos quatro numeros é " + mult);
		
		

	}

}
