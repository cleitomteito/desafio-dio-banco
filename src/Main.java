
public class Main {

	public static void main(String[] args) {
		Cliente cleitom = new Cliente();
		cleitom.setNome("Cleitom");
		
		Conta cc = new ContaCorrente(cleitom);
		Conta poupanca = new ContaPoupanca(cleitom);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
