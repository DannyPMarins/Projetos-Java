package controller;

public class ChamadaMetodo{
public static void main(String[] args) {
	
	System.out.println("Iniciando programa");
	primeiro();
	System.out.println("Continuando programando ");
	terceiro();
	System.out.println("Finalizando programa");
}

public static void primeiro() {
	System.out.println("Iniciando metodo 1");
	segundo();
	System.out.println("Terminando metodo 1");
}
public static void segundo() {
	System.out.println("Iniciando o metodo 2");
	System.out.println("Terminando o metodo 2");
	
}
public static void terceiro() {
	System.out.println("Iniciando o metodo 3");
	System.out.println("Terminando o metodo 3");
}
}
