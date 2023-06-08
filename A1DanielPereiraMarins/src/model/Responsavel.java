package model;

public class Responsavel {
	
	private int cnh;
	private String nome;
	private String dataNascimento;
	

// construtor simples
	public Responsavel() {
		super();
	}
// construtor completo
	public Responsavel(int cnh, String nome, String dataNascimento) {
		super();
		this.cnh = cnh;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
// metodos getters e setters
	public int getCnh() {
		return cnh;
	}
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
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
	
// questao 10 e 11
	public String validarCnh(int cnh)	{
		if(this.cnh == cnh) {
			return "APROVADO! Este é o numero de CNH do(a)" + this.nome;
		}
		return "REPROVADO! Não sera possivel exibir o nome do responsável pois a CNH inserida não confere com os dados cadastrados em nossa base de dados";	
	}
	
}
