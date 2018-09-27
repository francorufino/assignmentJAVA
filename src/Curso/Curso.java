package Curso;

import Aluno.Aluno;
import Professor.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    public boolean contains;
    private String nomeDoCurso;
    private Integer codigoDoCurso;
    private Professor professorTitular;
    private Professor professorAdjunto;
    private Integer quantidadeMaximaDeAlunos;
    private List<Aluno> listaDeAlunosMatriculados = new ArrayList<Aluno>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDoCurso, curso.codigoDoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDoCurso);
    }

    public Curso(String nome, Integer codigoDoCurso, Integer quantidadeMaximaDeAlunos) {
        this.nomeDoCurso = nome;
        this.codigoDoCurso = codigoDoCurso;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public Boolean verificarAlunoMatriculado(Aluno aluno) {
        Boolean retorno = false;
        for (Aluno umAluno : listaDeAlunosMatriculados) {
            if (umAluno.equals(aluno)) {
                System.out.println("aluno ja matriculado.");
                retorno = true;
            }

        }
        return retorno;
    }

    public Boolean adicionarUmAluno(Aluno aluno) {
        if (!verificarAlunoMatriculado(aluno)) {
            if (quantidadeMaximaDeAlunos > listaDeAlunosMatriculados.size()) {
                listaDeAlunosMatriculados.add(aluno);
                System.out.println(aluno.getNomeDoAluno() + " sua matricula no curso " + " " + nomeDoCurso
                        + " foi realizada com sucesso! Bons estudos!");
                System.out.println("===============================================================================");
                return true;
            } else {
                System.out.println(aluno.getNomeDoAluno() + " este curso esta sold out e sua matricula nao pōde ser realizada.");
                System.out.println("===============================================================================");
                return false;
            }


        } else {
            System.out.println("O aluno " +aluno.getNomeDoAluno()+" ja esta matriculado nesse curso e nao pode ser matriculado novamente!");
            System.out.println("===============================================================================");
        }
        return false;
    }


        public void excluirAlunoDaListaDeAlunos (Aluno aluno){
            listaDeAlunosMatriculados.remove(aluno);
            System.out.println("O aluno " + aluno.getNomeDoAluno() + " foi excluido com sucesso!");
            System.out.println("===============================================================================");


        }

        public String getNome () {
            return nomeDoCurso;
        }

        public void setNome (String nome){
            this.nomeDoCurso = nome;
        }

        public Integer getCodigoDoCurso () {
            return codigoDoCurso;
        }

        public void setCodigoDoCurso (Integer codigoDoCurso){
            this.codigoDoCurso = codigoDoCurso;
        }

        public Professor getProfessorTitular () {
            return professorTitular;
        }

        public void setProfessorTitular (Professor professorTitular){
            this.professorTitular = professorTitular;
        }

        public Professor getProfessorAdjunto () {
            return professorAdjunto;
        }

        public void setProfessorAdjunto (Professor professorAdjunto){
            this.professorAdjunto = professorAdjunto;
        }

        public Integer getQuantidadeMaximaDeAlunos () {
            return quantidadeMaximaDeAlunos;
        }

        public void setQuantidadeMaximaDeAlunos (Integer quantidadeMaximaDeAlunos){
            this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
        }

        public List<Aluno> getListaDeAlunosMatriculados () {
            return listaDeAlunosMatriculados;
        }

        public void setListaDeAlunosMatriculados (List < Aluno > listaDeAlunosMatriculados) {
            this.listaDeAlunosMatriculados = listaDeAlunosMatriculados;
        }
    }
