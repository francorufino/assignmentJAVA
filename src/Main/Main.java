package Main;

import Aluno.Aluno;
import Curso.Curso;
import DigitalManager.DigitalManager;
import Professor.Professor;
import Professor.ProfessorTitular;
import Professor.ProfessorAdjunto;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProfessorTitular professorT1 = new ProfessorTitular();
        professorT1.setEspecialidadeDoProfessorTitular("Mobile");
        professorT1.setCodigoDoProfessor(1);
        professorT1.setNome("Fabio");
        professorT1.setSobrenome("Tadashi");
        professorT1.setTempoDeCasaDoProfessor(2);

        ProfessorTitular professorT2 = new ProfessorTitular();
        professorT2.setEspecialidadeDoProfessorTitular("Fullstack");
        professorT2.setCodigoDoProfessor(3);
        professorT2.setNome("Alexandre");
        professorT2.setSobrenome("Gancho");
        professorT2.setTempoDeCasaDoProfessor(3);

        ProfessorTitular professorT3 = new ProfessorTitular();
        professorT3.setNome("Jose");
        professorT3.setSobrenome("Ribeiro");
        professorT3.setCodigoDoProfessor(5);
        professorT3.setTempoDeCasaDoProfessor(3);
        professorT3.setEspecialidadeDoProfessorTitular("Fullstack");

        ProfessorTitular professorT4= new ProfessorTitular();
        professorT4.setEspecialidadeDoProfessorTitular("Mobile");
        professorT4.setTempoDeCasaDoProfessor(3);
        professorT4.setCodigoDoProfessor(6);
        professorT4.setNome("Susan");
        professorT4.setSobrenome("Smith");


        ProfessorAdjunto professorA1 = new ProfessorAdjunto();
        professorA1.setCodigoDoProfessor(2);
        professorA1.setNome("Guilherme");
        professorA1.setSobrenome("Sartori");
        professorA1.setQuantidadeDeHorasDeMonitoria(20);

        ProfessorAdjunto professorA2 = new ProfessorAdjunto();
        professorA2.setCodigoDoProfessor(4);
        professorA2.setNome("Hendy");
        professorA2.setSobrenome("Nice");
        professorA2.setQuantidadeDeHorasDeMonitoria(40);





// registrar 4 cursos
        DigitalManager digitalManager = new DigitalManager();
        digitalManager.registrarCurso("Mobile1", 1010,10);
        digitalManager.registrarCurso("Mobile2", 1020, 10);
        digitalManager.registrarCurso( "Fullstack1", 1030, 10);
        digitalManager.registrarCurso("Fullstack2", 1040, 10);





// alocar um prof titular e um prof adjunto para cada curso
        digitalManager.alocarProfessores(1010, 1, 2);
        digitalManager.alocarProfessores(1030, 3, 4);
        digitalManager.alocarProfessores(1020, 5, 4);
        digitalManager.alocarProfessores(1040, 6, 2);




// matricular 3 alunos
        digitalManager.matricularAluno("Rui", "Souza", 001);
        digitalManager.matricularAluno("Stefanie", "klausy", 002);
        digitalManager.matricularAluno("Thiago", "Goncalves", 003);
        digitalManager.matricularAluno("Lucas", "Prado", 004);
        digitalManager.matricularAluno("Fabiana", "Ota", 005);
        digitalManager.matricularAluno("Andreza","Campbell", 006);
        digitalManager.matricularAluno("Luara", "Ramos", 007);
        digitalManager.matricularAluno("Rodrigo", "Tavares", 8);
                System.out.println("===============================================================================");




// matricular 2 alunos de fullstack
        digitalManager.matricularAlunoEmUmCurso(001, 1030);
        digitalManager.matricularAlunoEmUmCurso(006, 1030);
        digitalManager.matricularAlunoEmUmCurso(006, 1030);


// maticular 2 alunos de android
        digitalManager.matricularAlunoEmUmCurso(003, 1010);
        digitalManager.matricularAlunoEmUmCurso(004, 1010);


// matricular 3 alunos de android
        digitalManager.matricularAlunoEmUmCurso(005, 1020);
        digitalManager.matricularAlunoEmUmCurso(006, 1020);
        digitalManager.matricularAlunoEmUmCurso(006, 1020);


        System.out.println("testes a partir de agora");
        System.out.println();
        System.out.println();

        digitalManager.matricularAlunoEmUmCurso(007, 1030);
        digitalManager.matricularAlunoEmUmCurso(007, 1030);
        digitalManager.matricularAlunoEmUmCurso(006, 1020);
        digitalManager.matricularAlunoEmUmCurso(006, 1020);



        while (true) {
            System.out.println("Digite seu codigo de aluno fornecido no ato da matricula para ver o curso em que voce esta matriculado:");
            int codAlunoDigitado = scanner.nextInt();
            digitalManager.alunoConsultaCurso(codAlunoDigitado);
        }

    }
}
