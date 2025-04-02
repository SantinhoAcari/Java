
import java.util.Scanner;

/*
1.construa um algoritmo (ou se desejar, com codificação em Java) que LEIA, 
ou seja, receba DO USUÁRIO seu nome e 3 (três) valores do tipo real, que correspondam 
as suas notas.

Em seguida o algoritmo deve calcular:
    a.	A Média Aritmética simples;
    b.	A Média Ponderada, com os respectivos pesos: 3, 3 e 4 ;
    c.	Retornar o MAIOR valor entre os 3 digitados;
    d.	Retornar o MENOR valor entre os 3 digitados;
    e.	Retornar se o aluno foi Aprovado, Reprovado ou se está em recuperação.
 */
//Santinho Developer 55-84-99451-4190
public class ProvaDeEdjane {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int notas[] = new int[3];
        String Alunos;
        String provas[] = {"Trabalho.1", "Trabalho.2", "Prova Bimestral"};
        float mediaNota=0;
        int mediaPonderada;
        int maiorNota=0;
        int menorNota=100;
        boolean situaçao;
        
        System.out.println("\n" 
                    + "================©================\n" 
                    + "E S C O L A     ♦    C R U Z E T A\n" 
                    + "   *** Onde vc aprende +++***" +"\n"
                    + "================©================\n"
                    + "professora                   Edjane♦\n\n" );

        System.out.println("Digite o Nome do Aluno:");
        Alunos = scan.nextLine();
        System.out.println("");
        for (int i = 0; i < notas.length; i++) {
            
            System.out.println("Digite a Nota do(a) " + "[ " + provas[i] + " ]" + " do Aluno: " + Alunos);
            notas[i] = scan.nextInt();
            mediaNota+=notas[i];
            if(notas[i]>maiorNota){
                maiorNota=notas[i];
            }
            if(notas[i]<menorNota){
                menorNota=notas[i];
            }
        }            
            
        System.out.println("\n A Média Aritmética das Notas é: "+(mediaNota/3)+"\n"
                + "A MAIOR Nota foi: "+maiorNota+"\n"
                + "A Média Ponderada foi:"+(notas[0]*3+notas[1]*3+notas[2]*4)/10+"\n"
                + "A MENOR Nota foi: "+menorNota+"\n"
        );
    if (mediaNota>=70){
        System.out.println("O Aluno "+Alunos+ " foi Aprovado");
    
    }else{
        System.out.println("O Aluno "+Alunos+ " foi REPROVADO você precisa estudar mais+");
    }
    }
    
}

                
                
       