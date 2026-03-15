package POO_aulasProgramaçãoOrientadaObjeto.SistemaDeSeminario.Domain;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco, Seminario seminario) {
        this.endereco = endereco;
        this.seminario = seminario;
    }

    public void imprimeDados(){
        System.out.println("endereço do seminário: "+this.endereco);
        if (seminario!=null){
            System.out.println("nome do seminario: "+seminario.getNome());
        }
        System.out.println("-------------------------------------------------");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
