/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author 1282227687
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner digite = new Scanner(System.in);
        boolean continuar=true;
      
        try{    
        
        System.out.print("Digite o Dividendo: ");
        num1 = digite.nextInt();
        System.out.print("Agora Digite o Divisor: ");
        num2=digite.nextInt();
        System.out.println("\n O Resultado de: "+"[ "+num1 +"/"+ num2+" ]"+" = "+(num1/num2));
                
    }//fecha chave do try
        catch(InputMismatchException e1){
            System.out.println("Erro Digitação, Por Favor digite Numeros");
         }
        catch(Throwable e2){
            System.out.println("Erro Zero não é Divisor: ");
        }
    }//fecha chave do main
    
}//fecha chave da classe Exceptons
