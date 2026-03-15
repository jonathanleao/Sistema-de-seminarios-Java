package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeSeminario.Domain;

public class Seminario {
    private String nome;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public void imprimeDados(){
        System.out.println("nome do seminário: "+this.nome);
        if (alunos!=null){
            for (Aluno aluno: alunos){
                System.out.println("aluno: "+aluno.getNome());
                System.out.println("idade: "+aluno.getIdade());
            }
            if (professor!=null){
                System.out.println("professor: "+professor.getNome());
                System.out.println("especialidade: "+professor.getEspecialidade());
            }
            if (local!=null) {
                System.out.println("local: "+local.getEndereco());

            }
            System.out.println("----------------------------------------------------");
        }
    }


    public Seminario(String nome, Local local) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario(String nome, Aluno[] alunos, Professor professor, Local local) {
        this.nome = nome;
        this.alunos = alunos;
        this.professor = professor;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
