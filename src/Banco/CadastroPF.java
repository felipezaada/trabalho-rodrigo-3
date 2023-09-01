package Banco;

import java.util.InputMismatchException;

public class CadastroPF {
	
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cadastroPF) {
			CPF = cadastroPF;
	}

	public boolean verificaCPF(){
        boolean verificadorCPF = CPF.equals("00000000000") ||
        CPF.equals("11111111111") || CPF.equals("22222222222") || 
        CPF.equals("33333333333") || CPF.equals("44444444444") || 
        CPF.equals("55555555555") || CPF.equals("66666666666") || 
        CPF.equals("77777777777") || CPF.equals("88888888888") || 
        CPF.equals("99999999999") || (CPF.length() != 11);
        
        if (verificadorCPF==true)
            return(false);

        char dig10, dig11;
        int peso, num, soma, radical;
        try{
            soma=0;
            peso=10;
            for (int i = 0; i < 9; i++) {
                num = (int)(CPF.charAt(i) - 48);
                soma+=(peso*num);
                peso--;
            }
            radical = 11-(soma%11);
            if (radical==10){
                 dig10 = '0';
            } else {
                dig10 = (char)(radical + 48);}


            soma = 0;
            peso = 11;
            for (int i = 0; i < 10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                soma+=(peso*num);
                peso--;
            }
            radical = 11-(soma%11);
            if (radical==10){
                 dig11 = '0';
            } else {
                dig11 = (char)(radical + 48);}
            

            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))){
                return(true);

            } else{ 
                return(false);}

        } catch (InputMismatchException erro) {
                return(false);
        }
	}
}