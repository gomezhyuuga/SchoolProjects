/**
 *
 * @author LUIS EDUARDO Y FERNANDO
 */
public class PruebaVector 
{
    public static void main(String[] args) {
        
        Vector v = new StandardVector(3.0,4.0);
        Vector w = new OtherVector(3.0,4.0);
        System.out.println(v.magnitude());
        System.out.println(w.magnitude());
    }
    
}
