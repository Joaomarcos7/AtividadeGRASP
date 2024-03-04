package org.models;

public abstract class Veiculo {
  protected String identificacao;
  protected double valordecompra;

  public Veiculo(String identificacao,double valordecompra){
      this.identificacao=identificacao;
      this.valordecompra=valordecompra;
  }

  public String getIdentificacao(){
      return this.identificacao;
  }

  public double getValordecompra(){
      return this.valordecompra;
  }
    public abstract double calculardiaria();

}
