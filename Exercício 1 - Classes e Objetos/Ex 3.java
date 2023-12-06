/* Ex 3 */

public class Fatura {

    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);  
        setPrecoPorItem(precoPorItem);  
    }

    public double getTotalFatura() {
        return Math.max(0.0, quantidade * precoPorItem);  
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = Math.max(0, quantidade);  
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = Math.max(0.0, precoPorItem);  
    }

    
    public static void main(String[] args) {
    
        Fatura minhaFatura = new Fatura("001", "Mouse sem fio", 2, -35.5);

    
        System.out.println("Número da Fatura: " + minhaFatura.getNumero());
        System.out.println("Descrição: " + minhaFatura.getDescricao());
        System.out.println("Quantidade: " + minhaFatura.getQuantidade());
        System.out.println("Preço por Item: $" + minhaFatura.getPrecoPorItem());
        System.out.println("Valor Total da Fatura: $" + minhaFatura.getTotalFatura());
    }
}

/*
Aplicativo FaturaTeste:

 public class FaturaTeste {
    public static void main(String[] args) {
        
        Fatura fatura1 = new Fatura("001", "Mouse sem fio", 2, 35.5);
        Fatura fatura2 = new Fatura("002", "Teclado mecânico", -1, 80.0);
        Fatura fatura3 = new Fatura("003", "Monitor LED", 3, -150.0);

        imprimirInformacoesFatura(fatura1);
        imprimirInformacoesFatura(fatura2);
        imprimirInformacoesFatura(fatura3);
    }

    private static void imprimirInformacoesFatura(Fatura fatura) {
        System.out.println("\nDetalhes da Fatura:");
        System.out.println("Número da Fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por Item: $" + fatura.getPrecoPorItem());
        System.out.println("Valor Total da Fatura: $" + fatura.getTotalFatura());
    }
}
 */