package org.models;

public abstract class Veiculo {
  protected String identificacao;
  protected double valordecompra;

  public Veiculo(String identificacao,double valordecompra){
      this.identificacao=identificacao;
      this.valordecompra=valordecompra;
  }
    public abstract double calculardiaria();

}
