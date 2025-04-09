/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palitos;

/**
 *
 * @author Alumno
 */
import javax.swing.*;

public class EntradaSalida {

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static String leerCadena(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public static int leerEntero(String mensaje) {
        String strLeida = JOptionPane.showInputDialog(mensaje);
        int iLeido;
        try {
            iLeido = Integer.parseInt(strLeida);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto.\n" + ex);
            iLeido = 0;
        }
        return iLeido;
    }
}
