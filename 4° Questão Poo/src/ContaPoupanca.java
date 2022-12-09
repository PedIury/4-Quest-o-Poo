public class ContaPoupanca extends Conta {
	private static double taxa = 0.1;

	public ContaPoupanca(double saldo) {
		creditar(saldo);
	}
	public ContaPoupanca(Pessoa cliente, double saldo) {
		this(saldo);
		setCliente(cliente);
	}
	public ContaPoupanca(Pessoafisica cliente, double saldo) {
		this(saldo);
		setCliente(cliente);
	}
	public ContaPoupanca(Pessoajuridica cliente, double saldo) {
		this(saldo);
		setCliente(cliente);
	}
	public void rendeJuros() {
		creditar(taxa * this.saldo);
	}
}
    

