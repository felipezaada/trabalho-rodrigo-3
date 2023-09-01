package Banco;

class Data {

	private int dia;
	private int mes;
	private int ano;

	public void setData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String recuperarData() {
		String dataFormatada;
		dataFormatada = "Data: " + dia + "/" + mes + "/" + ano;
		return dataFormatada;
	}

	public boolean dataConfirmada() {
		if (this.ano > 0) {
			switch (this.mes) {
			case 2:
				if (this.ano % 4 == 0 && this.dia > 0 && this.dia < 30 || this.ano % 4 > 0 && this.dia > 0 && this.dia < 29) {
					return true;
				} else {
					return false;
				}
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (this.dia > 0 && this.dia < 32) {
					return true;
				} else {
					return false;
				}
			case 4:
			case 6:
			case 9:
			case 11:
				if (this.dia > 0 && this.dia < 31) {
					return true;
				} else {
					return false;
				}
			default:
				return false;
			}
		} else {
			return false;
		}
	}
}