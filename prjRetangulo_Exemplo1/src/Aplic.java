
import fatec.poo.model.Retangulo;

/**
 *
 * @author John
 */
public class Aplic {
    public static void main(String[] args) {
        
        Retangulo objRet; //definindo o ponteiro
        
        objRet = new Retangulo(); //instanciação do objeto da classe Retangulo
        
        //mecanismo de passagem de mensagens
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da área do Retangulo: " + objRet.calcArea());
        System.out.println("Medida do perímetro do retângulo: " + objRet.calcPerimetro());
        

    }
    
}
