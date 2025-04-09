package actividad_1;

/**
 *
 * @author Alumno
 */
public class Persona {
    
        String nombre;
        String apellido;
        int dni;
        int edad;
        String email;
               
        public Persona(String nombre, String apellido,int dni,int edad,String emali){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.edad = edad;
            this.email = email;
        }
        
        public String getnombre(){
            return nombre;
        }
        
        public String getapellido(){
            return apellido;
        }
        
        public int getdni(){
            return dni;
        }
        
        public int getedad(){
            return edad;
        }
        
        public String getemail(){
            return email;
        }
}
