import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cadastro {

    public static void main(String[] args) {
        cadastrarPessoa();
        cadastrarPet();
        cadastrarVeiculo();
    }

    public static void cadastrarPessoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Pessoa");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        // Exibindo os dados cadastrados
        System.out.println("\nDados da Pessoa Cadastrada:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        scanner.close();
    }

    public static void cadastrarPet() {
        JOptionPane.showMessageDialog(null, "Cadastro de Pet");

        String nomePet = JOptionPane.showInputDialog("Nome do Pet:");
        String tipoPet = JOptionPane.showInputDialog("Tipo do Pet:");

        // Exibindo os dados cadastrados
        JOptionPane.showMessageDialog(null,
                "Dados do Pet Cadastrado:\nNome: " + nomePet + "\nTipo: " + tipoPet);
    }

    public static void cadastrarVeiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCadastro de Veículo");
        System.out.print("Marca do Veículo: ");
        String marcaVeiculo = scanner.nextLine();

        System.out.print("Modelo do Veículo: ");
        String modeloVeiculo = scanner.nextLine();

        // Exibindo os dados cadastrados
        System.out.println("\nDados do Veículo Cadastrado:");
        System.out.println("Marca: " + marcaVeiculo);
        System.out.println("Modelo: " + modeloVeiculo);

        scanner.close();
    }
}
