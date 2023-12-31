package co.com.bytebank.modelo;

public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	public Funcionario(){
		
	}
	
	
	//getters & setters de los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	//getters & setters adicionales
	//como es abstracta no debe tener cuerpo
	public abstract double getBonificacion();	
	
}
