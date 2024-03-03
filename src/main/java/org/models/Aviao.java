package org.models;

public class Aviao extends Veiculo{
    private double velocidadecruzeiro;
    private int tempodevoo;

    public Aviao(String identificacao,double velocidadecruzeiro,int tempodevoo, double valordecompra){
        super(identificacao,valordecompra);
        this.velocidadecruzeiro=velocidadecruzeiro;
        this.tempodevoo=tempodevoo;
    }

    @Override
    public double calculardiaria() {
        return (valordecompra *0.20) + (1000 *velocidadecruzeiro);
    }
}
