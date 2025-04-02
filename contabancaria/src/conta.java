/*
 *  String titular;
    double saldo;
    double deposito;
    double saque;
 */

/**
 *
 * @author 1282227687
 */
public class conta {
    public String titular;
    public double saldo;
    public double deposito;
    public double saque;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDeposito(double deposito) {
       if (this.saldo>=0){
           this.setSaldo(this.getSaldo()+deposito);
       System.out.println("Deposito Realizado com Sucesso: "+deposito+"\nNa conta de :"+this.getTitular()+"\n\n"
               + "Seu Saldo Atual é: "+this.getSaldo()+"\n");
       
       }else{
           System.out.println("Imposivel Depositar + Você pode Doar à Santinho");
       }
            
            
        
    }
        
    public void setSaque(double saque) {
        if (this.saldo>=this.getSaque()){
            this.setSaldo(this.getSaldo()-saque);
            System.out.println("Saque de: "+(saque)+" Realizado com Sucesso \nGaste com Moderação: \n"
                    + "Seu novo Saldo é: R$ "+this.getSaldo()+" Fim da Trasação..... Ok \n");
        }else{
            System.out.println("Impossivel Sacar! ..... Por Favor Verifique Seu Saldo R$>>>");
        }
    }
    public void status2(){
        this.getSaldo();
        System.out.println("♥  Santinho  Developer  ♦ ♦ ♦"+"\n \n   B A N C O  ♦  S A N T I N I\n  Onde seu Dinheiro Rende Mais+++"
                + "\n \n Nome: "+this.titular+ "\n Tem em Dinheiro: "+this.saldo+"\n" );
        
     
     }

    public void status() {
        this.setSaldo(0);
        System.out.println("♥  Santinho  Developer  ♦ ♦ ♦"+"\n \n   B A N C O  ♦  S A N T I N I\n  Onde seu Dinheiro Rende Mais+++"
                + "\n \n Nome: "+this.titular+ "\n Tem em Dinheiro: "+this.saldo+"\n" );
        
     
    }
    
    
}
