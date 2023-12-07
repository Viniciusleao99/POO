package Exercicio02;

public class Vendedor extends Empregado{
    private double valorVendas;
    private int qtdVendas;

    @Override
    public String toString() {
        return "Vendedor{"+"Nome= '"+getNome()+"', Salário= "+getSalario()+", Valor das vendas= "+getValorVendas()+ ", Quantidade de vendas= " + getQtdVendas() +"}";
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
}
