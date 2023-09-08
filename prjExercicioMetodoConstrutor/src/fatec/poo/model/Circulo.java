package fatec.poo.model;
/**
 * @author John
 */
public class Circulo {
    private String unidadeMedida;
    private double raio;

    public Circulo(String uniMed) {
        unidadeMedida = uniMed;
    }
   
    public void setRaio (double r){
        raio = r;
    }
    
    public double getRaio(){
        return(raio);
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
        
    public double calcArea(){
        return(3.1416 * raio);
    }
    
    public double calcPerimetro(){
        return(2 * (3.1416 * raio));
    }
    
    public double calcDiametro(){
        return(2 * raio);
    }
    
        
}
