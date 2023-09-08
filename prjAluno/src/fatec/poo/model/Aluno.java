package fatec.poo.model;
/**
 *
 * @author John
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
        
    public void SetRA (int r){
        RA = r;
    }
    public void setNtPrv1(double NtP1) {
        NtPrv1 = NtP1;
    }
    public void setNtPrv2(double NtP2) {
        NtPrv2 = NtP2;
    }
    public void setNtTrab1(double NtT1){
        NtTrab1 = NtT1;
    }
    public void setNtTrab2(double NtT2){
        NtTrab2 = NtT2;
    }
    
    public double getRA(){
        return(RA);
    }
    public double getNtPrv1(){
        return(NtPrv1);
    }
    
    public double getNtPrv2(){
        return(NtPrv2);
    }
    
    public double getNtTrab1(){
        return(NtTrab1);
    }
    public double getNtTrab2(){
        return(NtTrab2);
    }
    
    public double calcMediaProva(){
        return (0.75 *(NtPrv1 + 2 * NtPrv2)/3); 
    }
    public double calcMediaTrab(){
        return (0.25 *(NtTrab1 + NtTrab2)/2);
    }
    public double calcMediaFinal(){
        return (calcMediaProva() + calcMediaTrab());
    }  
}
