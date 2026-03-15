package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeSeminario.Domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimeDados(){
        System.out.println("nome do professor: "+this.nome);
        System.out.println("especialidade do professor: "+this.especialidade);
        if (seminarios != null){
            System.out.println("SEMINARIOS DISPONIVEIS:");
            for (Seminario seminario: seminarios){
                System.out.println("nome do seminario: "+seminario.getNome());

            }
            System.out.println("----------------------------------------------------");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
