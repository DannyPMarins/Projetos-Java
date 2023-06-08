package model;

public class Aluno extends Pessoa {

	private String curso;
	
	@Override
	public String toString() {
		return super.toString() + 
				" - Curso: " + this.curso;
	}
	
	public Aluno() {
		super();
	}

	public Aluno(int matricula, String nome, String dataNascimento, String curso) {
		super(matricula, nome, dataNascimento);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
