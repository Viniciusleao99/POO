import java.util.List;

public class Telefone {
    private String numero;
    private String tipo;
    private String ddd;

    // getters and setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void imprimir() {
        System.out.println("Número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("DDD: " + ddd);
    }
}

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    // getters and setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void imprimir() {
        System.out.println("Rua: " + rua);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Endereco endereco;

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        endereco.imprimir();
    }
}

public class Aluno extends Pessoa {
    private String matricula;
    private Double notas;
    private String curso;
    private List<Disciplina> disciplinas;

    // getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getNotas() {
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas: " + notas);
        System.out.println("Curso: " + curso);
        // Imprimir disciplinas se necessário
        if (disciplinas != null && !disciplinas.isEmpty()) {
            System.out.println("Disciplinas:");
            for (Disciplina disciplina : disciplinas) {
                System.out.println(" - " + disciplina.getNome());
            }
        }
    }
}

public class Professor extends Pessoa {
    private String titulacao;
    private Double salario;
    private String curso;
    private List<Disciplina> disciplinas;

    // getters and setters
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        System.out.println("Curso: " + curso);
        // Imprimir disciplinas se necessário
        if (disciplinas != null && !disciplinas.isEmpty()) {
            System.out.println("Disciplinas:");
            for (Disciplina disciplina : disciplinas) {
                System.out.println(" - " + disciplina.getNome());
            }
        }
    }
}

public class Curso {
    private String nome;
    private String professor;
    private List<Disciplina> disciplinas;

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void imprimir() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Professor: " + professor);
        // Imprimir disciplinas se necessário
        if (disciplinas != null && !disciplinas.isEmpty()) {
            System.out.println("Disciplinas:");
            for (Disciplina disciplina : disciplinas) {
                System.out.println(" - " + disciplina.getNome());
            }
        }
    }
}

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private Professor professor;

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void imprimir() {
        System.out.println("Nome da Disciplina: " + nome);
        System.out.println("Professor: " + professor.getNome());
        // Imprimir alunos se necessário
        if (alunos != null && !alunos.isEmpty()) {
            System.out.println("Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(" - " + aluno.getNome());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando objetos das classes
        Telefone telefone = new Telefone();
        telefone.setNumero("98564123");
        telefone.setTipo("Celular");
        telefone.setDdd("61");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua da Curtição");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");

        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setCpf("123.456.789-00");
        aluno.setEmail("joao@gmail.com");
        aluno.setTelefone("963254178");
        aluno.setEndereco(endereco);
        aluno.setMatricula("2021001");
        aluno.setNotas(8.5);
        aluno.setCurso("Engenharia de Software");

        Professor professor = new Professor();
        professor.setNome("Prof. Silva");
        professor.setCpf("987.654.321-00");
        professor.setEmail("silva@gmail.com");
        professor.setTelefone("987674152");
        professor.setEndereco(endereco);
        professor.setTitulacao("Doutor");
        professor.setSalario(4000.00);
        professor.setCurso("Engenharia de Software");

        Curso curso = new Curso();
        curso.setNome("Engenharia de Software");
        curso.setProfessor("Prof. Silva");

        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Programação");
        disciplina.setProfessor(professor);

        // Testando relacionamentos
        aluno.setDisciplinas(List.of(disciplina));
        disciplina.setAlunos(List.of(aluno));

        curso.setDisciplinas(List.of(disciplina));
        disciplina.setCursos(List.of(curso));

        // Imprimindo informações
        aluno.imprimir();
        System.out.println("\n---------------------------------------\n");
        professor.imprimir();
        System.out.println("\n---------------------------------------\n");
        curso.imprimir();
        System.out.println("\n---------------------------------------\n");
        disciplina.imprimir();
    }
}
