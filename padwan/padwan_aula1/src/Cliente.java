public class Cliente extends Pessoal {
    private double saldo;

    public Cliente(String nome, int idade, double saldo){
        //construtor da classe base(super classe = pessoal)
        super(nome, idade); //name, age
        this.saldo = saldo;

    }//contrutor(string, int, double)
 public Cliente(String nome, int idade){
        //construtor da classe base(super classe = pessoal)
        super(nome, idade); //name, age

    }//contrutor(string, int)

    public double getSaldo() {
        return saldo;
    }//get saldo

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }//set saldo



}//class cliente
