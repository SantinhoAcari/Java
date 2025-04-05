import java.util.Random;
import java.util.Scanner;

public class Metodos {
    


    public static void inicio(int largura, int altura, String msg) {
        char simbolo = '*';
        int espaco = (largura - msg.length()) / 2;
        for (int s = 0; s < largura; s++) {
            System.out.print(simbolo);

        }
        System.out.println();
        System.out.print(simbolo);
        for (int s = 0; s < espaco - 2; s++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int s = 0; s < espaco; s++) {
            System.out.print(" ");
        }
        System.out.println(simbolo);
        for (int s = 0; s < largura; s++) {
            System.out.print(simbolo);

        }
        System.out.println();

    }

    public static void PreencherMatriz() {
        final int linha = 3;
        final int coluna = 3;
        int somarMatriz = 0, SomarDiagonalPrincipal = 0, somarDiagonalSecundaria = 0;

        int[][] matriz = new int[linha][coluna];
        Scanner receber = new Scanner(System.in);
        Random mix = new Random();

        for (int s = 0; s < linha; s++) {

            for (int S = 0; S < coluna; S++) {
                System.out.print("Digite o " + s + "º Número da Matriz posição [" + s + "] [" + S + "]:");
                matriz[s][S] = mix.nextInt(100);
                System.out.println(" => " + matriz[s][S]);
                somarMatriz =+ matriz[s][S];

            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int s = 0; s < 60; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
        }
        System.out.println(somarMatriz);
        receber.close();

    }

    public static void SomarDiagonalPrincipal(){
        

    }
}

    


