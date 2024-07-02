package contaBanco;

public class Main {
	public static void main(String[] args) {
		Banco novaConta = new Banco();
		System.out.println("Sua conta está sendo gerada.");
		novaConta.criarAgencia();
		novaConta.criarConta();
		novaConta.criarNmCliente();
		novaConta.criarSaldo();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. "
				+ "Sua agência é %d, sua conta %d e seu saldo de R$%.2f já está disponível para saque.", 
				novaConta.getNmCliente(),
				novaConta.getNrAgencia(),
				novaConta.getNrConta(),
				novaConta.getSaldo());
	}
}
