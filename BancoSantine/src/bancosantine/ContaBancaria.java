package bancosantine;

//Santinho Developer 55-84-99451-4190
import java.util.Scanner;


public class ContaBancaria {

    Scanner scan = new Scanner(System.in);

    private int codConta;
    private String titular;
    private double saldo;
    private double sacar;
    private double deposito;
    static int numeroConta = 1;
    int menu = numeroConta;
    String nomeTitularConta;
    float valorDoDeposito;
    float valorSaque;

    public ContaBancaria(String Titular) {
        numeroConta++;
        Titular = scan.nextLine();
        this.titular = Titular;
        this.saldo = 0;
        System.out.println("Conta Criada com Sucesso! \n\n "
                + " Bem Vindo ao ♦ S A N T I N E ♦\n"
                + "      O Banco do Futuro...\n\n"
                + "Cliente: " + menu + "." + this.titular + " Seu Saldo é: R$ " + this.saldo);

    }

    private ContaBancaria(int codconta, String titular, double saldo, double sacar,
            double deposito, int menu, String nomeTitularConta) {
        this.codConta = codconta;
        this.titular = titular;
        this.saldo = saldo;
        this.sacar = sacar;
        this.deposito = deposito;
        this.menu = menu;
        this.nomeTitularConta = nomeTitularConta;

    }

    ContaBancaria(int menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        if (this.saldo >= this.getSacar()) {
            this.setSaldo(this.getSaldo() - sacar);
            System.out.println("Saque de " + sacar + " Realizado com Sucesso!\n"
                    + "Seu Novo Saldo é: " + getSaldo());

        } else {
            System.out.println("Impossivel Sacar! ..... Por Favor Verifique Seu Saldo R$...");
        }

    }

    public double getDeposito() {

        return deposito;
    }

    public void setDeposito(double deposito) {
        System.out.print("Digite o Valor do Depósito: R$ ");
        valorDoDeposito = scan.nextFloat();
        System.out.println("Realizando Saque de... " + valorDoDeposito);
        this.saldo+=valorDoDeposito;
           
        
    }

}
/**
 * System.out.println("Conta Criada com Sucesso!\n" + "Seja Bem Vindo ao S A N T
 * I N E\n" + "O Banco do Futuro...\n\n" + "Cliente: "+this.getTitular()+"\n" +
 * "Seu Saldo é: "+this.getSaldo());
 *
 */
