package co.com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable {
	private String clave;
	
	//sobre-escritura del metodo (tiene el mismo nombre que otro metodo)
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		//	return this.getSalario();   ver explicacion en evernote
		return super.getSalario()+this.getSalario()*0.05;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
	}
