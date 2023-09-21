package co.com.bytebank.test;

import java.util.ArrayList;  // estudiar mas
import java.util.LinkedList; //estudiar mas
import java.util.List;

import co.com.bytebank.modelo.Cuenta;
import co.com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	public static void main(String[] args) {
		
		//List<Cliente> listaClientes = new LinkedList<>();
		
		// <> fuerza al array a que solo reciba un tipo de objetos
		//obligatorio       no obligatorio       
		List<Cuenta> lista = new ArrayList<>();
		//referencia     Objetp -> HEAP
		Cuenta cc= new CuentaCorriente(11, 22);
		Cuenta cc2= new CuentaCorriente(13, 42);
		Cuenta cc3= new CuentaCorriente(13, 42);
		
		lista.add(cc);
		lista.add(cc2);
		
		Cuenta obtenerCuenta =lista.get(0);
		System.out.println(obtenerCuenta);
		System.out.println("---------------");
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("---------------");
		//por cada cuenta : list
		for(Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		System.out.println("---------------");
		boolean contiene = lista.contains(cc);
		
		//por referencias
		if (lista.contains(cc3)){
			System.out.println("si es igual (equals)");
		}
		else {
			System.out.println("no");
		}
		//System.out.println("---------------");
		
		//por valores
		
		/*if(cc2.esIgual(cc3)) {
			System.out.println("Si son iguales");
		}*/
		
		
	}
}
