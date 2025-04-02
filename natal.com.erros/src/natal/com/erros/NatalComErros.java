package natal.com.erros;

import java.util.Random;
import java.util.Scanner;

//Santinho Developer 55-84-99451-4190
public class NatalComErros {
    
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random misturado = new Random();
        int linha = 4, k, polin = 0, pocol = 0;
        int coluna = 4, dp = 0, maior = 0, menor = 1000;
        int menorlinha = 0, menorcoluna = 0;
        
        
        
        
        
        
        
        
        int matriz[][] = new int[linha][coluna];
      
        int i, j;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {

            }
        }
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                int valor = misturado.nextInt(30);
                matriz[i][j] = valor;
                if (matriz[i][j] < 10) {
                    System.out.print("[" + i + "|" + j + "]  " + " " + matriz[i][j] + "\t\t");

                } else {
                    System.out.print("[" + i + "|" + j + "]  " + matriz[i][j] + "\t\t");
                }

            }
            System.out.println("");

        }//diagonal principal
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    dp += matriz[i][j];
                   
                } else if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    polin = i;
                    pocol = j;
                } else if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    menorlinha = i;
                    menorcoluna = j;
                }

            }

        }
        System.out.println("\n"
                + "Os numeros da Diagonal Principal é: "+(matriz[0][0] +" - "+ matriz[1][1] +" - "+ matriz[2][2] +" - "+ matriz[3][3])+"\n"
                + "Soma da Diagonal Principal é: " + dp + "\n"
                + "Os numeros da Diagonal Secundaria é: "+(matriz[3][0] +" - "+ matriz[2][1] +" - "+ matriz[1][2] +" - "+ matriz[0][3])+"\n"
                + "Soma da Diagonal Secundária é: " + (matriz[3][0] + matriz[2][1] + matriz[1][2] + matriz[0][3]) + "\n"
                + "O maior Valor da Matriz é: " + maior + " e Está na Posição [" + polin + "|" + pocol + "]\n"
                + "O menor Valor da Matriz é: " + menor + " e Está na Posição [" + menorlinha + "|" + menorcoluna + "]\n"
                + "");
        

    

    //  }
    // System.out.println("");
}

}
