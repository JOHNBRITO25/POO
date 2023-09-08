
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        double p1, p2, t1, t2;
        int ra, opcao;
        
        System.out.println("Digite o RA");
        ra = entrada.nextInt();
        objAluno.SetRA(ra);
        
        System.out.println("Digite a nota da Prova1");
        p1 = entrada.nextDouble();
        objAluno.setNtPrv1(p1);
        
        System.out.println("Digite a nota da Prova2");
        p2 = entrada.nextDouble();
        objAluno.setNtPrv2(p2);
        
        System.out.println("Digite a nota do Trabalho1");
        t1 = entrada.nextDouble();
        objAluno.setNtTrab1(t1);
        
        System.out.println("Digite a nota do Trabalho2");
        t2 = entrada.nextDouble();
        objAluno.setNtTrab2(t2);
        
        do{
           System.out.println("\n\n1-Exibir Notas das Provas/Trabalhos");
           System.out.println("2-Exibir Média dos Trabalhos/Provas");
           System.out.println("3-Exibir Média Final");
           System.out.println("4-Sair");
           System.out.println("\n\tDigite a opção: ");
           opcao = entrada.nextInt();
           
           if(opcao == 1){
               System.out.println("Nota da Prova 1: " + objAluno.getNtPrv1());
               System.out.println("Nota da Prova 2: " + objAluno.getNtPrv2());
               System.out.println("Nota do Trabalho 1: " + objAluno.getNtTrab1());
               System.out.println("Nota do Trabalho 2: " + objAluno.getNtTrab2());
           }else
               if(opcao == 2){
                   System.out.println("Média das Provas: " + objAluno.calcMediaProva() + "\nMédia dos Trabalhos: " +
                           objAluno.calcMediaTrab());
               }else
                   if(opcao == 3){
                       System.out.println("Média Final: " + objAluno.calcMediaFinal());
                       
                       if (objAluno.calcMediaFinal() < 6){
                           System.out.println("Resultado: Reprovado");
                       }else{
                           System.out.println("Resultado: Aprovado");
                       }
                   }   
        }while (opcao < 4);    
    }   
}
