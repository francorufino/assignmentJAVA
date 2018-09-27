package Aluno;

import Curso.Curso;

import java.util.Objects;
import java.util.Scanner;

public class Aluno {
    private String nomeDoAluno;
    private String sobrenomeDoAluno;
    private int codAluno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codAluno == aluno.codAluno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAluno);
    }

    public String consultarCursoMatriculado;


    public Aluno(String nomeDoAluno, String sobrenomeDoAluno, int codAluno) {
        this.nomeDoAluno = nomeDoAluno;
        this.sobrenomeDoAluno = sobrenomeDoAluno;
        this.codAluno = codAluno;
        this.consultarCursoMatriculado = consultarCursoMatriculado;
    }





    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public String getSobrenomeDoAluno() {
        return sobrenomeDoAluno;
    }

    public void setSobrenomeDoAluno(String sobrenomeDoAluno) {
        this.sobrenomeDoAluno = sobrenomeDoAluno;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getConsultarCursoMatriculado() {
        return consultarCursoMatriculado;
    }

    public void setConsultarCursoMatriculado(String consultarCursoMatriculado) {
        this.consultarCursoMatriculado = consultarCursoMatriculado;

    }

}
