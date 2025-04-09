/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palitos;

/**
 *
 * @author Alumno
 */
public class PilaDePalitos {

    private int cantidad;

    public PilaDePalitos(int i) {
        cantidad = i;
    }

    public boolean partidaSigue() {
        return cantidad > 1;
    }

    public boolean jugadaGanadora() {
        return cantidad == 1;
    }

    public boolean jugadaPerdedora() {
        return cantidad == 0;
    }

    public String ofrecerQuitar(String nombre) {
        return nombre + ", quedan " + cantidad + " palitos. "
                + "Cuántos retiras (1 a " + (cantidad > 3 ? 3 : cantidad) + ")?";
    }

    public boolean imposibleQuitar(int n) {
        return n < 1 || n > 3 || n > cantidad;
    }

    public void quitar(int n) {
        cantidad -= n;
    }
}
