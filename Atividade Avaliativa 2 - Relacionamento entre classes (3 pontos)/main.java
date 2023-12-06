public class main {
    public static void main(String[] args) {
        Telefone t1 = new Telefone();
        Telefone t2 = new Telefone();
        Telefone t3 = new Telefone();
        Telefone t4 = new Telefone();
        t1.setTipo("celular");
        t2.setTipo("celular");
        t3.setTipo("celular");
        t4.setTipo("celular");
        t1.setDdd("61");
        t2.setDdd("11");
        t3.setDdd("39");
        t4.setDdd("62");
        t1.setNumero("99254-5288");
        t2.setNumero("98649-0909");
        t3.setNumero("9222-8805");
        t4.setNumero("3021-1800");

        Endereco end1 = new Endereco();
        Endereco end2 = new Endereco();
        Endereco end3 = new Endereco();
        end1.setEstado("SC");
        end1.setCidade("Balneário");
        end1.setRua("Avenida Atlântica");
        end2.setEstado("Goias");
        end2.setCidade("Goiânia");
        end2.setRua("Avenida Anhanguera");
        end3.setEstado("PB");
        end3.setCidade("Recife");
        end3.setRua("Rua do Bom Jesus");

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        a1.setNome("Aluno01");
        a2.setNome("Aluno02");
        a3.setNome("Aluno03");
        a1.setCpf("052-693-171-09");
        a2.setCpf("710-028-121-00");
        a3.setCpf("334-738-873-12");
        a1.setEmail("aluno01@hotmail");
        a2.setEmail("aluno02@hotmail");
        a3.setEmail("aluno03@hotmail");
        a1.setEndereco(end3);
        a2.setEndereco(end2);
        a3.setEndereco(end3);

        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        d1.setNome("Estrutura de dados");
        d2.setNome("Estrutura de banco de dados");

        Curso c1 = new Curso();
        Curso c2 = new Curso();
        c1.setNome("Ciências da Computação");
        c2.setNome("ADS");

        Professor prof1 = new Professor();
        Professor prof2 = new Professor();
        Professor prof3 = new Professor();
        prof1.setNome("Professor01");
        prof1.setTitulacao("Mestre");
        prof1.setSalario(7000);
        prof2.setNome("Professor02");
        prof2.setTitulacao("Especialista");
        prof2.setSalario(5000);
        prof3.setNome("Professor03");
        prof3.setTitulacao("Especialista");
        prof3.setSalario(4500);
        prof1.setCpf("111-222-131-09");
        prof2.setCpf("555-777-166-05");
        prof3.setCpf("888-723-333-32");
        prof1.setEmail("professor01@hotmail");
        prof2.setEmail("professor02@hotmail");
        prof3.setEmail("professor03@hotmail");
        prof1.setEndereco(end1);
        prof2.setEndereco(end2);
        prof3.setEndereco(end3);

        c1.addDisciplinas(d1);
        c1.addDisciplinas(d2);
        c2.addDisciplinas(d1);
        d1.addCursos(c1); 
        d1.addCursos(c2);
        d2.addCursos(c1);

        prof1.setDisciplina(d1);
        prof2.setDisciplina(d1);
        prof3.setDisciplina(d2);
        prof1.addTelefone(t1);
        prof1.addTelefone(t4);
        prof2.addTelefone(t2);
        prof3.addTelefone(t3);

        prof1.addCursos(c1);
        prof2.addCursos(c1);
        prof3.addCursos(c1);
        prof2.addCursos(c2);
        c1.addProfessor(prof1);
        c1.addProfessor(prof2);
        c1.addProfessor(prof3);
        c2.addProfessor(prof2);

        a1.setCurso(c1);
        a2.setCurso(c1);
        a3.setCurso(c2);
        a1.setNota(d1,10);
        a1.setNota(d2,9.5);
        a2.setNota(d1,6.4);
        a2.setNota(d2,7.5);
        a3.setNota(d1,7);
        a1.addTelefone(t1);
        a1.addTelefone(t2);
        a2.addTelefone(t3);
        a3.addTelefone(t4);

        c1.imprimirCurso();
        c2.imprimirCurso();

        a1.imprimir();
        a2.imprimir();
        a3.imprimir();

        prof1.imprimir();
        prof2.imprimir();
        prof3.imprimir();
    }
}
