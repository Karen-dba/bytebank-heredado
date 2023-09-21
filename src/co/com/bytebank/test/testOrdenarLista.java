package co.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import co.com.bytebank.modelo.Cliente;
import co.com.bytebank.modelo.Cuenta;
import co.com.bytebank.modelo.CuentaAhorros;
import co.com.bytebank.modelo.CuentaCorriente;

public class testOrdenarLista {
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(62, 33);
	    Cliente clienteCC1 = new Cliente();
	    clienteCC1.setNombre("Diego");
	    cc1.setTitular(clienteCC1);
	    cc1.depositar(333.0);

	    Cuenta cc2 = new CuentaAhorros(32, 44);
	    Cliente clienteCC2 = new Cliente();
	    clienteCC2.setNombre("Renato");
	    cc2.setTitular(clienteCC2);
	    cc2.depositar(444.0);

	    Cuenta cc3 = new CuentaCorriente(22, 11);
	    Cliente clienteCC3 = new Cliente();
	    clienteCC3.setNombre("Liam");
	    cc3.setTitular(clienteCC3);
	    cc3.depositar(111.0);

	    Cuenta cc4 = new CuentaAhorros(2, 22);
	    Cliente clienteCC4 = new Cliente();
	    clienteCC4.setNombre("Noel");
	    cc4.setTitular(clienteCC4);
	    cc4.depositar(222.0);
	    
	    List<Cuenta>  lista = new ArrayList<>();
	    lista.add(cc1);
	    lista.add(cc2);
	    lista.add(cc3);
	    lista.add(cc4);
		
	    System.out.println("");
	    System.out.println("Antes de ordenar");
	    for (Cuenta cuenta : lista) {
	    	System.out.println(cuenta);
	    }
		
		//ordenar cuentas
		//         cualquier clase hija de cuenta
		//Comparator <? extend Cuenta> c
	    
	    
	    //forma actual, desde java 8 
	    //Comparator<Cuenta> comparator = new ordenarPorNumeroCuenta(); //implementacion de la interfaz
		//lista.sort(comparator);
	    
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
			
		});
	    
		System.out.println("");
		System.out.println("Despues de ordenar");
		   for (Cuenta cuenta : lista) {
		   	System.out.println(cuenta);
		   }
		//ordenar al reves (toma en cuenta el ultimo orden dado)   
		Collections.reverse(lista);
		    
		System.out.println("");
		System.out.println("Despues de ordenar al reves");
			for (Cuenta cuenta : lista) {
				System.out.println(cuenta);
		    }
		
		/*Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();  
		lista.sort(comparatorNombreTitular);
		
		System.out.println("");
		System.out.println("Despues de ordenar por nombre titular");
	    for (Cuenta cuenta : lista) {
	    	System.out.println(cuenta);
	    }*/
	    //forma antigua de ordenar
	    //Collections.sort(lista, new OrdenadorPorNombreTitular());
	    
		//Ordenar con clase anonima, lo mismo de arriba sin necesidad de
		//	crear las clases de abajo
		Collections.sort(lista, new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().
						compareTo(o2.getTitular().getNombre());
			}
			
		});
			
			
	    System.out.println("");
		System.out.println("Despues de ordenar por nombre titular");
	    for (Cuenta cuenta : lista) {
	    	System.out.println(cuenta);
	    }
	    
	    Collections.sort(lista);
	    System.out.println("");
		System.out.println("Despues de ordenar por orden natural");
	    for (Cuenta cuenta : lista) {
	    	System.out.println(cuenta);
	    }
	    
	    Collections.reverse(lista);
	    
		System.out.println("");
		System.out.println("Despues de ordenar al reves");
			for (Cuenta cuenta : lista) {
				System.out.println(cuenta);
			}
		//orden randomicamentd	
		Collections.shuffle(lista);
		    
		System.out.println("");
		System.out.println("Despues de ordenar randomicamentme");
			for (Cuenta cuenta : lista) {
				System.out.println(cuenta);
			}
		
		//orden rotatorio con especificacion de cuantos lugares debe rotar
		Collections.rotate(lista,3);
		    
		System.out.println("");
		System.out.println("Despues de rotar la anterior lista 4 lugares");
			for (Cuenta cuenta : lista) {
				System.out.println(cuenta);
			}
	}
}


//estas clases no son objetos, ya que no se pueden instanciar, no tienen ningun atributo
class ordenarPorNumeroCuenta implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		/* forma basica
		 if (o1.getNumero()==o2.getNumero()) {
			return 0;
		}else if(o1.getNumero() > o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}*/
		
		//forma intermedia
		//return o1.getNumero() - o2.getNumero();
		
		// forma wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
		}
	
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre()
				.compareTo(o2.getTitular().getNombre());
	}
	
}