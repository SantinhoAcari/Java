package bancosantine;

//Santinho Developer 55-84-99451-4190
import java.util.Scanner;

public class BancoSantine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int menu;
        String nometitular;
        int segundomenu;
        float valorDoDeposito;
        

        do {
            System.out.println("\n"
                    + "================©================\n"
                    + "B A N C O    ♦    S A N T I N E\n"
                    + " Onde seu Dinheiro Rende Mais++\n"
                    + "================©================\n\n"
                    + "========= MENU  INICIAL =========\n\n"
                    + "[1] - ABRIR CONTA\n"
                    + "[2] - DEPOSITAR $ \n"
                    + "[3] - S A C A R $$\n"
                    + "[4] - S A L D O\n"
                    + "[5] - Sair do Aplicativo\n\n"
                    + "=====================<santinho>==\n");
            System.out.printf("☼ Digite Uma das Opções Acima: ☼=");
            menu = scan.nextInt();
            if (menu == 1) {
                System.out.print("Digite Seu Nome Completo: ");
                nometitular = scan.nextLine();
                ContaBancaria numeroConta = new ContaBancaria(nometitular);
                System.out.println("");
                System.out.print("Digite \n"
                        + "[1]- Para voltar ao Menu\n"
                        + "[5]- Para Sair do Aplicativo");
                segundomenu = scan.nextInt();
            }
                else if(menu == 2) {
                numeroConta.
                                
            }else {
                System.out.println("Erro Você Digitou um Carctere Inválido! ");
                    }
           
        
         
            }while (menu != 5);
        } //fecha bloco do Main

    }//fecha bloco bancosantine
