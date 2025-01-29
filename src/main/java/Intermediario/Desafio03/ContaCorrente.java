package Intermediario.Desafio03;

public class ContaCorrente extends ContaBancaria {

    //Metodos
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo disponivel na sua Conta Corrente: " + saldo);
        System.out.println("-------------------------------------------------");
    };

    @Override
    public double depositar(double valor) {
        double valorReduzido = valor * 0.99;
        saldo += valorReduzido;
        return saldo;
    };

    @Override
    public double transferencia(double valor, ContaBancaria destino) {
        if(valor > saldo){
            System.out.println("Saldo Insuficiente");
        }
        if(valor <= saldo){
            destino.depositar(valor);
            saldo -= valor;
            System.out.println("Saldo atualizado com sucesso");
        }
        return saldo;
    };

    //Construtores
    public ContaCorrente() {
    };

    public ContaCorrente(double saldo) {
        super(saldo);
    };

    //TODO: sobrecarga do construtor
    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    };
}
