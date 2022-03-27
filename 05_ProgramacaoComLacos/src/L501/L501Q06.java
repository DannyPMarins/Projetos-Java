package L501;

import util.Teclado;

public class L501Q06 {
	
/*
 * 6) Desenvolver um programa que leia um número n qualquer menor ou igual a 50
 *    e apresente o valor obtido da multiplicação sucessiva de n por 3 enquanto o
 *    produto for menor que 250.(n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		n = Teclado.lerInt("Digite um nvmero menor ou igual a 50:");
		
		if(n < 50) {
			
			while(n < 250) {
				System.out.println(n);
				n = n * 3;
			} 
		  }else {
				System.out.println("ERRO! favor informe um nimero menor ou igual a 50");
		}		
	}
}
