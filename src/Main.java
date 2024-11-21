import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cliente pessoaFisica = new Cliente();
		pessoaFisica.setNome("Danilo");
		pessoaFisica.setPassword("admin123");
			
		Cliente pessoaFisica2 = new Cliente();
		pessoaFisica2.setNome("João");
		pessoaFisica2.setPassword("admin012");
			
		Conta cc = new ContaCorrente(pessoaFisica);
		Conta poupanca = new ContaPoupanca(pessoaFisica);
			
		Conta cc01 = new ContaCorrente(pessoaFisica2);
		Conta poup01 = new ContaPoupanca(pessoaFisica2);
			
			List<Conta> contas = new ArrayList<>();
			contas.add(cc);
			contas.add(poupanca);
			contas.add(cc01);
			contas.add(poup01);
			
			cc.depositar(6000);
			cc.transferir(1000, poupanca);
			cc01.depositar(6000);
			cc01.transferir(1000, poup01);
			
			cc01.transferir(5000, cc);
			
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
			
			Banco virtBank = new Banco();
			virtBank.setNome("virtBank");
			virtBank.setContas(contas);
			
			System.out.println(virtBank.getContas());
	}

}
