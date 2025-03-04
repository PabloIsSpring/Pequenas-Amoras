public class Contrato {

    private int idResponsavel;
    private int valor;
    private int idContrato;
    private String dataValidade;

    public Contrato(){

    }

    public Contrato(int idResponsavel, int valor, int idContrato, String dataValidade){
        this.idResponsavel = idResponsavel;
        this.valor = valor;
        this.idContrato = idContrato;
        this.dataValidade = dataValidade;
    }

    public void setIdResponsavel(int idResponsavel){
        this.idResponsavel = idResponsavel;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setIdContrato(int idContrato){
        this.idContrato = idContrato;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public int getValor(){
        return this.valor;
    }

    public int getIdContrato(){
        return this.idContrato;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
