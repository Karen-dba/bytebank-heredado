package co.com.bytebank.test;

import co.com.bytebank.modelo.CuentaCorriente;

public class TestString {
	public static void main(String[] args) {
		String nombre = "Alura";
		//String nombre2 = new String("Alura");
		System.out.println(nombre);
		nombre=nombre.replace('A', 'a');
		nombre = nombre.concat(" cursos online ");
		nombre=nombre.toUpperCase();
		nombre=nombre.toLowerCase();
		char letra=nombre.charAt(3);
		int indice =nombre.indexOf("e");
		System.out.println(nombre);
		System.out.println(nombre+letra+indice);
	
		Object cc = new CuentaCorriente(22, 33);
        Object cp = new CuentaCorriente(33, 22);

        System.out.println(cc);
        System.out.println(cp);
		System.out.println();
	}
	
	
	public static void printLine(String valor) {
		System.out.println(valor);
	}
}
