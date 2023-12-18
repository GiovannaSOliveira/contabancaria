package conta.model;

public class ContaPoupanca extends Conta{

	private int aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	
	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nAniversário da conta: " + this.aniversario);
	}
	
}
