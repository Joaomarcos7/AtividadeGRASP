package org.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager {
    private List<Veiculo> veiculos;

    public Manager() {
        this.veiculos = new ArrayList<>();
    }

    public double exibirDiaria(String identificacao) throws Exception {
        for (Veiculo v : veiculos) {
            if (v.identificacao.equals(identificacao)) {
                return v.calculardiaria();
            }
        }
        throw new SistemaException("Veículo nao encontrado!");
    }

    public int size() {
        return this.veiculos.size();
    }

    public void addVeiculo(Veiculo v) {
        this.veiculos.add(v);
    }

    public List<Veiculo> listarEmOrdem(Class<? extends Veiculo> tipo) {
        List<Veiculo> veiculosdetipo = new ArrayList<>();
        for (Veiculo v : veiculos) {
            if (tipo.isInstance(v)) {
                veiculosdetipo.add(v);
            }
        }
        veiculosdetipo.sort(Comparator.comparing(v -> v.identificacao));
        return veiculosdetipo;
    }

    public Veiculo diariaMaisCara() throws Exception {
        if (veiculos.isEmpty())
            throw new SistemaException("Não existe nenhum veículo cadastrado");
        Veiculo maiscara = veiculos.get(0);
        double maiorvalor = maiscara.calculardiaria();

        for (Veiculo v : veiculos) {
            double valor = v.calculardiaria();
            if (valor > maiorvalor) {
                maiorvalor = valor;
                maiscara = v;
            }
        }
        return maiscara;
    }

}
