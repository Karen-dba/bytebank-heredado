package co.com.bytebank.modelo;

/**
 * 
 * Cuenta va a crear nuevas instancias de cuentaCorriente
 * 
 * @version 1.0
 * @author baldo
 */

//entidad cuenta
public abstract class Cuenta implements Comparable<Cuenta>{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total=0;
	
	/**
	 * Instancia una nueva cuenta sin parametros
	 */
	public Cuenta(){}
	
	/**
	 * Instancia una cuenta usando agencia y numero
	 * @param agencia
	 * @param numero
	 */
	
	public Cuenta(int agencia, int numero) {
		this.agencia=agencia;
		this.numero=numero;
		System.out.println("Estoy creando una cuenta nueva" + numero);
		
		Cuenta.total ++;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Cuenta.total;
	}
	
	//no retorna valor
	public abstract void depositar(double valor);
	
	/**
	 * Este metodo retira dinero de la cuenta y si ocurre
	 * un error devuelve una excepcion
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	//retorna valoor
	public void retirar(double valor) {
		if (this.saldo<valor) {
			throw new SaldoInsuficienteException("No tienes saldo: "+"Saldo: " + this.saldo + ", Valor: " + valor);
		}
			this.saldo-=valor;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo>=valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String cuenta= "Numero: "+this.numero+", Agencia: "+this.agencia+ (", Titular: "+ this.titular.getNombre());
		return cuenta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
        return this.saldo;
    }
	
	public void setAgencia (int agencia) {
		if (agencia>0) {
			this.agencia=agencia;
		}
		else {
			System.out.println("no se permiten numeros negativos");
		}
	}
	
	/*public boolean esIgual(Cuenta cuenta) {
		return this.agencia == cuenta.getAgencia() && 
				this.numero==cuenta.getNumero();
	}*/
	
	@Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta)obj;
		return this.agencia == cuenta.getAgencia() && 
				this.numero==cuenta.getNumero();
	}
	
	@Override
	public int compareTo(Cuenta o) {
		// Orden natural: numero agencia
		//return Integer.compare(this.agencia, o.getAgencia());
		//Orden natural: saldo
		return Double.compare(this.getSaldo(), o.getSaldo());
		
	}
}
