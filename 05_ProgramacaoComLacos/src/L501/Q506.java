package L501;

import util.Teclado;

public class Q506 {
	
	/*
	 * 6) Desenvolver um programa que leia um número n qualquer menor ou igual a 50 e apresente o valor obtido da
multiplicação sucessiva de n por 3 enquanto o produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, cont;
		
		n = Teclado.lerInt("Informe um numero menor ou igual a 50: ");
		cont = n;
		
		if (n < 50) {
			
						
			while (cont < 250) {
				System.out.println(cont);
				
				cont = cont * 3;
			}
			
		}else {
			System.out.println("ERRO! O valor encerido é maior que 50 ");
		}
		
		System.out.println("Valor de cont: "+ cont);
	}

}
