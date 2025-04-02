/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natal.com.erros;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 1282227687
 */
public class Diversos 
{



    public static void main(String[] args) {

        int col = 4, dp=0, ds=0, i, j;
        int lin = 4;
        int matriz [][] = new int [lin][col];
        Random mix = new Random();
        Scanner scan = new Scanner(System.in);
        
        //recebendo os números da Matriz
        for (i = 0; i<matriz.length; i++)
        {
            for (j = 0; j < matriz[i].length; j++)
            { 
               // System.out.println("Digire o Valor da Matriz Correspondente a Posição: ["+i+" | "+j+"]");
                matriz[i][j] = mix.nextInt(100);
                               
            }
        }//exibindo a Matriz
        for (i = 0; i<matriz.length; i++)
        {
            for (j = 0; j < matriz[i].length; j++)
            { 
                
                if (matriz[i][j]<10)
                {
                    System.out.print(" ["+i+"|"+j+"] "+" "+matriz[i][j]+"\t");
                }else if (matriz[i][j]>=10)
                {
                     System.out.print(" ["+i+"|"+j+"] "+matriz[i][j]+"\t");
                }
            }System.out.println("");
            
            
        }//for()
        System.out.println
                ("A Diogonal Primária é: "+dp+"\n"
                +"A Diagonal Secundária é: "+ds+"\n");
        }
            }
 

    

