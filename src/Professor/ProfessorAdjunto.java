package Professor;

public class ProfessorAdjunto extends Professor{
    private Integer quantidadeDeHorasDeMonitoria;
    private Professor professorAdjunto;


    public ProfessorAdjunto(){

    }

    public Professor getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Professor professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer codProfessor, Integer quantidadeDeHorasDeMonitoria) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeDeHorasDeMonitoria() {
        return quantidadeDeHorasDeMonitoria;
    }

    public void setQuantidadeDeHorasDeMonitoria(Integer quantidadeDeHorasDeMonitoria) {
        this.quantidadeDeHorasDeMonitoria = quantidadeDeHorasDeMonitoria;
    }
}
