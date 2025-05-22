package dia_1;

public class ContaBancaria {

	/*2. Cria	uma	classe	para	 representar	uma	 conta	corrente	que	possui:
	 * 
		- número.
		- saldo	.
		- status	que	informa	se 	ela	é	especial	ou	não.
		- limite.  
		
		- Desenvolva	métodos	para	 realizar	saque	(verificando	se	 o	cliente	
pode	realizar	saques).
		- despositar	dinheiro.
		- consultar	saldo.
		- verificar	se	 o	
cliente	está	usando	cheque	especial	ou	não.	

Desenvolva	um	programa	para	 testar	essa	classe.*/
	
	int numeroConta;
	double saldoConta;
	boolean contaEspecial;
	double limiteCredito;
	
	public void FazerSaque(double valorSaque) {
		// Metodo para realizar saques da conta bancaria fazendo as verificações necessarias.
		try {
		if ( this.saldoConta < 0) {
			throw new IllegalArgumentException("O saldo da Conta Está abaixo de zero."); 
		}
		
		if (this.saldoConta < valorSaque) {
			throw new IllegalArgumentException("O saldo é menor que o valor do saque."); 
		}
		
		this.atualizarSaldo(this.saldoConta - valorSaque);
		
		}catch (NumberFormatException e){
			throw new IllegalArgumentException("O vaor inserido deve ser um numero.");
		}
	}
	
	public void depositarDinheiro(double valorDeposito) {
		//metodo para realizar um deposito na conta do cliente.
		try {
			if (valorDeposito <= 0) {
				throw new IllegalArgumentException("O valor do deposito deve ser positivo." );
			}
			
			this.atualizarSaldo(this.saldoConta + valorDeposito);
			
		}catch (NumberFormatException e){ 
			throw new IllegalArgumentException("O valor do deposito é invalido.");
			}
	}
	public double consultarSaldo() {
		//metodo retorna o saldo atual da conta.
		return this.saldoConta;
	}
	
	public double verificarChequeEspecial() {
		// Metodo para verificar o limite do cheque especial do cliente.
		if (this.limiteCredito <= 0) {
			throw new IllegalStateException("A conta não tem limite de credito disponivel");
		}
		
		return this.limiteCredito;
	}
	
	public void atualizarSaldo(double newSaldo) {
		// metodo que atualiza o saldo do cliente.
		try {
				if (newSaldo <= 0) {
					throw new IllegalArgumentException("O valor informado tem que ser positivo");
				}
				
				this.saldoConta = newSaldo;
				
		}catch (NumberFormatException e){
				throw new IllegalArgumentException("O novo saldo informado é invalido:  \n"+ e);
		}
	}
	
	
	
}
