package Exercicio02;

public class Gerente extends Empregado{
    private String nomeGerencia;

    @Override
    public String toString() {
        return "Gerente{"+"Nome= '"+getNome()+"', Idade= "+getIdade()+" , Matricula= '"+getMatricula()+ "', Nome da gerência= '" + getnomeGerencia() + "', Valor do INSS= "+ valorInss() + "}";
    }

    public String getnomeGerencia() {
        return nomeGerencia;
    }

    public void setnomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
}
