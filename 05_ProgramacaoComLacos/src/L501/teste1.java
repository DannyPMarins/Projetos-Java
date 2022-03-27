package L501;

import util.Teclado;

public class teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor, desconto;
		
		valor = Teclado.lerDouble("Informe o valor da tabela de produtos:");
		desconto = Teclado.lerDouble("Informe o percentual de desconto:");
		
		System.out.println("O valor do produto com desconto é " + valor - (valor * desconto / 100));
	}

}
