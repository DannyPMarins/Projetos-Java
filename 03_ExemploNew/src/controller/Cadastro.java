package controller;

import model.Usuario;

public class Cadastro {

	public static void main(String[] args) {
		
		Usuario user = new Usuario();
		user.nome="João da Silva Sauro";
		user.endereco="Rua Sem Fim, 72";
		
		System.out.println("Nome: " + user.nome);
		System.out.println("Endereço " + user.endereco);
		
		Usuario danny = new Usuario();
		danny.nome = "Daniel Diaz";
		danny.endereco = "AV das americas";
		// danny.telefone = "21 98556-2233";

	}

}
