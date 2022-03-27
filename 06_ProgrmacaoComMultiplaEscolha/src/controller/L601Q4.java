package controller;

import util.Teclado;

public class L601Q4 {
	
	/*
	 * 4)	Desenvolver um programa que pergunte a sigla do estado onde a pessoa reside, e apresente 
	 *      uma das seguintes alternativas como resposta: Carioca, Paulista, Mineiro, Outros Estados.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String estado;
		
		estado = Teclado.lerTexto("Informe a sigla do estado onde reside RJ, SP, MG ou outros:");
		
		switch (estado) {
		
		case "RJ":
			System.out.println("Voce é Carioca!");
			break;
			
		case "SP":
			System.out.println("Voce é Paulista!");
			break;
		
		case "MG":
			System.out.println("Voce é Mineiro!");
			break;
			
		default:
			System.out.println("Outros Estados!");
			break;
			
		}

	}

}
