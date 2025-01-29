package Intermediario.Desafio03;

public interface Conta {
    void consultarSaldo();
    double depositar(double valor);
    double transferencia(double valor, ContaBancaria destino);
}
