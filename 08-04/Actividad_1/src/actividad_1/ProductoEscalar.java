package actividad_1;

/**
 *
 * @author Alumno
 */
public class ProductoEscalar {

    private double[] vector1;
    
    public ProductoEscalar(double x,double y,double z) {
        this.vector1[0] = x;
        this.vector1[1] = y;
        this.vector1[2] = z;
    }
    
    
    public static double MultiplicacionEscalar (double vec1[],double vec2[]){
    
        double res = 0;
        double temp = 0;
        for (int i = 0; i < 3 ; i++) {
            res = temp;
            res= vec1[i]*vec2[i];
            temp = res;
            
        }
        return res;
        
    }
    
    
    
}
