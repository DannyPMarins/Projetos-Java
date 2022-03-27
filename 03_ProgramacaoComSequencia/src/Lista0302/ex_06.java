package Lista0302;

import util.Teclado;

public class ex_06 {
	
	/*
	 * 6)Fazer um algoritmo que pergunte o nome de um vendedor, 
	 *   o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
	 *   Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
	 *   exibir ao final o seu nome, o salário fixo,
	 *   a comissão e o salário completo (fixo + comissão sobre vendas) no final do mês.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		double salario, vendas, comissao, total;
		
		nome = Teclado.lerTexto("Qual é o seu nome? ");
		salario = Teclado.lerDouble("Qual é o seu salario fixo? ");
		vendas = Teclado.lerDouble("Qual é o total de vendas efetuadas no mês em R$? ");
		
		comissao = vendas * 0.15;
		total = comissao + salario;
		
		System.out.println("Seu nome é: " + nome + " seu salario fixo é " + salario + " a comissao mais o salario completo é " + total);

	}

}
