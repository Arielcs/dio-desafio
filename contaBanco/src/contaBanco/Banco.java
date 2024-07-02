package contaBanco;

import java.util.Random;
import java.util.Scanner;

public class Banco {
	private int nrConta;
	private int nrAgencia;
	private String nmCliente;
	private double saldo;
	
	public int getNrConta() {
		return nrConta;
	}
	
	public void setNrConta(int nrConta) {
		this.nrConta = nrConta;
	}
	
	public int getNrAgencia() {
		return nrAgencia;
	}
	
	public void setNrAgencia(int nrAgencia) {
		this.nrAgencia = nrAgencia;
	}
	
	public String getNmCliente() {
		return nmCliente;
	}
	
	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void criarConta() {
		Random r = new Random( System.currentTimeMillis() );
		setNrConta( 10000 + r.nextInt(20000));
		System.out.println("Conta Criada.");
	}

	public void criarAgencia() {
		Random r = new Random( System.currentTimeMillis() );
		setNrAgencia( 1000 + r.nextInt(2000));
		System.out.println("Agencia Criada.");
	}

	public void criarNmCliente() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite seu nome.");
			setNmCliente(scanner.nextLine());
		}
	}	

	public void criarSaldo() {
		Random random = new Random();
        float valorAleatorio = 100 + random.nextFloat() * (10000000 - 100);
        setSaldo(valorAleatorio);
	}	
}
