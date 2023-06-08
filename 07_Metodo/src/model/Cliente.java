package model;

public class Cliente {
	
	private String nome;
	private String dataNascimento;
	private int rg;
	
	
	// metodos GET e SET
	// Source >> Generate Getters e Setters >> Generate
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	// metodos construtores
	// Source >> Generate Contructior using Fields >> Generate
	public Cliente() {
		super();
	}

	public Cliente(String nome, String dataNascimento, int rg) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
	}

	public Cliente(String nome, int rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}
	
	
	
	
}
