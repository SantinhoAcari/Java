/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;



        
public class JogoDaVelha extends JFrame{
       
    public static void main(String[] args) {
    String jogo[]= {"Affogaro", "Americano", "Cappuccino", "Correto", "Cortado",
                    "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", 
                    "Marocchino", "Ristretto"};
    String jogada[] = new String[5];
    Scanner scan = new Scanner(System.in);
    int i;
    
    System.arraycopy(jogo, 8, jogada, 0, 5);
     
        System.out.print(java.util.Arrays.toString(jogada)+"\n"+java.util.Arrays.toString(jogo)+"\n");
        for(i=0; i<10; ++i){
        System.out.print(i+", ");
        }
        System.out.println("");
        int v=2;
        int q=3;
        int resultado;
        boolean cond=true;
        resultado=cond ?v :q;
        System.out.println(resultado);
        
        
                
        int bit=0x000f;
        int val=0x2222;
        int nn=0x200a;
        System.out.println(bit ^ nn );
        
    
   
        
    }//public static void main(String[] args)
    
}//public class JogoDaVelha extends JFrame{
