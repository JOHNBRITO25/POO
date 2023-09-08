
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Aplic {
    public static void main(String[] args) {
        Circulo objCirc = new Circulo();
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        
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
                System.out.println("Medida da área: " + objCirc.calcArea());
            }else
                if (opcao == 2){
                    System.out.println("Medida da Perímetro: " + objCirc.calcPerimetro());   
                }else
                    if (opcao == 3){
                        System.out.println("Medida da Diamêtro: " + objCirc.calcDiametro());
                    }
        }while (opcao < 4);    
    }
    
}
