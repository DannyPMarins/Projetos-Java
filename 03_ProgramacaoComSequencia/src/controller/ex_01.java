package controller;

import util.Teclado;

public class ex_01 {
	
	/*
	 * 1)	Desenvolver um programa que pergunte ao usuário o seu nome completo e 
	 * seu sexo. Em seguida, o programa deve apresentar os dados anteriormente informados.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, sexo;
		
		nome = Teclado.lerTexto("Por favor informe o seu nome: ");
		
		sexo = Teclado.lerTexto("Por favor informe o seu sexo: ");
		
		
		System.out.println("Seu nome é " + nome);
		System.out.println("Seu sexo é " + sexo);

	}

}
