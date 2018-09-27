package Professor;

import java.util.Objects;

public class Professor {
    private String nome;
    private String sobrenome;
    private Integer tempoDeCasaDoProfessor;
    private Integer codigoDoProfessor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(codigoDoProfessor, professor.codigoDoProfessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDoProfessor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoDeCasaDoProfessor() {
        return tempoDeCasaDoProfessor;
    }

    public void setTempoDeCasaDoProfessor(Integer tempoDeCasaDoProfessor) {
        this.tempoDeCasaDoProfessor = tempoDeCasaDoProfessor;
    }

    public Integer getCodigoDoProfessor() {
        return codigoDoProfessor;
    }

    public void setCodigoDoProfessor(Integer codigoDoProfessor) {
        this.codigoDoProfessor = codigoDoProfessor;
    }
}
