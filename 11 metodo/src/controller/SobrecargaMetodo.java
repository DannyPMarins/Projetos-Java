package controller;

public class SobrecargaMetodo {

	int idade;
	String nome;
	
	public void cadastrarPessoa(int valor) {
		idade = valor;
		System.out.println("idade: " + idade);
		
	}
	public void cadastrarPessoa(String valor) {
		nome = valor;
		System.out.println("Nome: " + nome);
	}
	public void cadastrarPessoa(int valor1, String valor2) {
	
		idade = valor1;
		nome = valor2;	
		System.out.println("Nome: " + nome + "idade: " + idade);
		
	}
	public static void main(String[] args) {
		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(79);
		scm.cadastrarPessoa("Asdrúbal Medeiros");
		scm.cadastrarPessoa(42, "Jerferson Brandão");
	
		SobrecargaMetodo obj2 = new SobrecargaMetodo();
		obj2.cadastrarPessoa(25,"Maria");
		System.out.println("Nome do scm.nome");
		System.out.println("Nome do obj2:" + obj2 );
	}
	}
