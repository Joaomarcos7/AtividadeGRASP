package org.example;

import org.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
        Manager sistema= new Manager();
        sistema.addVeiculo(new Aviao("AV01", 1000000, 500));
        sistema.addVeiculo(new Carro("CAR01", 50000));
        sistema.addVeiculo(new Helicoptero("HEL01", 800000, 4));
        sistema.addVeiculo(new Moto("MOT01", 10000, "elétrico"));
        sistema.addVeiculo(new Onibus("ONI01", 200000, 50));

        System.out.println("Valor da diária do Avião AV01: " + sistema.exibirDiaria("AV01"));
        System.out.println("Quantidade de veículos cadastrados: " + sistema.size());

        System.out.println("\nVeículos cadastrados do tipo Carro:");
        List<Veiculo> carros = sistema.listarEmOrdem(Carro.class);
        for (Veiculo veiculo : carros) {
            System.out.println("- " + veiculo);
        }

        Veiculo maisCara = sistema.diariaMaisCara();
        System.out.println("\nVeículo com a diária mais cara: " + maisCara);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}