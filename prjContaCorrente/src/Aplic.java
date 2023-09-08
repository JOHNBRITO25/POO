import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00"); //
        
        int opcao,numConta;
        double valorSaque,valorDeposito,saldoInic;
        
        System.out.println("Digite o número da conta: ");
        numConta = entrada.nextInt();
        
        System.out.println("Digite o saldo inicial da conta: ");
        saldoInic = entrada.nextDouble();
        
        ContaCorrente objConta = new ContaCorrente (numConta,saldoInic);
        
        do{
           System.out.println("\n\n1-Realizar um Depósito");
           System.out.println("2-Realizar um Saque");
           System.out.println("3-Consultar Saldo");
           System.out.println("4-Sair");
           System.out.println("\n\tDigite a opção: ");
           opcao = entrada.nextInt();
            
           if(opcao == 1){
               System.out.println("Digite o valor a ser depositado: ");
               valorDeposito = entrada.nextDouble();
               objConta.depositar(valorDeposito);
               System.out.println("Depósito na conta de número: " + objConta.getNumero() + " " + "no valor de: " + valorDeposito + " " + "realizado com sucesso");
           }else
               if(opcao == 2){
                   System.out.println("Digite o valor a ser sacado: ");
                   valorSaque = entrada.nextDouble();
                                      
                   if(valorSaque < objConta.getSaldo()){
                       objConta.sacar(valorSaque);
                       System.out.println("Saque na conta de número: " + objConta.getNumero() + " " + "no valor de: " + valorSaque + " " + "realizado com sucesso");
                   }else
                       System.out.println("Saldo Insuficiente");
               }else
                   if(opcao == 3){
                       System.out.println("O saldo atual da conta: " + objConta.getNumero() + " " + "é de: " + df.format(objConta.getSaldo()));
                   }
        }while(opcao < 4);
    } 
}