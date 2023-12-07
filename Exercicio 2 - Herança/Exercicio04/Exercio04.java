//Exercicio04

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

}

public class Medicamento extends Produto {
    private double dosagem;
    private boolean prescricao;

}

public class Cosmetico extends Produto {
    private String marca;
    private String dataValidade;

}

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;

}

public class Compra {
    private List<Produto> itens;
    private LocalDate data;
    private double total;

}

public class Farmacia {
    private List<Produto> estoque;
    private List<Cliente> clientes;
    private List<Compra> compras;

    public void adicionarProduto(Produto produto) {
        
    }

    public void removerProduto(Produto produto) {
    
    }

    public void realizarCompra(Compra compra) {
       
    }

    public void adicionarCliente(Cliente cliente) {
       
    }

    public void removerCliente(Cliente cliente) {
       
    }
}
