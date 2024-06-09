import java.util.ArrayList;
import java.util.List;

/**
 * A classe Main contém o método principal que demonstra a criação e manipulação de 
 * contas bancárias para diferentes clientes, assim como a transferência de valores
 * entre contas correntes e contas poupança.
 */
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		List<Conta> contas = new ArrayList();
		
		Cliente joao = new Cliente();
		joao.setNome("João");
		
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		Cliente jose = new Cliente();
		jose.setNome("José");
		
		Conta ccJoao = new ContaCorrente(joao);
		Conta ccMaria = new ContaCorrente(maria);
		Conta ccJose = new ContaCorrente(jose);

		Conta poupancaJoao = new ContaPoupanca(joao);
		Conta poupancaMaria = new ContaPoupanca(maria);
		Conta poupancaJose = new ContaPoupanca(jose);

		ccJoao.depositar(100);
		ccJoao.transferir(50, poupancaJoao);
		
		ccMaria.depositar(200);
		ccMaria.transferir(60, poupancaMaria);
		
		ccJose.depositar(300);
		ccJose.transferir(70, poupancaJose);
				
		contas.add(ccJoao);
		contas.add(ccJose);
		contas.add(ccMaria);
		
		banco.setContas(contas);
		
		// Imprime as informações comuns de cada conta e o saldo da poupança
		for (Conta conta : contas) {
		 	conta.imprimirInfosComuns();
		 	conta.getSaldoPoupanca();
		}
		
		
	}

}
