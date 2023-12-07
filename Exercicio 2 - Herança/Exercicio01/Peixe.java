package Exercicio01;

public class Peixe extends Animal{
    private String tipoHabitat;

    @Override
    public String toString() {
        return "Peixe{Nome: '"+getNome()+"', Peso: '"+getPeso()+"', tipoHabitat: '" + getTipoHabitat() + "'}";
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
}
