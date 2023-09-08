import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double medRaio;
        int i;
        String unidade; 
        
        //definição de uma matriz de objetos 
        //para classe Circulo
        
        Circulo[] matCirc = new Circulo[10];
        
        for(i=0; i < 10; i++){
            
            System.out.println("Digite a unidade de medida: ");
            unidade = entrada.next();
            
            //instanciação do objeto da classe Circulo
            //e chamada do método construtor
            matCirc[i] = new Circulo(unidade);
          
            //Montando o círculo
            System.out.println("Digite o raio do Círculo: ");
            medRaio = entrada.nextDouble();

            matCirc[i].setRaio(medRaio); //passando para os atributos da classe círculo a medida do raio digitado.
        }
        
        for(i=0; i < 10; i++){
          System.out.println("\n\nObjeto Círculo " + (i+1));
          System.out.println("\nMedida da área: " + df.format(matCirc[i].calcArea())+ " " + matCirc[i].getUnidadeMedida()+ "²");
          System.out.println("Medida do Perímetro: " + df.format(matCirc[i].calcPerimetro())+ " " + matCirc[i].getUnidadeMedida());
          System.out.println("Medida da Diâmetro: " + df.format(matCirc[i].calcDiametro())+ " " + matCirc[i].getUnidadeMedida());
        }
    }   
}
