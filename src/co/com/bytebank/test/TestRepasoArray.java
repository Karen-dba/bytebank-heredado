package co.com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	public static void main(String[] args) {
		int[] numeros = new int [10];
		
		int numero = 40;
		
		//WRAPPER
		//Integer numeroObjeto = new Integer(40);  <- DEPECATED
		Integer numeroObjeto= Integer.valueOf(40);
		
		List<Integer> lista = new ArrayList<Integer>();
		
		//primitivo != Object
		lista.add(numero);
		//lista.add(new Integer(40)); autoboxing es como lo mismo de arriba y la razon por laque no falla
		lista.add(Integer.valueOf(40));
		lista.add(numeroObjeto);
		
		
		//unboxing
		//int valorPrimitivo = numeroObjeto;
		int valorPrimitivo = numeroObjeto.intValue();
		
		numeroObjeto.byteValue();
		numeroObjeto.doubleValue();
		numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
	}
}
