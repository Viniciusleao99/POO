package Exercicio01;

import Exercicio01.Dvd;
import Exercicio01.Midia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Midia> list = new ArrayList<>(); 

        System.out.println("Entre com a quantidade de Mídias: ");
        int qtdMidias = sc.nextInt();

        for (int i = 1; i <= qtdMidias; i++) {

            char op;
            do {
                System.out.print("Mídia #" + i + ":\nDVD ou CD (d/c)? ");
                op= sc.next().charAt(0); 
                if(op != 'd' && op!= 'c') {
                    System.out.println("Insira um valor valido!");
                    System.out.println();
                }
            }while (op != 'd' && op!= 'c');

            if (op == 'd') {
            
                Midia midia = new Dvd(); 
//               Dvd midia = new Dvd();
                midia.inserirDados();
                list.add(midia);
            } else {
                Midia midia = new Cd();
//                Cd midia = new Cd();
                midia.inserirDados();
                list.add(midia);
            }
        }
        System.out.println();
        System.out.println("Mídias cadastradas(Cds e/ou Dvds):\n");

        for(int i=0;i<list.size();++i){
            Midia m = list.get(i);
            System.out.print("Midia #"+ (1 + i) +" ");
            m.printDados();
        }
    }
}
