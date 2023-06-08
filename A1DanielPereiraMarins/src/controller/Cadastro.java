package controller;

import model.Responsavel;

public class Cadastro {

	public static void main(String[] args) {
		// questao 8
		Responsavel c1 = new Responsavel();
		c1.setCnh(5671219);
		c1.setNome("Joao da Silva");
		c1.setDataNascimento("19-01-1995");
		
		// questao 9
		Responsavel c2 = new Responsavel(4023981, "Ana Diaz Amato", "04-08-2000");
		
		//questao 12
		System.out.println(c1.validarCnh(5671219));
		System.out.println(c2.validarCnh(5023981));

	}

}
