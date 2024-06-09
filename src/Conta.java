/**
* A classe abstrata Conta representa uma conta bancária genérica.
* Implementa a interface IConta, permitindo operações básicas como 
* sacar, depositar e transferir valores.
*/
public abstract class Conta implements IConta {
	
	/**
    * Constante que representa a agência padrão.
    */
	private static final int AGENCIA_PADRAO = 1;

    /**
    * Variável estática utilizada para gerar números de conta sequenciais.
    */
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double saldoPoupanca;
	protected Cliente cliente;


	/**
    * Construtor da classe Conta. Inicializa a agência com o valor padrão e o número
    * da conta de forma sequencial. Associa a conta a um cliente.
    *
    * @param cliente O cliente associado à conta.
    */
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
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

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		this.saldoPoupanca += valor;
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	
	

	protected void imprimirInfosComuns() {
		System.out.println("=== Extrato Conta Corrente ===");
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Saldo Poupança: %.2f", this.saldoPoupanca));
	}
}
