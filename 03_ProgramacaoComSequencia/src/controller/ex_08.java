package controller;

import util.Teclado;

public class ex_08 {
	/*
	 * 8)	Fazer um programa que calcule e apresente a quantidade de litros que um automóvel gastará em uma viagem. O programa deve coletar as seguintes informações: 
	 * Distância a percorrer na viagem, em quilômetros; qual é o valor do consumo médio do automóvel, em quilômetros por litro.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km, cm, litros;
		
		km = Teclado.lerDouble("Qual é a distancia em quilometros? ");
		cm = Teclado.lerDouble("Qual é o consumo medio do carro? ");
		
		litros = km / cm;
		
		System.out.println("Voce vai precissar de " + litros + " litros de combustível");
		
		
	

		}
	
	}
