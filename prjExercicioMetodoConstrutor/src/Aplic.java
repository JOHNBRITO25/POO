
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double medRaio;
        int opcao;
        String unidade;
        
        System.out.println("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        Circulo objCirc = new Circulo(unidade); //instanciação do objeto com método construtor
        
        //Montando o círculo
        
        System.out.println("Digite o raio do Círculo: ");
        medRaio = entrada.nextDouble();
        
        objCirc.setRaio(medRaio);
        
        do {
            System.out.println("\n\n1-Consultar área do Círculo");
            System.out.println("2-Consultar perímetro do Círculo");
            System.out.println("3-Consultar a mdedia do diâmetro");
            System.out.println("4-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1) {
                System.out.println("Medida da área: " + objCirc.calcArea()+ " " + objCirc.getUnidadeMedida());
            }else
                if (opcao == 2){
                    System.out.println("Medida do Perímetro: " + objCirc.calcPerimetro()+ " " + objCirc.getUnidadeMedida());  
                }else
                    if (opcao == 3){
                        System.out.println("Medida da Diâmetro: " + objCirc.calcDiametro()+ " " + objCirc.getUnidadeMedida());
                    }
        }while (opcao < 4);    
    }
    
}
