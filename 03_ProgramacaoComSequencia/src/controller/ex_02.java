package controller;

import util.Teclado;

public class ex_02 {
	/*
	 * 2)	Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados: 
	 * 
			a)	Resultado de suas adi��es
			b)	Resultado de suas multiplica��es

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, num4, adi�, mult;
		
		num1 = Teclado.lerInt("Digite um numero: ");
		num2 = Teclado.lerInt("Digite o segundo numero: ");
		num3 = Teclado.lerInt("Digite o ter�eiro numero: ");
		num4 = Teclado.lerInt("Digite o quarto numero: ");
		
		adi� = num1 + num2 + num3 + num4;
		mult = num1 * num2 * num3 * num4;
		
		System.out.println("O resultado da adi��o dos quatro numeros � " + adi�);
		System.out.println("O resultado da multiplica��o dos quatro numeros � " + mult);
		
		

	}

}
