package Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Veiculos> list = new ArrayList<Veiculos>();

        char novoCadastro;
        do {
            
            char op;
            do {
                System.out.print("Carro ou Moto (c/m)? ");
                op = sc.next().charAt(0); 
                if (op != 'c' && op != 'm') {
                    System.out.println("Insira um valor valido!");
                    System.out.println();
                }
            } while (op != 'c' && op != 'm');

            if(op =='c'){
                Carro carro = new Carro(null, 0, 0);
                carro.insertData();
                list.add(carro);
            }else{
                Moto moto = new Moto(null,0,0);
                moto.insertData();
                list.add(moto);
            }

            do {
                System.out.println("Deseja realizar um novo cadastro:(s/n)");
                sc.nextLine();
                novoCadastro = sc.next().charAt(0);
                if (novoCadastro != 's' && novoCadastro != 'n') {
                    System.out.println("Insira um valor valido!");
                    System.out.println();
                }
            } while (novoCadastro != 's' && novoCadastro != 'n');
        }while(novoCadastro == 's');

        System.out.println("+---------------------------------------------------------+" +
                          "\n|           Relatório com as características              |" +
                          "\n|            de cada veículo cadastrado:                  |" +
                           "\n+---------------------------------------------------------+");

        for (int i = 0; i < list.size(); ++i) {
            Veiculos v = list.get(i);

            System.out.print((1 + i) + "# ");
            v.printDados();
            System.out.println();
        }

        double totalPreco = 0;

        System.out.println();
        System.out.println("+=== Levantamento de Veículos(carro e/ou moto): ===+");

        for (Veiculos v : list) {
            totalPreco += v.getPreco();
        }
        System.out.println("Total bruto(antes das atualizações): R$ "+totalPreco);
        System.out.println();

        totalPreco = 0;
        for (Veiculos v : list) {
            if (v instanceof Carro && ((Carro)v).getKm()>100000){
                v.setPreco(v.getPreco() * 0.92);
            }else if(v instanceof Moto && ((Moto)v).getAno()>=2008){
                v.setPreco(v.getPreco() * 1.1);
            }
            totalPreco += v.getPreco();
        }
        System.out.println("Total de preços(pós atualização): R$ "+totalPreco);



    }
}
