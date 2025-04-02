public class Pessoal{
    private String nome;
    private int idade;

    public Pessoal(){

    }//()pessoa
    public Pessoal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }//(string, int)pessoal

    public String getNome(){
        return nome;
    }//()obterNome

    public int getIdade() {
        return idade;
    }//()obterIdade



}//class pessoal
