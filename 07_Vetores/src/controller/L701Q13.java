package controller;

import util.Teclado;

public class L701Q13 {
	
	/*
	 * 13)	Desenvolver um programa que armazene nome e salário de 20 pessoas, 
	 * 		calcule e armazene o novo salário sabendo-se que houve um reajuste 
	 * 		de 8%. Exibir uma listagem numerada com nome e novo salário.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome[] = new String[20];
		double salario[] = new double[20];
		double total[] = new double[20];
		
		for( int cont = 0; cont < 20; cont++) {
			nome[cont] = Teclado.lerTexto("Informe o seu nome: ");
			salario[cont] = Teclado.lerDouble("Informe o seu salario: ");
			
			total[cont] = salario[cont] * 1.08;
			System.out.println("--------------------------------");			
		}
		
		System.out.println("LISTAGEM NUMERADA:");
		for( int cont = 0; cont < 20; cont++) {
			System.out.println("Nome: " + nome[cont]);
			System.out.println("Salario sem reajuste: " + salario[cont]);
			System.out.println("Salario com reajuste: " + total[cont]);
		}
		
	}

}
