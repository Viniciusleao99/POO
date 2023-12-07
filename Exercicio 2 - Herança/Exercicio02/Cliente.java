package Exercicio02;

public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascimento;


    @Override
    public String toString() {
        return "Cliente{"+"Nome= '"+getNome()+"', Idade= "+getIdade()+", Sexo= '"+getSexo()+ "', valorDivida= " + getValorDivida() + ", anoNascimento= " + getAnoNascimento() + '}';
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
