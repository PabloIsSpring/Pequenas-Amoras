public class Responsavel {

    private String nome;
    private String telefone;
    private Endereco endereco;
    private int idResponsavel;

    public Responsavel(){

    }

    public Responsavel(String nome, String telefone, Endereco endereco, int idResponsavel){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idResponsavel = idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel){
        this.idResponsavel = idResponsavel;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public int getIdResponsavel(){
        return this.idResponsavel;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }
}
