package org.example;

import org.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
        Manager sistema= new Manager();
        sistema.addVeiculo(new Aviao("AV01", 10, 3.5,500000));
        sistema.addVeiculo(new Carro("CAR-01", "XE500","ZBQ4567",15.5,100000));
            sistema.addVeiculo(new Carro("CAR-02", "XE500","ZBQ4567",15.5,100000));
            sistema.addVeiculo(new Carro("CAR-03", "XE500","ZBQ4567",15.5,100000));
        sistema.addVeiculo(new Helicoptero(4, "HEL01", 400000,3));
        sistema.addVeiculo(new Moto("MOT01", 20000, "XZ250","BSD15678",partida.MANUAL));
        sistema.addVeiculo(new Onibus("ONI01", 2000000, "XF321","DAS2389",30));

        System.out.println("Valor da diária do Avião AV01: " + sistema.exibirDiaria("AV01"));
        System.out.println("Quantidade de veículos cadastrados: " + sistema.size());

        System.out.println("\nVeículos cadastrados do tipo Carro:");
        List<Veiculo> carros = sistema.listarEmOrdem(Carro.class);
        for (Veiculo veiculo : carros) {
            System.out.println("- " + veiculo.getIdentificacao());
        }

        Veiculo maisCara = sistema.diariaMaisCara();
        System.out.println("\nVeículo com a diária mais cara: " + maisCara.getIdentificacao());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}