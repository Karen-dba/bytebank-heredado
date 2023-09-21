package co.com.bytebank.test;

import co.com.bytebank.modelo.Funcionario;
import co.com.bytebank.modelo.Gerente;

public class TestReferencias {
	public static void main(String[] args) {
		
		//Elemento mas generico (funcionario) puede ser adaptado
		//al elemento mas especifico(gerente)
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("ggg");
		
	}
}
