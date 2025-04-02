/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natal.com.erros;

import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author 1282227687
 */
public class DividirPorZero {
    public static void main(String[] args) {
        
       Scanner digite = new Scanner(System.in);
       boolean  prossiga = true;
       NatalComErros sts = new NatalComErros();
       
        System.out.println(sts.getCourseName());
        System.out.println("\n Por Favor Digite o Nome do Curso: ");
        String curso = digite.next();
        sts.setCourseName(curso);
        System.out.println("\n");
        sts.msn();
        
       
       
       
       /* do{
            try{
            
        
       
        System.out.println("Digite o Dividendo: ");
        int dividendo=digite.nextInt();
          
        
        System.out.println("Digite agora o Divisor");
        int divisor=digite.nextInt();
       // System.out.println(dividendo/divisor);
        //prossiga=false;
        System.out.println(" O Resultado Desta Divisao é:  ("+dividendo +" / "+divisor +") =  "+(dividendo/divisor));
        //prossiga=false;
        }
            catch(InputMismatchException e1){
                System.err.println("Erro Aritmético! A Operação Não Pode ser Realizada (°ʖ°)! Favor Digita Números Inteiros!");
                digite.nextLine();
        }
            catch(Throwable e2){
                System.err.println("Erro de Digitação! ou Deve ser Diferente de 0(zero)");
                digite.nextLine();
                
                }
            finally{
                System.out.println("refaça os calculos");
            }
        } while(prossiga);*/
        
    }
}
    

