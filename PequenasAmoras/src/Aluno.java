public class Aluno {

    private int idAluno;
    private int idade;
    private String nome;
    private int idResponsavel;

    public Aluno(){

    }

    public Aluno(int idAluno, int idade, String nome, int idResponsavel){
        this.idAluno = idAluno;
        this.idade = idade;
        this.nome = nome;
        this.idResponsavel = idResponsavel;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setIdAluno(int idAluno){
        this.idAluno = idAluno;
    }

    public void setIdResponsavel(int idResponsavel){
        this.idResponsavel = idResponsavel;
    }

    public String getNome (){
        return this.nome;
    }

    public int getIdAluno(){
        return this.idAluno;
    }

    public int getIdResponsavel(){
        return this.idResponsavel;
    }

    public int getIdade(){
        return this.idade;
    }

    @Override
    public String toString(){
        return "ID: "+ this.idAluno +"\nNome: "+ this.nome +"\nID Responsavel: "+ this.idResponsavel;
    }
}
