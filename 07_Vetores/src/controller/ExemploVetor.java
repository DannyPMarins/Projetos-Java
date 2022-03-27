package controller;

import util.Teclado;

public class ExemploVetor {
	
	/*
	 * Elaborar um programa de computador que pergunte o nome 10 pessoas,
	 * e ao final apresente uma lista com os nomes informados.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaração de vetor
		String nome[] = new String[10];
		
			for ( int cont = 0 ; cont < 10 ; cont ++ ) {
				
					nome [ cont ] = Teclado.lerTexto("Informe o nome de uma pessoa:");
			}
			
			for ( int cont = 0 ; cont < 10 ; cont ++ ) {
				System.out.println(nome [ cont ]);
		}
	}

}
