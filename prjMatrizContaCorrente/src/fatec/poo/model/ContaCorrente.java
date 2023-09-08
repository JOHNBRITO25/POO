package fatec.poo.model;
/**
 *
 * @author John
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int n, double s){   //Construtor
        numero = n;
        saldo = s;
    }
    
    public int getNumero(){
        return(numero);
    }
    
    public double getSaldo(){
        return(saldo);
    }
    
    public void sacar (double valorsaque){
        saldo = saldo - valorsaque;     
    }
    
    public void depositar (double valordeposito){
        saldo = saldo + valordeposito;
    }
    
}
