package org.models;

public class Moto extends Veiculo {
    private String motor;
    private String placa;
    private partida partida;

    public Moto(String identificacao, double valordecompra,String motor, String placa, partida partida){
        super(identificacao,valordecompra);
        this.motor=motor;
        this.placa=placa;
        this.partida=partida;
    }

    @Override
    public double calculardiaria() {
        if(partida.equals(org.models.partida.ELETRICO)){
            return (valordecompra * 0.02) + 20;
        }
        else{
            return (valordecompra * 0.02) + 5;
        }
    }
}
