package Exercicio01;

public class Cachorro extends Animal{
    private String raca;


    @Override
    public String toString() {
        return "Cachorro{Nome: '"+getNome()+"', Peso: '" +getPeso()+"', Raça: '"+getRaca()+"'}";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
