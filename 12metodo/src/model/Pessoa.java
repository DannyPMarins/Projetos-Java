package model;

public class Pessoa {
private String nome;
private String sexo;
private int idade;

public Pessoa() {
	super();
}
public Pessoa(String nome, String sexo, int idade) {
	super();
	this.nome = nome;
	this.sexo = sexo;
	this.idade = idade;
	}
public String getNome() {
	return nome;
}
public void setNome(String nome ) {
	
}
public void setSexo(String sexo) {
	this.sexo = sexo;
	
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
}
