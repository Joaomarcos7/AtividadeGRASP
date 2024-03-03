package org.models;

public class Carro extends Veiculo{
    private double autonomia;
    private String motor;
    private String placa;

    public Carro(String identificacao, String motor, String placa, double autonomia, double valordecompra){
        super(identificacao,valordecompra);
        this.autonomia=autonomia;
        this.motor=motor;
        this.placa=placa;
    }

    @Override
    public double calculardiaria() {
        return  valordecompra * 0.02;
    }
}
