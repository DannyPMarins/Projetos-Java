package L501;

public class Q507 {
	
	/*
	 * 7) Desenvolver um programa que apresente todos os n�meros divis�veis por 4 que sejam menores que 200. Para
saber se o n�mero � divis�vel por 4 ser� necess�rio verificar a l�gica desta condi��o com o comando if. Sendo
divis�vel, mostre-o; n�o sendo, passe para o pr�ximo passo. A vari�vel que controla o contador deve ser iniciada
com valor 1.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int cont = 1;
		
		while (cont <= 200) {
			
			if (cont % 4 == 0) {
				System.out.println(cont);
			}
			
			cont ++;
		}
	}

}
