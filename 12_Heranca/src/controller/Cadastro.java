package controller;

import model.Professor;
import model.Aluno;
import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno ana = new Aluno();
		ana.setMatricula(501);
		ana.setNome("ANA CRISTINA SOUSA");
		ana.setDataNascimento("20/10/2000");
		ana.setCurso("ADS");
		
		
		ana.exibirNomeEDataNascimento();
		System.out.println("obj ana: " + ana);
		
		
		System.out.println("Nome: " + ana.getNome());
		System.out.println("Nome: " + ana.getCurso());
		
		Professor alex = new Professor(32, "ALEX OLIVEIRA PASSOS", "15/03/1980", "T.I.");
		alex.exibirNomeEDataNascimento();
		
		System.out.println("obj alex: " + alex);
		
		System.out.println("Nome: Prof. " + alex.getNome());
		System.out.println("Formação: " + alex.getFormacao());
		
		Pessoa carlos = new Pessoa(100, "CARLOS FERNANDO JUNIOR", "01/02/1990");
		carlos.exibirNomeEDataNascimento();
		
        System.out.println("obj carlos: " + carlos);
		
	}

}
