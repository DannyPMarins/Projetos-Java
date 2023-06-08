package model;

public class Professor extends Pessoa {
	
	
	private String formacao;
	
	@Override
	public void exibirNomeEDataNascimento() {
		super.exibirNomeEDataNascimento();
		System.out.println("Formação: " + this.formacao);
		
	}
	
	
// source >> generate toString >> Generate
	@Override
	public String toString() {
		return "Professor [formacao=" + formacao + "]";
	}



	public Professor() {
		super();
	}

	public Professor(int matricula, String nome, String dataNascimento, String formacao) {
		super(matricula, nome, dataNascimento);
		this.formacao = formacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	
	

}
