
package revisao;

// Santinho Developer 55-84-99451-4190

import java.util.Random;
import java.util.Scanner;

public class Revisao {

    
    public static void main(String[] args) {
        
        int [][]matriz=new int[10][10];
        Random numeros = new Random();
        int i, j;
        for (i=0; i<10; i++){
            for(j=0; j<10; j++){
                matriz[i][j]=numeros.nextInt(100);
            }
             
        }
        int maior=0;
        int menor=200;
       
        
        for (i=0; i<10; i++){
            for(j=0; j<10; j++){
                System.out.print(matriz[i][j]+"    "); 
               
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
       /** Scanner scan=new Scanner(System.in);
        
        String nomepais;
        boolean inicio;
        do{
           inicio=true;
            
        System.out.println(""
                + "\n\n\n   ♥ ♦  santinho  developer ♦ ♥\n"
                +"========================================\n"
                + "digite [5] para sair do Apricativo\n"
                + "=======================================\n"
                + "ou \n\n"
                + "======================================\n"
                + "Digite uma letra para ver um País \n"
                + "======================================\n"
                + "para ver o dia da semana correspondente!\n");
        
        nomepais=scan.nextLine();
        switch (nomepais){
            case "B":
                System.out.println("\n"
                        + "********BRAZIL******** ");
                break;
            case "b":
                System.out.println("\n"
                                + "********BRAZIL******** ");
                break;
            case "p":
                System.out.println("\n"
                        + "********PARAGUAI******** ");
                break;
            case "P":
                 System.out.println("PARAGUAI ");
                break;
            case "E":
                 System.out.println("\n"
                         + "ESTADOS UNIDOS");
                break;
            case "e":
                 System.out.println("\n"
                         + "ESTADOS UNIDOS");
                break;
            case "C":
                 System.out.println("\n"
                         + "CANADÁ ");
                break;
            case "c":
                 System.out.println("\n"
                         + "CANADÁ ");
                break;
            case "V":
                 System.out.println("\n"
                         + "VENEZUELA");
                break;
             case "v":
                 System.out.println("\n"
                         + "VENEZUELA");
                break;
            case "U":
                 System.out.println("\n"
                         + "URUGUAI");
                break;
            case "u":
                 System.out.println("\n"
                         + "URUGUAI");
                break;
            case "Z":
                 System.out.println("\n"
                         + "CRUZETA-RN");
                 
                break;
            case "z":
                 System.out.println("\n"
                         + "CRUZETA-RN");
                 
                break;
            default://nao tem break em default
                 System.out.println("\n"
                         + "Erro SO TEM PAISES DA AMERICA LATINA \n"
                         + "NAO TODOS QUE A PROFESSORA NAO DEU MUITO TEMPO");
            
        }
                 
                 
                
        }while(inicio);
        
      **/  
    }
    
}

