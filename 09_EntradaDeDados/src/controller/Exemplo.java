package controller;

import util.Teclado;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		String nome;
		
		num = Teclado.lerInt("Informe um numero: ");
		nome = Teclado.lerTexto("Informe seu nome: ");
		
		System.out.println("Oi " + nome + "!!");
		System.out.println("O numero informado foi: " + num);

	}

}
