package controller;

import util.Teclado;

public class ex_02 {
	/*
	 * 2) Desenvolver um programa que permita ao aluno responder qual a capital do
	 * Brasil. O programa dever� exibir se a resposta est� certa ou errada.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capital;
		
		capital = Teclado.lerTexto("Digite a capital do Brasil: ");
		
		if (capital.equals("Brasil�a") || capital.equals("Brasilia") || capital.equals("bras�lia") || capital.equals("brasilia")) {
			System.out.println("Sua resposta esta correta!");
		}else {
			System.out.println("Errado. Digite novamente.");
		}

	}

}
