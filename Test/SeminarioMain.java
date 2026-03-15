package POO_aulasProgramaçãoOrientadaObjeto.SitsemaDeSeminario.Test;

import POO_aulasProgramaçãoOrientadaObjeto.SitsemaDeSeminario.Domain.Local;
import POO_aulasProgramaçãoOrientadaObjeto.SitsemaDeSeminario.Domain.Aluno;
import POO_aulasProgramaçãoOrientadaObjeto.SitsemaDeSeminario.Domain.Professor;
import POO_aulasProgramaçãoOrientadaObjeto.SitsemaDeSeminario.Domain.Seminario;

public class SeminarioMain {
    static void main(String[] args) {
        //Criação de objetos
        Local local = new Local("Escola estadual Isaias Vasconcelos");
        Professor professor = new Professor("jonathan", "Historia");
        Professor professor2 = new Professor("Junior", "Mercado de Trabalho da tecnologia");
        Aluno aluno1 = new Aluno("jonathan jr", 18);
        Aluno aluno2 = new Aluno("Rebecca", 19);
        Aluno aluno3 = new Aluno("Ruthy", 26);
        Seminario seminario1 = new Seminario("A história da Tecnologia", local);

        //Criação das arrays e Associações das classes
        Aluno[] alunos = {aluno1, aluno2,aluno3};
        Seminario[] seminarios = {seminario1};

            for (Aluno aluno : alunos) {
                aluno.setSeminario(seminario1);
            }
        professor.setSeminarios(seminarios);
        professor2.setSeminarios(seminarios);
        seminario1.setAlunos(alunos);
        seminario1.setProfessor(professor);
        local.setSeminario(seminario1);


        // Impressão dos dados

        System.out.println("--- Dados completos seminarios ---");
        seminario1.imprimeDados();

        System.out.println("============================================");
        System.out.println("---  dados dos locais --- ");
        System.out.println("============================================");
        local.imprimeDados();
        System.out.println("============================================");
        System.out.println("--- dados dos professores ---");
        System.out.println("============================================");
        professor.imprimeDados();
        professor2.imprimeDados();
        System.out.println("============================================");
        System.out.println("--- dados dos alunos  ---");
        System.out.println("============================================");
        aluno1.imprimeDados();
        System.out.println("============================================");
        System.out.println("----------------------------------");
        System.out.println("============================================");
        aluno2.imprimeDados();
        System.out.println("============================================");
        System.out.println("-----------------------------------");
        System.out.println("============================================");
        aluno3.imprimeDados();
        System.out.println("============================================");


    }
}
