
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        int opcao;
        String unidade;
        
        System.out.println("Digite a Unidade de medida: ");
        unidade = entrada.next();
        
        Retangulo objRet = new Retangulo(unidade); //instanciação do objeto com método construtor
       
        //Montar o retângulo
        System.out.println("Digite a medida da altura do retangulo: ");
        medAlt = entrada.nextDouble();
        
        System.out.println("Digite a medida da base do retangulo: ");
        medBase = entrada.nextDouble();
       
        objRet.setAltura(medAlt);
        objRet.setBase(medBase); 
        
        do{
            System.out.println("\n\n1-Consultar área do Retângulo");
            System.out.println("2-Consultar perímetro do Retângulo");
            System.out.println("3-Consultar diagonal");
            System.out.println("4-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("Medida da área do retângulo: " + objRet.getAltura() + " " + objRet.getUnidadeMedida());
                System.out.println("Medida da base do retângulo: " + objRet.getBase() + " " + objRet.getUnidadeMedida());
                System.out.println("Medida da área: " + objRet.calcArea());
            }else
                if (opcao == 2){
                    System.out.println("\n Medida da altura do retângulo: " + objRet.getAltura()+ " " + objRet.getUnidadeMedida());
                    System.out.println("Medida da base do retâgulo " + objRet.getBase()+ " " + objRet.getUnidadeMedida());
                    System.out.println("Medida do perímetro do retângulo: " + objRet.calcPerimetro()+ " " + objRet.getUnidadeMedida());
                }          
                else
                    if (opcao == 3){
                        System.out.println("\n Medida da altura do retângulo: " + objRet.getAltura()+ " " + objRet.getUnidadeMedida());
                        System.out.println("Medida da base do retâgulo " + objRet.getBase()+ " " + objRet.getUnidadeMedida());
                        System.out.println("Medida da diagonal do retângulo: " + objRet.calcDiagonal()+ " " + objRet.getUnidadeMedida());
                    }  
        }while (opcao < 4);  
    }   
}
