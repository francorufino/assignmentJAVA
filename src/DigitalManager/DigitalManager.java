package DigitalManager;

import Aluno.Aluno;
import Curso.Curso;
import Matricula.Matricula;
import Professor.Professor;
import Professor.ProfessorAdjunto;
import Professor.ProfessorTitular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalManager {

    private List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
    private List<Professor> listaDeProfessor = new ArrayList<Professor>();
    private List<Curso> listaDeCurso = new ArrayList<Curso>();
    private List<Matricula> listaDeMatricula = new ArrayList<Matricula>();


    public void registrarCurso(String nome, Integer codigoDoCurso, Integer quantidadeMaximaDeALunosNoCurso) {
        Curso curso = new Curso(nome, codigoDoCurso, quantidadeMaximaDeALunosNoCurso);
        listaDeCurso.add(curso);
        System.out.println("O curso " + curso.getNome() + " " + curso.getCodigoDoCurso() + " foi registrado com sucesso!");
        System.out.println("===============================================================================");

    }

    public void excluirCurso(Integer codCurso) {
        for (Curso curso : listaDeCurso) {
            if (curso.getCodigoDoCurso() == codCurso) {
                listaDeCurso.remove(codCurso);
                System.out.println("O curso " + curso.getNome() + " " + curso.getCodigoDoCurso() + " foi excluido com sucesso)");
                System.out.println("===============================================================================");
            }

        }

    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codProfessor, Integer quantidadeDeHorasDisponivel) {
        Integer tempoDeCasa = 0;
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codProfessor, quantidadeDeHorasDisponivel);
        listaDeProfessor.add(professorAdjunto);
        System.out.println("O professor adjunto" + professorAdjunto.getNome() + " foi registrado com sucesso!");
        System.out.println("===============================================================================");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codProfessor, String especialidade) {
        Integer tempoDeCasa = 0;
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codProfessor, especialidade);
        listaDeProfessor.add(professorTitular);
        System.out.println("O professor Titular " + professorTitular.getNome() + " foi registrado com sucesso!");
        System.out.println("===============================================================================");
    }

    public void excluirProfessor(Integer codProfessor) {
        for (Professor professor : listaDeProfessor) {
            if (professor.getCodigoDoProfessor() == codProfessor) {
                listaDeProfessor.remove(professor);
                System.out.println("O professor" + professor.getNome() + " " + professor.getCodigoDoProfessor() + " foi excluido com sucesso!");
                System.out.println("===============================================================================");

            }
        }
    }


    public void matricularAluno(String nome, String sobrenome, Integer codAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codAluno);
        listaDeAlunos.add(aluno);
        System.out.println("A matricula do aluno " + aluno.getNomeDoAluno() + " foi realizada com sucesso!");
        System.out.println("===============================================================================");
        System.out.println("===============================================================================");

    }


    public Aluno buscarAlunoPorCodigo(Integer codAluno) {
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getCodAluno() == codAluno) {
                System.out.println("A busca do aluno " + aluno.getNomeDoAluno() + " de cod " + aluno.getCodAluno() + " foi realizada");
                System.out.println("===============================================================================");
                return aluno;
            }
        }
        return null;
    }


    public Curso buscarCursoPorCodigo(Integer codCurso) {
        for (Curso curso : listaDeCurso) {
            if (curso.getCodigoDoCurso().equals(codCurso)) {
                System.out.println("A busca do codigo do curso " + curso.getNome() + " " + curso.getCodigoDoCurso() + " foi realizada com sucesso.");
                System.out.println("===============================================================================");
                return curso;
            }

        }
        return null;
    }


    public Professor buscarProfessorPorCodigo(Integer codProfessor) {
        for (Professor professor : listaDeProfessor) {
            if (professor.getCodigoDoProfessor().equals(codProfessor)) {
                System.out.println("A busca do codigo do professor " + professor.getNome() + " " + professor.getCodigoDoProfessor() + " foi realizada com sucesso!");
                System.out.println("===============================================================================");
                return professor;
            }
        }
        return null;
    }

    public ProfessorTitular buscarProfessorTitular(Integer codProfessor) {
        ProfessorTitular professorTitular = new ProfessorTitular();
        for (Professor umProfessorTitular : listaDeProfessor) {
            if (professorTitular.getCodigoDoProfessor().equals(codProfessor)) {
                professorTitular = (ProfessorTitular) umProfessorTitular;
                System.out.println("O Professor Titular " + professorTitular.getNome() + " foi buscado com sucesso!");
                System.out.println("===============================================================================");
            }
        }
        return professorTitular;
    }


    public ProfessorAdjunto buscarProfessorAdjunto(Integer codProfessor) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();
        for (Professor umProfessorAdjunto : listaDeProfessor) {
            if (professorAdjunto.getCodigoDoProfessor().equals(codProfessor)) {
                professorAdjunto = (ProfessorAdjunto) umProfessorAdjunto;
                System.out.println("O professor Adjunto " + professorAdjunto.getNome() + " foi buscado com sucesso!");
                System.out.println("===============================================================================");
            }
        }
        return professorAdjunto;
    }


    public void matricularAlunoEmUmCurso(Integer codAluno, Integer codCurso) {
        Aluno aluno = buscarAlunoPorCodigo(codAluno);
        Curso curso = buscarCursoPorCodigo(codCurso);
        System.out.println(curso.getCodigoDoCurso());
        if (curso.verificarAlunoMatriculado(aluno)) {
            System.out.println("O aluno " + codAluno + " ja esta matriculado no curso " + codCurso + " e nao pode ser matriculado no mesmo curso duas vezes");
        } else {
            curso.adicionarUmAluno(aluno);
            Matricula matricula = new Matricula(aluno, curso);
            listaDeMatricula.add(matricula);
            System.out.println("*******************************************************************************");
            System.out.println("===============================================================================");

            System.out.println("O aluno " + aluno.getNomeDoAluno() + " foi matriculado no curso " + curso.getNome());
            System.out.println("===============================================================================");
            System.out.println("*******************************************************************************");
        }
    }


    public void alocarProfessores(Integer codCurso, Integer codProfessorTitular, Integer codProfessorAdjunto) {

        Curso curso = buscarCursoPorCodigo(codCurso);
        curso.setProfessorTitular(buscarProfessorTitular(codProfessorTitular));
        curso.setProfessorAdjunto(buscarProfessorAdjunto(codProfessorAdjunto));
        System.out.println("O professor Adjunto de codigo " + codProfessorAdjunto + " foi alocado com sucesso!");
        System.out.println("===============================================================================");
        System.out.println("O professor Titular de codigo " + codProfessorTitular + " foi alocado com sucesso!");
        System.out.println("===============================================================================");
    }

    public void alunoConsultaCurso(Integer codAlunoDigitado) {
        int matriculado = 0;
        for (Matricula umaMatricula : listaDeMatricula) {
            if (umaMatricula.getAluno().getCodAluno() == codAlunoDigitado) {
                String nomeDoCursoAlunoMatriculado = umaMatricula.getCurso().getNome();
                System.out.println("*******************************************************************************");
                System.out.println("Voce esta matriculado no curso " + nomeDoCursoAlunoMatriculado);
                System.out.println("===============================================================================");
                System.out.println("*******************************************************************************");
                matriculado++;
            }

        }
        if (matriculado == 0) {
            System.out.println("Voce nao esta matriculado ainda. Por favor click no link   https://br.digitalhouse.com/?gclid=Cj0KCQjwuafdBRDmARIsAPpBmVUejEeJcJ2uiODYX9VMtvbcmfoV0LIHHFqE8t7ckIJnvogtvXTx-4caAqFAEALw_wcB   e garanta ja sua matricula!");
            System.out.println("=====================================================================================================================================");
        }

    }


    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Professor> getListaDeProfessor() {
        return listaDeProfessor;
    }

    public void setListaDeProfessor(List<Professor> listaDeProfessor) {
        this.listaDeProfessor = listaDeProfessor;
    }

    public List<Curso> getListaDeCurso() {
        return listaDeCurso;
    }

    public void setListaDeCurso(List<Curso> listaDeCurso) {
        this.listaDeCurso = listaDeCurso;
    }

    public List<Matricula> getListaDeMatricula() {
        return listaDeMatricula;
    }

    public void setListaDeMatricula(List<Matricula> listaDeMatricula) {
        this.listaDeMatricula = listaDeMatricula;
    }
}
