
public class Main {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.depositar(100);
		
		contaCorrente.transferir(100, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		
		

	}

}
