public class Endereco {

    private String cep;
    private int idEndereco;
    private String rua;
    private int numeroCasa;
    private String descricao;

    public Endereco(){
    }

    public Endereco(String cep, int idEndereco, String rua, int numeroCasa, String desc){
        this.cep = cep;
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.descricao = desc;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void setIdEndereco(int idEndereco){
        this.idEndereco = idEndereco;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setNumeroCasa(int numCasa){
        this.numeroCasa = numCasa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCep (){
        return this.cep;
    }

    public int getIdEndereco(){
        return this.idEndereco;
    }

    public String getRua(){
        return this.rua;
    }

    public int getNumeroCasa(){
        return this.numeroCasa;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
