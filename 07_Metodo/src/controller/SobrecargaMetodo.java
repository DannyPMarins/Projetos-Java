package controller;

public class SobrecargaMetodo {
	// Variavel Global
	int idade;
	String nome;

	public static void main(String[] args) {
		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(58);
		scm.cadastrarPessoa("Jorge Nogueira");
		scm.cadastrarPessoa(35, "Fabrício Curvello");		

	}// fim metodo main
	
	public void cadastrarPessoa (int valor){
		idade = valor;
		System.out.println("Idade: "+idade);
		}
		public void cadastrarPessoa (String valor){
		nome = valor;
		System.out.println("Nome: "+ nome);
		}
		public void cadastrarPessoa (int valor1, String valor2){
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: "+ idade + " – Nome: "+ nome);
		}

}// fim da classe
