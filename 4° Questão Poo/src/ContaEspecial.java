public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(Pessoafisica cliente) {
		super(cliente);
		this.limite = 500;
		this.numero += "S";
	}
	public ContaEspecial(Pessoajuridica cliente) {
		super(cliente);
		this.limite = 500;
		this.numero += "S";
	}
	public ContaEspecial(Pessoafisica cliente, double saldo) {
		this(cliente);
		this.saldo = saldo;
	}
	public ContaEspecial(Pessoajuridica cliente, double saldo) {
		this(cliente);
		this.saldo = saldo;
	}
	public void setLimite(double valor) {
		this.limite = valor;
	}
	public void setLimite(String valor) {
		double num = Double.parseDouble(valor);
		this.limite = num;
	}

	public double getLimite() {
		return this.limite;
	}
	public void debitar(double valor) {
		double saldoTotal = saldo + limite;
		if (valor <= saldoTotal) {
	    this.saldo = this.saldo - valor;
		}
	}
	public String toString() {
		return super.toString() + "Limite: " + this.limite + "Saldo Total: " + (this.limite + this.saldo);
	}
}