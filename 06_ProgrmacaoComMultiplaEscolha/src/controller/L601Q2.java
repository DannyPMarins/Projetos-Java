package controller;

import util.Teclado;

public class L601Q2 {
	
	/*
	 * 2)	Desenvolver um programa que pergunte o sexo da pessoa e dê como resposta a seguinte orientação de acordo 
	 *      com o sexo informado: “Banheiro masculino à direita” ou “Banheiro feminino à esquerda”.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String banheiro;
		
		banheiro = Teclado.lerTexto("Qual é o seu sexo? masculino ou feminino? ");
		
		switch (banheiro) {
		
		case "masculino":
			System.out.println("O banheiro masculino é à direita.");
			break;
		
		case "feminino":
			System.out.println("O banheiro feminino é à esquerda");
			break;
		
		default:
			System.out.println("Erro, informe se é masculino ou feminino.");
			break;
		}

	}

}
