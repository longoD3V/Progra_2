package actividad_1;

/**
 *
 * @author Alumno
 */
public class calculadoraconstante {
    public static final double PI = 3.14159;  
    public static int cantidadCalculos = 0;

    public static double areaCirculo(double radio){
        cantidadCalculos++;
        return PI*radio*radio;
    }
    
    public static double areaCirculo(int radio){
        cantidadCalculos++;
        return PI*radio*radio;
    }
    
}
