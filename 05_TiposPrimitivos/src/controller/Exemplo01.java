package controller;

public class Exemplo01 {

	public static void main(String[] args) {
		byte v1 = 127;
		System.out.println("v1: " + v1);
		
		short v2 = 32767;
		System.out.println("v2: " + v2);
		
		long v3 = 2147483648000000l;
		System.out.println("v3: " + v3);
		
		float v4 = 10000.5f;
		System.out.println("v4: " + v4);
		
		System.out.println("");
		
		boolean v5 = true;
		System.out.println("\nv5: " + v5);
		
		v5 = 5 > 3;
		System.out.println("v5: " + v5);
		
		if ( v5 ) {
			System.out.println("v5 é verdadeira");
		} else {
			System.out.println("v5 é falsa");
		}
		
	}

}
