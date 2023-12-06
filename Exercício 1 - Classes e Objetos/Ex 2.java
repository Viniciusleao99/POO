/* Ex 2 */
public class Livro {
    
    private String titulo;
    private String autor;
    private int numPaginas;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void imprimirInfo() {
        System.out.println("Informações do Livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numPaginas);
    }

    public static void main(String[] args) {
        
        Livro meuLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);

        meuLivro.imprimirInfo();
    }
}
