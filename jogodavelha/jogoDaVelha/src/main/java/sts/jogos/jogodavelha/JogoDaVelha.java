

package sts.jogos.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Santos
 */
public class JogoDaVelha {

    public static void main(String[] args) {
        String jg1, jg2;
        Scanner sc = new Scanner(System.in);
        System.out.print ("*** Jogo Da Velha ***  Santinho \n \n Digite o Nome"
                + " do Jogador_1: ");
        jg1 = sc.nextLine();
        System.out.print ( "\n \n Agora Digite o Nome"
                + " do Jogador_2: ");
        jg2 = sc.nextLine();
        System.out.println("\n Os Jogadores da Rodada São: \n"
                + ""+jg1+"**************"+" x "+jg2);
        
        
    }//main ***
}//public class JogoDaVelha
