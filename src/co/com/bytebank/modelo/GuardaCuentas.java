package co.com.bytebank.modelo;

public class GuardaCuentas {
	//crear un objeto guardar cuentas
	//permitir agregar cuentas con un metodo
	//guardar cuentas.adicional(cuenta);
	//obtener, remover, etc
	
	Cuenta[] cuenta = new Cuenta[10];
	int i=0;
	
	public void adicionar(Cuenta cc) {
		cuenta[i]=cc;
		i++;
	}
	public Cuenta obtener (int i) {
		return cuenta[i];
	}
}
