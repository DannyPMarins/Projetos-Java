package controller;

import model.Pessoa;

public class Cadastro {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa();
	p1.setIdade(29);
	p1.setNome("Maria Silva");
	p1.setSexo("Feminino");
	System.out.println("Idade: " + p1.getIdade());
	System.out.println("Nome: " + p1.getNome());
	System.out.println("Sexo: " + p1.getSexo());
	
	Pessoa p2 = new Pessoa("José Pereira", "Masculino", 49 );
	System.out.println(p2.toString());
}
}
