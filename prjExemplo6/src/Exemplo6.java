/**
 *
 * @author 0030482211034
 */
public class Exemplo6 {
    public static void main(String[] args) {
        double[] tabNum;
        tabNum = new double[5];
        
        for (int x=0; x <= 4; x++){
            tabNum[x] = Math.random() * 100;
            
            System.out.println(tabNum[x]);
        }
        
    }
    
}
