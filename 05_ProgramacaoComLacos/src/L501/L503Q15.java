package L501;

import util.Teclado;

public class L503Q15 {
	
	/*
	 * 15)	Desenvolver um programa que pergunte o nome e o salário bruto de 10 pessoas, 
	 *      e exiba nome, valor da alíquota do imposto de renda, e o salário já com o desconto 
	 *      realizado, sabendo-se que:
 
 		Salária Bruto						 |	Alíquota	
        -------------------------------------|---------------------------
		Salário menor que R$ 600,00	         |      Isento
		Salário entre R$ 600,00 e R$ 1499,99 |  	10 % do salário bruto
		Salário a partir de R$ 1500,00	     |		15 % do salário bruto

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		double salario, aliquota, liquido, valor;
		
		for( int cont = 1; cont <= 10; cont++) {
			nome = Teclado.lerTexto("Informe o seu nome: ");
			salario = Teclado.lerDouble("Informe o seu salário: ");
			
			if (salario < 600) {
				System.out.println("Nome: " + nome + " | Aliquota: Isento");
			}else if(salario > 600){
				aliquota = 0.10;
				valor = salario * aliquota;
				liquido = salario - valor;
				System.out.println("Nome: " + nome + " | Aliquota: " + valor + " Salario Liquido: " + liquido);
			}else if(salario > 1500){
				aliquota = 0.15;
				valor = salario * aliquota;
				liquido = salario - valor;
				System.out.println("Nome: " + nome + " | Aliquota: " + valor + " Salario Liquido: " + liquido);
				
			}
		}

	}

}
