/**
 * A classe ContaCorrente representa uma conta corrente em um banco.
 * Esta classe é uma subclasse de Conta e implementa o método imprimirExtrato
 * específico para contas correntes.
 */
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
