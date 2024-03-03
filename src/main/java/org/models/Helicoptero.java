package org.models;

public class Helicoptero extends Veiculo {

    private int quantidaderotores;
    private double tempo;

    public Helicoptero(int quantidaderotores,String identificacao,double valordecompra,double tempo){
        super(identificacao, valordecompra);
        this.tempo=tempo;
        this.quantidaderotores=quantidaderotores;
    }
    @Override
    public double calculardiaria() {
        return (valordecompra * 0.10) * quantidaderotores;
    }
}
