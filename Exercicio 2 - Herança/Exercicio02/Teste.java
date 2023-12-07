package Exercicio022;

public class Teste {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();

    cliente.setNome("Marcos");
    cliente.setIdade(23);
    cliente.setSexo("Masculino");
    cliente.setValorDivida(1500.0);
    cliente.setAnoNascimento(2000);



    System.out.println("+==================");
    Gerente gerente = new Gerente();

    gerente.setNome("Fabricio");
    gerente.setIdade(21);
    gerente.setMatricula("20146073");
    gerente.setnomeGerencia("Gerência ABC");
    gerente.setSalario(13000.5);
    gerente.valorInss();



    System.out.println("+==================");
    Vendedor vendedor = new Vendedor();

    vendedor.setNome("Yasmin");
    vendedor.setSalario(15000);
    vendedor.setValorVendas(30000);
    vendedor.setQtdVendas(120);

    System.out.println(cliente);
    System.out.println(gerente);
    System.out.println(vendedor);


    }
}
