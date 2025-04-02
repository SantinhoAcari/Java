//Santinho Developer
package minemercadinho;

//55-84-99451-4190♥

import java.text.SimpleDateFormat;
import java.util.Date;

public class MineMercadinho {

    
    public static void main(String[] args) {
        int i = 1;
        
        Date data = new Date();
        SimpleDateFormat dateformatada = new SimpleDateFormat("yMdHm");
        String dataformatada = dateformatada.format(data);
        
        Produtos leite = new Produtos(123, "Leite da Vaca", 40, 3.45f);
        System.out.println
                (" codigo\t|\tDescrição\t|\tQtd\t|\tPreço R$ |\n"
                +"--------|-----------------------|---------------|----------------|\n"
                + leite.getCod_produto()+"\t|\t"+leite.getDescricao()+"\t|\t"+leite.getQuantidade()+"\t|\t"+leite.getPreco()+" \t |\n"
                + "--------|-----------------------|---------------|----------------|\n");
        
        
        //Produtos.leite = new Produtos();
    }//main
    
}//class MineMercadinho
