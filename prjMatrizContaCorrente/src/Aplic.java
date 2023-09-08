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
        
        int opcao,numConta,i;
        double valorSaque,valorDeposito,saldoInic;
        boolean contaValida;
        
        ContaCorrente[] matConta = new ContaCorrente[3];
        
        for(i=0; i < 3; i++){
            
            System.out.println("Digite o número da conta: ");
            numConta = entrada.nextInt();

            System.out.println("Digite o saldo inicial da conta: ");
            saldoInic = entrada.nextDouble();

            matConta[i] = new ContaCorrente(numConta,saldoInic);
        }
        
        do{
           System.out.println("\n\n1-Realizar um Depósito");
           System.out.println("2-Realizar um Saque");
           System.out.println("3-Consultar Saldo");
           System.out.println("4-Listar Contas");
           System.out.println("5-Sair");
           System.out.println("\n\tDigite a opção: ");
           opcao = entrada.nextInt();
           contaValida = false;
            
           if(opcao == 1){
               System.out.println("Digite o Número da Conta: ");
               numConta = entrada.nextInt();
               
               for(i=0; i < 3; i++){
                   if(numConta == matConta[i].getNumero()){
                       System.out.println("Digite o valor a ser depositado: ");
                       valorDeposito = entrada.nextDouble();
                       matConta[i].depositar(valorDeposito);
                       System.out.println("Depósito na conta de número: " + matConta[i].getNumero() + " " + "no valor de: " + valorDeposito + " " + "realizado com sucesso");
                       contaValida = true;
                       break;
                   } 
                }
               
               if(contaValida == false){
                   System.out.println("Conta não cadastrada");
               }
               
            }else
               if(opcao == 2){
                    System.out.println("Digite o Número da Conta: ");
                    numConta = entrada.nextInt();
                    
                    for(i=0; i < 3; i++){
                        if(numConta == matConta[i].getNumero()){
                            System.out.println("Digite o valor a ser sacado: ");
                            valorSaque = entrada.nextDouble();
                            contaValida = true;
                            
                                if(valorSaque < matConta[i].getSaldo()){
                                    matConta[i].sacar(valorSaque);
                                    System.out.println("Saque na conta de número: " + matConta[i].getNumero() + " " + "no valor de: " + valorSaque + " " + "realizado com sucesso");
                                }else
                                    System.out.println("Saldo Insuficiente");
                        break;
                        }
                    }
                    
                    if (contaValida == false){
                        System.out.println("Conta não cadastrada");
                   }    
               }else
                   if(opcao == 3){
                       System.out.println("Digite o Número da Conta: ");
                       numConta = entrada.nextInt();
                       
                       for(i=0; i < 3; i++){
                           if(numConta == matConta[i].getNumero()){
                               System.out.println("O saldo atual da conta: " + matConta[i].getNumero() + " " + "é de: " + df.format(matConta[i].getSaldo()));
                               contaValida = true;
                               break;
                           }
                       }
                       
                       if (contaValida == false){
                           System.out.println("Conta não cadastrada");  
                       }
                       
                   }else
                       if(opcao == 4){
                           System.out.println("Numero da Conta" + "     " + " Saldo");
                           
                           for(i=0; i < 3; i++){
                               System.out.println("     " + matConta[i].getNumero() + "            " + matConta[i].getSaldo());
                           }
                       }
        }while(opcao < 5);
    } 
}