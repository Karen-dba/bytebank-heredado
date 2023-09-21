package co.com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		for (int i=0; i<args.length; i++) {
			System.out.print(" "+args[i]);
		}
		
		int edad = 20;
		int edad2 = 25;
		int edad3= 27;
		//Quiero agruparlas en una sola referencia
		// indice:      0   1    2   3   4
		//            [ 0 | 0 | 30 | 0 | 0 ]
		int[] edades = new int[5];
		edades[2]=30;
		
		System.out.println(edades[2]);
		System.out.println(edades[0]);
		//System.out.println(edades[5]);
		
		int tamanoArray = edades.length;
		System.out.println(tamanoArray);
		
		for (int i=0; i<tamanoArray; i++) {
			System.out.print(" "+edades[i]);
		}
		
	}
}
