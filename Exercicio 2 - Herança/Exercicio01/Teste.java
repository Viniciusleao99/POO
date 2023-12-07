package Exercicio01;

public class Teste {
    public static void main(String[] args) {
        Peixe p1 = new Peixe();

        p1.setNome("Pirarucu");
        p1.setPeso(4.78);
        p1.setTipoHabitat("Água doce");
        System.out.println(p1);

        System.out.println("+------------------------+");
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Freed");
        cachorro.setPeso(5.7);
        cachorro.setRaca("Shi-tzu");
        System.out.println(cachorro);

    }
}
