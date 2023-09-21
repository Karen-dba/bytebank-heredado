package co.com.bytebank.modelo;

public class GuardaReferencias {
	//crear un objeto guardar cuentas
	//permitir agregar cuentas con un metodo
	//guardar cuentas.adicional(cuenta);
	//obtener, remover, etc
	
	Object[] referencia = new Object[10];
	int i=0;
	
	public void adicionar(Cuenta cc) {
		referencia[i]=cc;
		i++;
	}
	public Object obtener (int i) {
		return referencia[i];
	}
}
