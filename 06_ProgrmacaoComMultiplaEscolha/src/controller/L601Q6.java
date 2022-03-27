package controller;

import util.Teclado;

public class L601Q6 {
	
	/*
	 * 6)	Desenvolver um programa que pergunte o peso de uma pessoa e tamb�m pergunte o c�digo do planeta no 
	 *      qual ela gostaria de obter como resposta o valor do seu peso neste referido planeta. As informa��es da 
	 *      tabela abaixo (somente as colunas C�digo e Planeta) devem aparecer como menu de escolha ao usu�rio:

			    C�digo	 Planeta	    Gravidade Relativa
				1	     Merc�rio	    0,37
				2	     V�nus	        0,88
				3	     Marte	        0,38
				4	     J�piter	    2,64
				5	     Saturno	    1,15
				6	     Urano	        1,17

		Para calcular o peso no planeta escolhido, utilize a f�rmula pesoNoPlaneta = (pesoNaTerra/10) * gravidadeRelativa
		. Caso o usu�rio digite um c�digo que n�o esteja na tabela, informar que o c�digo inserido est� errado.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pesoNoPlaneta, pesoNaTerra, gravidadeRelativa;
		int numero;
		
		pesoNaTerra = Teclado.lerDouble("Informe o seu peso:");
		
		System.out.println("\nMenu de op�oes\n");
		System.out.println("Codigo   |  Planeta");
		System.out.println("---------|---------");
		System.out.println("  1	     |  Merc�rio");
		System.out.println("  2	     |  V�nus");
		System.out.println("  3	     |  Marte");
		System.out.println("  4	     |  J�piter");
		System.out.println("  5	     |  Saturno");
		System.out.println("  6	     |  Urano");
		
		numero = Teclado.lerInt("Informe o codigo desejado para ver o planeta escolhido:");
		
		switch (numero) {
		
		case 1:
			gravidadeRelativa = 0.37;
			break;
			
		case 2:
			gravidadeRelativa = 0.88;
			break;
			
		case 3:
			gravidadeRelativa = 0.38;
			break;
			
		case 4:
			gravidadeRelativa = 2.64;
			break;
			
		case 5:
			gravidadeRelativa = 1.15;
			break;
			
		case 6:
			gravidadeRelativa = 1.17;
			break;
			
		default:
			System.out.println("Codigo Invalido");
			gravidadeRelativa = 0;
			break;
			
		}
			
		pesoNoPlaneta = (pesoNaTerra/10) * gravidadeRelativa;
		
		System.out.println("Seu peso no planeta escolhido � " + pesoNoPlaneta + "Kg");
	}

}
