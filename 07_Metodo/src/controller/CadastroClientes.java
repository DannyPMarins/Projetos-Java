package controller;

import model.Cliente;

public class CadastroClientes {

	public static void main(String[] args) {
		
		// instanciando objetos de Cliente
		Cliente c1 = new Cliente();
		
		// inserindo dados nos atributos do objeto c1
		 c1.setNome("Claudia Ribeiro");
		c1.setDataNascimento("25/04/2000");
		c1.setRg(12345678);
		
		// instanciando o objeto de Cliente pelo outro metodo construtor
		Cliente c2 = new Cliente("Bernardo Leon", "22/03/1994", 45681236);
		c2.setNome("Rubinho");
		System.out.println("C2 Nome: " + c2.getNome() );
		
		Cliente c3 = new Cliente("Igor Felix", 123456789);
		c3.setDataNascimento("30/01/1993");
;

	}

}
