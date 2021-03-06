package Matricula;

import Aluno.Aluno;
import Curso.Curso;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private LocalDate dataDaMatricula;
    private Date dataDoDia = new Date();


    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return Objects.equals(aluno, o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(LocalDate dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }
}
