/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vetores;
import java.util.Scanner;


/**
 *
 * @author 1282227687
 */
public class ClasseScanner {
    
    public static void main(String[] args){
        Scanner dignota = new Scanner(System.in);
       
        int[]nota = {1,2,3,4,5,6,7,8,9,10};
               
        
        for(int i=0; i<10; i++) {
            System.out.println(i + nota[i]);
            
        
    }
}
        
}       
        
        
        
      /* for(i=0; i<nota.length; i++){
        System.out.println("Digite sua  "+(i+1)+"ª Nota:");
        nota[i] = dignota.nextInt();
        System.out.println("Sua  " +(i+1)+"ª Nota: "+ " "+ nota[i] + "  foi salva com sucesso");
        System.out.print("------------------------------------------" );

        System.out.println();
        nota.close;
       }
        System.out.println("na posição "+i+"temos a nota"+ nota[i]);
       */
       
