package Lista0302;

import util.Teclado;

public class ex_06 {
	
	/*
	 * 6)Fazer um algoritmo que pergunte o nome de um vendedor, 
	 *   o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro).
	 *   Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, 
	 *   exibir ao final o seu nome, o sal�rio fixo,
	 *   a comiss�o e o sal�rio completo (fixo + comiss�o sobre vendas) no final do m�s.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		double salario, vendas, comissao, total;
		
		nome = Teclado.lerTexto("Qual � o seu nome? ");
		salario = Teclado.lerDouble("Qual � o seu salario fixo? ");
		vendas = Teclado.lerDouble("Qual � o total de vendas efetuadas no m�s em R$? ");
		
		comissao = vendas * 0.15;
		total = comissao + salario;
		
		System.out.println("Seu nome �: " + nome + " seu salario fixo � " + salario + " a comissao mais o salario completo � " + total);

	}

}
