package controller;

import util.Teclado;

public class L601Q5 {
	
	/*
	 * 5)	Desenvolver um programa que pergunte um n�mero de 1 a 12, e responda o m�s 
	 *      correspondente ao n�mero, ou se o n�mero n�o corresponde a nenhum dos 12 meses.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mes;
		
		mes = Teclado.lerInt("Informe um numero de 1 a 12:");
		
		switch (mes) {
		
		
		case 1:
			System.out.println("Janeiro");
			break;
		
		case 2:
			System.out.println("Fevereiro");
			break;
			
		case 3:
			System.out.println("Mar�o");
			break;
			
		case 4:
			System.out.println("Abril");
			break;
			
		case 5:
			System.out.println("Maio");
			break;
			
		case 6:
			System.out.println("Junho");
			break;
			
		case 7:
			System.out.println("Julho");
			break;
			
		case 8:
			System.out.println("Agousto");
			break;
			
		case 9:
			System.out.println("Setembro");
			break;
			
		case 10:
			System.out.println("Outubro");
			break;
			
		case 11:
			System.out.println("Novembro");
			break;
			
		case 12:
			System.out.println("Dezembro");
			break;
			
		default:
			System.out.println("o n�mero n�o corresponde a nenhum dos 12 meses");
			break;
		}

	}

}
