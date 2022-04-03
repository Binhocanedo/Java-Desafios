package dio.banco;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfoComuns() {
		
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("CPF: %s", this.cliente.getcpf()));
		System.out.println(String.format("Ag�ncia: %d", this.agencia));
		System.out.println(String.format("N�mero: %d", this.conta));
		System.out.println(String.format("Saldo: %d", this.saldo));
		
	}
	

	
	
}
