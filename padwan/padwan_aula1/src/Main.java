import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int menu;       //Lista
        int choice = 0; //Escolher
        Scanner input; //ebtrada

        input = new Scanner(System.in);
        ArrayList<Cliente> correntistas = new ArrayList<>();
        System.out.println("Digite:\n 1 - Para Cadatrar Correntista \n 2 - Excluir Correntista \n 3 - +" +
                "Mostrar Todos os Correntista \n 4 - saída (Exit)\n");
        System.out.print("pode digitar ☺ => ");
        menu = input.nextInt();
        while (menu != 4) {
            switch (menu) {
                case 1:
                    while (choice != 2) {
                        System.out.print("\n Digite seu Nome: aqui ☺ =>");
                        String nome = input.next();
                        System.out.println("\n Digite Sua Idade:\ndigite aqui ☺ =>  ");
                        int idade = input.nextInt();
                        Cliente f = new Cliente(nome, idade);
                        correntistas.add(f);
                        System.out.println("\nCadastrar Outro Correntista:  1: Yes, 2: No.");
                        choice = input.nextInt();
                    }
                    break;
                case 2:
                        System.out.println("\n selecione um Nome do Correntista para Remover: (Excluir) ");
                    for (int sts = 0; sts < correntistas.size(); sts++) {
                        System.out.println(correntistas.get(sts).getNome() + " " + correntistas.get(sts).getIdade());
                    }
                        String removerNome = input.next();
                    for (int sts = 0; sts < correntistas.size(); sts++) {
                        if (correntistas.get(sts).equals(removerNome)) {
                            correntistas.remove(removerNome);
                            System.out.println(correntistas.get(sts).getNome() + " " + correntistas.get(sts).getIdade());
                            System.out.println("Cliente Removido com Sucesso");


                        } else {
                            System.out.println("cliente não encontrado");
                            System.out.println("Verifique qual correntista a ser escruido na lista abaixo");
                            System.out.println(correntistas.get(sts).getNome() + " " + correntistas.get(sts).getIdade());
                        }
                    }

                    break;
                    case 3:

                    for (int sts = 0; sts < correntistas.size(); sts++) {
                        System.out.println(correntistas.get(sts).getNome() + " " + correntistas.get(sts).getIdade());
                    }
                    break;
            }



            menu = input.nextInt();

        }

        System.out.println("Thank you and goodbye!");






       /* Pessoal p1 = new Pessoal();
        Pessoal p2 = new Pessoal("Santinho", 40);


        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());


        ArrayList<Cliente> todosClientes = new ArrayList<>();
        todosClientes.add( new Cliente("santinho", 40, 200.10));
        todosClientes.add( new Cliente("santiago", 42, 2000,18));
        todosClientes.add( new Cliente("Junior", 12, 500,66 ));

        for (int s = 0; s < todosClientes.size(); s++){
            System.out.println(todosClientes.get(s).getNome()+" "+todosClientes.get(s).getSaldo());
            System.out.println(todosClientes.get(s).getNome());
        }*/
    }//main
}//class
