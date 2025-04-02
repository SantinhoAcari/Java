//
package agenda;

import java.util.Random;
import java.util.Scanner;

public class Agenda {

    //
    public static void main(String[] args) {

        int B[] = new int[15];
        int I[] = new int[15];
        int N[] = new int[15];
        int G[] = new int[15];
        int O[] = new int[15];
        int jogada = 0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        
        System.out.println("B I N G O -- entre Amigos\n \nDigite: \n"
                + "1 - Para Sortear um Novo Número: \n 2- Para Encerrar Sorteio: \n"
                + "Esperando Digitação: ");
        jogada = sc.nextInt();
         int rodada = rd.nextInt(75) + 1;
        
        System.out.println("***" + rodada+ "***");
 

       
        if (rodada < 16) {
            B[15] = rodada;
        } else if (rodada == 16 && rodada < 31) {
            I[15] = rodada;
        } else if (rodada == 31 && rodada < 46) {
            N[15] = rodada;
        } else if (rodada == 46 && rodada < 61) {
            G[15] = rodada;
        } else if (rodada == 61 && rodada < 75) {
            O[15] = rodada;
        } else if (rodada > 75) {
            System.out.println("Jogue Novamente");
        }
       

    

}//main

}//Agenda
