package Intermediario.Desafio03;

public abstract class ContaBancaria implements Conta {
    //Atributos
    double saldo;
    TipoConta tipoConta;


    //Metodos
    public abstract double depositar(double valor);
    public abstract double transferencia(double valor, ContaBancaria destino);
    public abstract void consultarSaldo();

    //Construtores
    public ContaBancaria() {
    };

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    };

    //TODO: sobrecarga dos construtores
    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    };
}

