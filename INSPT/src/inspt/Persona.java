/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inspt;

/**
 *
 * @author Alumno
 */
public class Persona {

        private String nombre = "Pablo";
        private String apellido = "Perez";
        private int edad;
        private int dni = 99999999;

        public Persona(String nombre, String apellido, int edad, int dni) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
        }

        public void ingresarNombre(String nombre) {
            System.out.println("Nombre: " + this.nombre);
        }

        public void ingresarApellido(String apellido) {
            System.out.println("Apellido: " + this.apellido);
        }

        public void ingresarEdad(int edad) {
            this.edad = edad;
        }

        /*public void ingresarEdad (int dni)
    {
        this.dni = dni;
    }*/
    }
