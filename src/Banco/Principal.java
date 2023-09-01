/* eu fiz tudo que pediu (menos os opcionais, pq não entendi direito), POO é muito fácil depois que vc entende */

package Banco;

class Principal {

    public static void main(String[] args) {
    	
    	Conta conta1 = new Conta();
    	
    	conta1.setNomeTitular("Felipe Eduardo");
    	conta1.setSaldo(100.00);
    	conta1.setAgencia("Santo André");
    	conta1.setNumero(3599173);
    	conta1.data.setData(27, 03, 2007);
    	conta1.cadastroPF.setCPF("11111111111");
    	conta1.deposito(100.00);
    	conta1.saque(100.00);
    	
    	Conta conta2 = new Conta();
    	
    	conta2.setNomeTitular("Rayssa Nunes");
    	conta2.setSaldo(300.00);
    	conta2.setAgencia("ItaL");
    	conta2.setNumero(3599267);
    	conta2.data.setData(14, 03, 2005);
    	conta2.cadastroPF.setCPF("222222222222");
    	conta2.deposito(100.00);
    	conta2.saque(100.00);
    	
    	
        if (conta1 == conta2) {
            System.out.println("Ao analisar conta C1 e C2: IGUAIS!\n");
        } else {
            System.out.println("Ao analisar conta C1 e C2: DIFERENTES!\n");
        }

        System.out.println(conta1.recuperarDadosParaImpressão());
        System.out.println("\n" + conta2.recuperarDadosParaImpressão());
    }
}