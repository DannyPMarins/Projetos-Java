package controller;

import util.Teclado;

public class ex_08 {
	/*
	 * 8)	Fazer um programa que calcule e apresente a quantidade de litros que um autom�vel gastar� em uma viagem. O programa deve coletar as seguintes informa��es: 
	 * Dist�ncia a percorrer na viagem, em quil�metros; qual � o valor do consumo m�dio do autom�vel, em quil�metros por litro.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km, cm, litros;
		
		km = Teclado.lerDouble("Qual � a distancia em quilometros? ");
		cm = Teclado.lerDouble("Qual � o consumo medio do carro? ");
		
		litros = km / cm;
		
		System.out.println("Voce vai precissar de " + litros + " litros de combust�vel");
		
		
	

		}
	
	}
