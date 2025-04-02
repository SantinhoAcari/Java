
public class movimentacaoConta {

       public static void main(String[] args) {
        
       // conta cc new conta();
        conta c1 = new conta();
        conta c2 = new conta();
        
        
        
       c1.setTitular("Edjane Mikaelly");
        c1.status();
        
        c1.setDeposito(10000);
        c1.getSaldo();
        c1.setSaque(300);
        c1.setDeposito(100);
           System.out.println("=========================================");
        c2.setTitular("Manoel Santos");
        c2.status();
        c2.setDeposito(1);
        c2.getSaldo();
        c2.setSaque(0.33);
        c2.setDeposito(9);
     System.out.println("=============== Conta ==========================");
        c1.status2();
       
    System.out.println("=========================================");
        c2.status2();
        
    
             
        
    }
       
    
}
