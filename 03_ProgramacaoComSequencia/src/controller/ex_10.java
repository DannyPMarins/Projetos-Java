package controller;

import util.Teclado;

public class ex_10 {
	/*
	 * 10)	Fazer um algoritmo que efetue o cálculo do valor de uma prestação em atraso, 
	 * utilizando a fórmula prestação = valor + (valor x (taxa : 100) x tempo em dias).
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor, taxa, dias, resul;
		
		valor = Teclado.lerDouble("Digite o valor: ");
		taxa = Teclado.lerDouble("Digite a taxa: ");
		dias = Teclado.lerDouble("Digite o tempo em dias: ");
		
		resul = valor + (valor * (taxa / 100) * dias);
		
		System.out.println("O valor da prestação é " + resul);
		
		
		

	}

}
