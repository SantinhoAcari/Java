package sts.jogos.bingo;

import java.util.Random;
import java.util.Scanner;

/*Bingo entre Amigos/

package sts.jogos.bingo;

/**
 *
 * @author santos
 */
public class Bingo {

    public static void main(String[] args) {

        int Bingo[] = new int[75];

        String jogada;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int posicao = 0;

        System.out.println("B I N G O -- entre Amigos\n \nDigite: \n"
                + "S- Para Sortear um Novo Número:\nE- Para Encerrar Sorteio: \n"
                + "Esperando Digitação: ");
        jogada = sc.nextLine();

        while (!jogada.equals("E")) {
            

            int rodada = rd.nextInt(75) + 1;
            System.out.println("O Número Sorteado foi: ???" + rodada + "???");
         
                Bingo[posicao] = rodada;
                posicao++;

            
            for (int i = 0; i < Bingo.length; i++) {
               // System.out.printf("%3d %10d \n", i, Bingo[i]);
               // System.out.printf("%5d %4s %4d \n", i, "=>", Bingo[i]);
                System.out.printf("%2d | ", Bingo[i]);
               // for(int linha=0 ; linha < 3 ; linha++){
              //  for(int coluna = 0; coluna < 3 ; coluna ++){
               //     System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                //    matriz[linha][coluna]=entrada.nextInt();
            }
            

            jogada = sc.nextLine();

        }//whileS

    }//main
}//Bingo
