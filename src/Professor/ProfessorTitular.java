package Professor;

public class ProfessorTitular extends Professor {
    private String especialidadeDoProfessorTitular;



    public ProfessorTitular(String nome, String sobrenome, Integer codProfessor, String especialidadeDoProfessorTitular) {
       super.setNome(nome);
       super.setSobrenome(sobrenome);
       super.setCodigoDoProfessor(codProfessor);
       this.especialidadeDoProfessorTitular = especialidadeDoProfessorTitular;





    }

    public ProfessorTitular(){

    }

    public String getEspecialidadeDoProfessorTitular() {
        return especialidadeDoProfessorTitular;
    }

    public void setEspecialidadeDoProfessorTitular(String especialidadeDoProfessorTitular) {
        this.especialidadeDoProfessorTitular = especialidadeDoProfessorTitular;
    }







}
