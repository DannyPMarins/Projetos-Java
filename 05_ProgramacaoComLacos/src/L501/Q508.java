package L501;

public class Q508 {
	
	/*
	 * 8) Desenvolver um programa que apresente todos os valores num�ricos inteiros �mpares situados na faixa de 0 a
20. Para saber se o n�mero � �mpar, ser� necess�rio verificar essa condi��o com o comando if. Sendo �mpar,
mostre-o; n�o sendo, passe para o pr�ximo passo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 1;
		
		
		while (cont <= 20) {
			
			if (cont % 2 == 1) {
				System.out.println(cont);
	
			}
			cont ++;
		}
		
	}

}
