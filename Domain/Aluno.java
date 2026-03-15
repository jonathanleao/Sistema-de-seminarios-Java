package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeSeminario.Domain;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }
    public void imprimeDados (){
        System.out.println("nome do aluno: "+this.nome);
        System.out.println("idade do aluno: "+this.getIdade());
        if (seminario != null){
            System.out.println("nome do seminario: "+seminario.getNome());

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
