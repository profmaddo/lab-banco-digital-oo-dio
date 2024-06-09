/**
 * A interface IConta define os métodos básicos para operações em uma conta bancária.
 */
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
