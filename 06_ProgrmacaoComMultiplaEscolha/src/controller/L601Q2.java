package controller;

import util.Teclado;

public class L601Q2 {
	
	/*
	 * 2)	Desenvolver um programa que pergunte o sexo da pessoa e d� como resposta a seguinte orienta��o de acordo 
	 *      com o sexo informado: �Banheiro masculino � direita� ou �Banheiro feminino � esquerda�.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String banheiro;
		
		banheiro = Teclado.lerTexto("Qual � o seu sexo? masculino ou feminino? ");
		
		switch (banheiro) {
		
		case "masculino":
			System.out.println("O banheiro masculino � � direita.");
			break;
		
		case "feminino":
			System.out.println("O banheiro feminino � � esquerda");
			break;
		
		default:
			System.out.println("Erro, informe se � masculino ou feminino.");
			break;
		}

	}

}
