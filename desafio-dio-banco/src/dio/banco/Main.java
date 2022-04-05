package dio.banco;

public class Main {
	
	public static void main(String[] args) {
		Cliente Fabio = new Cliente();
		Fabio.setNome("Fábio");
		
		Conta cc = new ContaCorrente(Fabio);
		Conta cp = new ContaPoupanca(Fabio);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
