package org.models;

public class Onibus extends Veiculo{
    private String motor;
    private String placa;
    private int quantidadepassageiros;

    public Onibus(String identificacao, double valordecompra, String motor, String placa, int quantidadepassageiros){
        super(identificacao,valordecompra);
        this.motor=motor;
        this.placa=placa;
        this.quantidadepassageiros=quantidadepassageiros;
    }

    @Override
    public double calculardiaria() {
        return (valordecompra * 0.04 )+ (100 *quantidadepassageiros);
    }
}
