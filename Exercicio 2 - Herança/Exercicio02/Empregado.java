package Exercicio02;

// enunciado não permite ter o método toString na classe Empregado, logo não posso usar SUPER.
public class Empregado extends Pessoa{
    private double salario;
    private String matricula;


    public double valorInss(){
        return getSalario()*0.11;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
