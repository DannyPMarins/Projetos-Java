package controller;

import util.Teclado;

public class L701Q1 {
	
	/*
	 * 1)    Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte ao usuário o nome e a profissão de
	 *       5 pessoas e preencha estes vetores. Ao final exiba um relatório apontando o nome e a profissão de cada uma das 
	 *       5 pessoas cadastradas.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome[] = new String[5];
		String profissao[] = new String[5];
		
		for ( int cont = 0 ; cont < 5 ; cont++ ) {
			nome [ cont ] = Teclado.lerTexto("Digite o seu nome:");
			profissao [ cont ] = Teclado.lerTexto("Informe a sua profissão:");
		}
		
		System.out.println("Relatorio de nomes e profissoes:");
		
		for ( int cont = 0 ; cont < 5 ; cont++ ) {
			System.out.println("Nome: " + nome [cont] + "- Profissão: " + profissao [cont]);
		}
		
		
	}

}
