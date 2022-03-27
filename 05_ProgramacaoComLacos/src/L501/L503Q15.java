package L501;

import util.Teclado;

public class L503Q15 {
	
	/*
	 * 15)	Desenvolver um programa que pergunte o nome e o sal�rio bruto de 10 pessoas, 
	 *      e exiba nome, valor da al�quota do imposto de renda, e o sal�rio j� com o desconto 
	 *      realizado, sabendo-se que:
 
 		Sal�ria Bruto						 |	Al�quota	
        -------------------------------------|---------------------------
		Sal�rio menor que R$ 600,00	         |      Isento
		Sal�rio entre R$ 600,00 e R$ 1499,99 |  	10 % do sal�rio bruto
		Sal�rio a partir de R$ 1500,00	     |		15 % do sal�rio bruto

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		double salario, aliquota, liquido, valor;
		
		for( int cont = 1; cont <= 10; cont++) {
			nome = Teclado.lerTexto("Informe o seu nome: ");
			salario = Teclado.lerDouble("Informe o seu sal�rio: ");
			
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
