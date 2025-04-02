
import java.util.Random;
import java.util.Scanner;

/*
 Com isso, desenvolva um algoritmo EM JAVA que receba do usuário uma Matriz 4x4 e retorne:

A soma de todos os elementos da diagonal principal e a soma de todos os elementos da diagonal secundária.
UTILIZAR LAÇOS DE REPETIÇÕES PARA PERCORRER A MATRIZ E PEGAR OS RESPECTIVOS ELEMENTOS.
O maior e o menor elemento, e suas respectivas posições, dentre os valores que estão acima da diagonal principal;
A soma de todos os elementos da matriz.
 */

//Santinho Developer 55-84-99451-4190
public class questao2 {
    
    
    public static void main(String[] args) {
        int[][] matriz = new int [2][2];
        Scanner scan = new Scanner(System.in);
        Random mistura = new Random();
        int dp=0, i=0, j=0;
        
        
        
        for(i=0; i<matriz.length; i++)
        {
            for(j=0; j<matriz.length; j++)
            {
            System.out.println("Digite os numetos da Matriz da Posição: "+i+" | "+j);
               // System.out.println(matriz[i][j]);
               matriz[i][j]=scan.nextInt();
            }   
        } 
        
        System.out.println("");
        System.out.println(matriz[i][j]);
        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz.length; j++){
                if(i==j){
                    dp+=matriz[i][j];
                }
            
            }
        
        }System.out.println("\n Soma da Diagonal Principal é: "+dp);
        
           
          
            
        }
        
        
   
    
  
    
    
    
    }

