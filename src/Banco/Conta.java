package Banco;

class Conta {
	
	Data data = new Data();
	CadastroPF cadastroPF = new CadastroPF();
	
	private String nomeTitular;
    private String agencia;
    private double saldo;
    private int numero;
	private static int identificador = 0;
    
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public static void setIdentificador(int identificador) {
		Conta.identificador = identificador;
	}
	
	public String recuperarDadosParaImpressão() {
	    String dadosImpressão = "Nome: " + getNomeTitular() + 
	    		"\nCPF: " + cadastroPF.getCPF() +
	    		"\nAgência: " + getAgencia() +
	    		"\nSaldo: R$" + getSaldo() +
	    		"\nNúmero (celular): " + getNumero() +
	    		"\nRendimento: R$" + calcularRendimento() +
	    		"\nData de abertura: " + data.recuperarData() +
	    		"\nData Válida?: " + data.dataConfirmada() +
				"\nCPF Válido? " + cadastroPF.verificaCPF() +
	    		"\nIdentificador: " + (identificador += 1);
		return dadosImpressão;
    }

    public Double calcularRendimento() {
        double rendimento;
        rendimento = saldo * 0.1;
        return rendimento;
    }

    public boolean saque(double valor) {
        if (valor <= saldo && valor > 0) {
        	this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposito(double valor) {
        if (valor > 0.0) {
        	this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }
    }
}