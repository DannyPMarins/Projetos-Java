package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado {
	/*
	 * Elaborar um programa que calcule o reajuste de salário de um funcionário, sob as seguintes
		condições:
		- Reajuste de 15% se salário menor que R$ 500,00. 
		- Reajuste de 10% se salário entre R$500,00 e R$ 1000,00. 
		- Reajuste de 5% se salário acima de R$ 1000,00.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario;
		
		salario = Teclado.lerDouble("Informe o seu salario: ");
		
		if (salario < 500) 
		{
			salario = salario * 1.15;
		}
			else 
			{
				if (salario <= 1000) 
				{
					salario = salario * 1.10;
				} 
					else {
						salario = salario * 1.05;
					}
			}
		
		System.out.println("O seu salario com o ajuste sera " + salario);
	}

}
