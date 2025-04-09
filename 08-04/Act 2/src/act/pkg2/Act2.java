package act.pkg2;

/**
 *
 * @author Alumno
 */

import java.util.ArrayList;
import java.util.Iterator;
public class Act2 {

    
    public static void main(String[] args) {
        
        ArrayList<String> apellidos = new ArrayList<>();
        System.out.println("apellidos esta vacio: " + apellidos.isEmpty());
        apellidos.add("Lopez");
        apellidos.add("Martinez");
        apellidos.add(0, "Alvarez");
        apellidos.add("Garcia");
        System.out.println("Apellidos: " + apellidos);
        System.out.print("Recorrido con for tradicional: ");
        for (int i = 0; i < apellidos.size(); i++) {
            System.out.print(apellidos.get(i) + " ");
        }
        System.out.println();
        System.out.print("Recorrido con for mejorado: ");
        for (String str : apellidos) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.print("Recorrido con iterador: ");
        Iterator<String> it = apellidos.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Martinez está en: " + apellidos.indexOf("Martinez"));
        System.out.println("Dominguez está: " + apellidos.contains("Dominguez"));
        System.out.println("En la posicion 1 se encuentra: " + apellidos.get(1));
        apellidos.set(1, "Rodriguez");
        System.out.println("Lopez fue reemplazado por Rodriguez: " + apellidos);
        apellidos.remove(1);
        System.out.println("Despues de borrar a Rodriguez: " + apellidos);
        apellidos.remove("Alvarez");
        System.out.println("Despues de borrar a Alvarez: " + apellidos);
    }
    
}
