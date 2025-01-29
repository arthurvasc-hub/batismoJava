package Intermediario.Desafio03;

public class Main {
    public static void main(String[] args) {

        //Conta corrente
        ContaCorrente contaCC = new ContaCorrente(500, TipoConta.CORRENTE);

        //Conta poupança
        ContaPoupanca contaPP = new ContaPoupanca(0, TipoConta.POUPANCA);

        //Metodo para consultar saldo.
        contaCC.consultarSaldo();
        contaPP.consultarSaldo();

        //Metodo para depositar e mostrando novos valores
        contaCC.depositar(500);
        contaCC.consultarSaldo();

        contaPP.depositar(500);
        contaPP.consultarSaldo();


        //Metodo para transferencia entre contas
        contaCC.transferencia(200, contaPP);
        contaCC.consultarSaldo();
        contaPP.consultarSaldo();

    }

}
